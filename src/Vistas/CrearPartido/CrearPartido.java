package Vistas.CrearPartido;

import Clases.Equipo;
import Vistas.SubirDatos.FrameSubirDatos;
import Vistas.SubirDatos.SubirDatos;
import Vistas.Tablero.Tablero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.LinkedList;

public class CrearPartido{
    public JPanel panel;
    private JComboBox equipo1;
    private JComboBox equipo2;
    private JLabel vs;
    private JTextField estadio;
    private JTextField horaPartido;
    private JButton iniciarPartido;
    public JFrame subirDatosFrame;
    private String[] nombreEquipos = {};

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
        horaPartido.setHorizontalAlignment(JTextField.CENTER);
        horaPartido.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (horaPartido.getText().equals("Hora del partido")){
                    horaPartido.setText("");
                }
            }
        });
        horaPartido.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (horaPartido.getText().equals("")){
                    horaPartido.setText("Hora del partido");
                }
            }
        });
        iniciarPartido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(equipo1.getSelectedItem().equals(equipo2.getSelectedItem())){
                    JOptionPane.showMessageDialog(null, "Un equipo no puede jugar contra él mismo");
                }
                else {
                    subirDatosFrame = new FrameSubirDatos("Subir datos partido | Mundial Russia 2018");
                    subirDatosFrame.setContentPane(new SubirDatos().panel);
                    subirDatosFrame.pack();
                    subirDatosFrame.setIconImage(Toolkit.getDefaultToolkit().
                            getImage(Tablero.class.getResource("../../Img/ico.png")));
                    subirDatosFrame.setLocationRelativeTo(null);
                    subirDatosFrame.setVisible(true);
                    subirDatosFrame.setResizable(false);
                }
            }
        });

        panel.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                FrameCrearPartido frame = (FrameCrearPartido) SwingUtilities.getWindowAncestor(panel);
                LinkedList<Equipo> equipos = frame.getEquipos();

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
