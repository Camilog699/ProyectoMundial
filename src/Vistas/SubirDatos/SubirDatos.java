package Vistas.SubirDatos;

import Clases.Equipo;
import Clases.Gol;
import Clases.Jugador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.LinkedList;
import java.util.Objects;

public class SubirDatos {
    public JPanel panel;
    private JComboBox Equipo;
    private JComboBox Jugador;
    private JLabel gol;
    private JButton backSD;
    private JTextField minuto;
    private JButton guardarGol;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton guardarTarjetasButton;
    private JComboBox comboBox3;
    private JTextField minutoEnElQueTextField;
    private JButton GUARDARESQUINASButton;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    Equipo e1;
    Equipo e2;
    FrameSubirDatos frame;
    LinkedList<Gol> golesE1 = new LinkedList<>();
    LinkedList<Gol> golesE2 = new LinkedList<>();

    public SubirDatos() {
        panel.setFocusable(true);

        panel.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                frame = (FrameSubirDatos) SwingUtilities.getWindowAncestor(panel);
                e1 = frame.e1;
                e2 = frame.e2;
            }
        });
        backSD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame = (FrameSubirDatos) SwingUtilities.getWindowAncestor(panel);
                frame.setVisible(false);
                frame.dispose();
            }
        });
        minuto.setHorizontalAlignment(JTextField.CENTER);
        minuto.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (minuto.getText().equals("Minuto en el que marcó")){
                    minuto.setText("");
                }
            }
        });
        minuto.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (minuto.getText().equals("")){
                    minuto.setText("Minuto en el que marcó");
                }
            }
        });
       /*   guardarGol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              if (Objects.equals(Equipo.getSelectedItem(), "Seleccione equipo")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar el quipo al que pertenece el gol");
                }
                else if (Objects.equals(Jugador.getSelectedItem(), "Seleccione jugador")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar el jugador que hizo el gol");
                }
                else if(minuto.getText().equals("Minuto en el que marcó")){
                    JOptionPane.showMessageDialog(null,"Digite el minuto en el que se marco el gol");
                }
                else{
                    if(Objects.equals(Equipo.getSelectedItem(), e1.getNombre())){
                        for (Jugador jugador:e1.getJugadores()) {
                            if (jugador.getNombre().equals())
                        }
                    }
                }
            }
        });*/
    }

    private void createUIComponents() {
        panel = new SubirDatosPanel();

    }
}
