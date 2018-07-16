package Vistas.CrearPartido;

import Clases.Equipo;
import Clases.Juego;
import Vistas.SubirDatos.FrameSubirDatos;
import Vistas.SubirDatos.SubirDatos;
import Vistas.Tablero.Tablero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.LinkedList;
import java.util.Objects;

public class CrearPartido{
    public JPanel panel;
    private JComboBox equipo1;
    private JComboBox equipo2;
    private JLabel vs;
    private JTextField estadio;
    private JTextField fechaPartido;
    private JButton iniciarPartido;
    private JButton button1;
    public JFrame subirDatosFrame;
    LinkedList<Equipo> equipos;
    Equipo e1;
    Equipo e2;
    FrameCrearPartido frame;
    Juego partido;
    private JButton backCP;

    public CrearPartido() {
        panel.setFocusable(true);
        estadio.setHorizontalAlignment(JTextField.CENTER);
        estadio.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (estadio.getText().equals("Estadio")){
                    estadio.setText("");
                }
            }
        });
        estadio.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (estadio.getText().equals("")){
                    estadio.setText("Estadio");
                }
            }
        });
        fechaPartido.setHorizontalAlignment(JTextField.CENTER);
        fechaPartido.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (fechaPartido.getText().equals("DD/MM")){
                    fechaPartido.setText("");
                }
            }
        });
        fechaPartido.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (fechaPartido.getText().equals("")){
                    fechaPartido.setText("DD/MM");
                }
            }
        });
        iniciarPartido.addActionListener(e -> {
            if((Objects.equals(equipo1.getSelectedItem(), "Seleccione equipo") ||
                    (Objects.equals(equipo2.getSelectedItem(), "Seleccione equipo"))) ||
                    (Objects.equals(estadio.getText(), "Estadio")) ||
                    (Objects.equals(fechaPartido.getText(), "DD/MM"))){
                JOptionPane.showMessageDialog(null,"Por favor complete todos los campos");

            }
            else{
                if (equipo1.getSelectedItem().equals(equipo2.getSelectedItem())) {
                    JOptionPane.showMessageDialog(null, "Un equipo no puede jugar contra él mismo");
                } else {
                    for (Equipo equipo : equipos) {
                        if (equipo.getNombre().equals(equipo1.getSelectedItem())){
                            e1 = equipo;
                        }
                        if (equipo.getNombre().equals(equipo2.getSelectedItem())){
                            e2 = equipo;
                        }
                    }
                    Juego partido = new Juego(e1, e2, fechaPartido.getText(), estadio.getText());
                    subirDatosFrame = new FrameSubirDatos("Subir datos partido | Mundial Russia 2018", partido);
                    subirDatosFrame.setContentPane(new SubirDatos().panel);
                    subirDatosFrame.pack();
                    subirDatosFrame.setIconImage(Toolkit.getDefaultToolkit().
                            getImage(Tablero.class.getResource("../../Img/ico.png")));
                    subirDatosFrame.setLocationRelativeTo(null);
                    subirDatosFrame.setVisible(true);
                    subirDatosFrame.setResizable(false);
                    subirDatosFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });

        backCP.addActionListener(e -> {
            frame = (FrameCrearPartido) SwingUtilities.getWindowAncestor(panel);
            frame.setVisible(false);
            frame.dispose();
        });

        panel.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                FrameCrearPartido frame = (FrameCrearPartido) SwingUtilities.getWindowAncestor(panel);
                equipos = frame.getEquipos();
                for (Equipo equipo : equipos) {
                    equipo1.addItem(equipo.getNombre());
                    equipo2.addItem(equipo.getNombre());
                }
            }
        });
    }

    private void createUIComponents() {
        panel = new CrearPartidoPanel();

    }
}
