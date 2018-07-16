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
    private JComboBox EquipoGol;
    private JComboBox JugadorGol;
    private JLabel gol;
    private JButton backSD;
    private JTextField minutoGol;
    private JButton guardarGol;
    private JComboBox JugadorTarjeta;
    private JComboBox comboBox3;
    private JTextField minutoEnElQueTextField;
    private JButton GUARDARESQUINAButton;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JButton amarilla;
    private JButton roja;
    private JComboBox equipoTarjeta;
    Equipo e1;
    Equipo e2;
    FrameSubirDatos frame;
    LinkedList<Gol> golesE1 = new LinkedList<>();
    LinkedList<Gol> golesE2 = new LinkedList<>();

    public SubirDatos() {
        JugadorGol.setPrototypeDisplayValue("Juan Carlos Herranz");
        JugadorTarjeta.setPrototypeDisplayValue("Juan Carlos Herranz");
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
        minutoGol.setHorizontalAlignment(JTextField.CENTER);
        minutoGol.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (minutoGol.getText().equals("Minuto en el que marcó")) {
                    minutoGol.setText("");
                }
            }
        });
        minutoGol.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (minutoGol.getText().equals("")) {
                    minutoGol.setText("Minuto en el que marcó");
                }
            }
        });
        //Ifs para guardar gol
        guardarGol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Objects.equals(EquipoGol.getSelectedItem(), "Seleccione equipo")) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar el quipo al que pertenece el gol");
                } else if (Objects.equals(JugadorGol.getSelectedItem(), "Seleccione jugador")) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar el jugador que hizo el gol");
                } else if (minutoGol.getText().equals("Minuto en el que marcó")) {
                    JOptionPane.showMessageDialog(null, "Digite el minutoGol en el que se marco el gol");
                }
                else {
                    if (Objects.equals(EquipoGol.getSelectedItem(), e1.getNombre())) {
                        for (Jugador jugador : e1.getJugadores()) {
                            if (Objects.equals(jugador.getNombre(), JugadorGol.getSelectedItem())) {
                                golesE1.add(new Gol(minutoGol.getText(), e1, jugador));
                                break;
                            }
                        }
                    }
                    else if(Objects.equals(EquipoGol.getSelectedItem(), e2.getNombre())){
                        for (Jugador jugador : e2.getJugadores()) {
                            if (Objects.equals(jugador.getNombre(), JugadorGol.getSelectedItem())) {
                                golesE2.add(new Gol(minutoGol.getText(), e2, jugador));
                                break;
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null,"Se ha guardado el gol de "
                            + JugadorGol.getSelectedItem());
                }

            }
        });
        //Añadir equipos dinamicamente
        panel.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                frame = (FrameSubirDatos) SwingUtilities.getWindowAncestor(panel);
                EquipoGol.addItem(e1.getNombre());
                EquipoGol.addItem(e2.getNombre());
                equipoTarjeta.addItem(e1.getNombre());
                equipoTarjeta.addItem(e2.getNombre());
            }
        });
        //agregar jugadores dinamicamente en gol
        EquipoGol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(EquipoGol.getSelectedItem().equals("Seleccione equipo"))) {
                    if (Objects.equals(EquipoGol.getSelectedItem(), e1.getNombre())) {
                        JugadorGol.removeAllItems();
                        JugadorGol.addItem("Seleccione jugador");
                        for (Jugador jugador : e1.getJugadores()) {
                            JugadorGol.addItem(jugador.getNombre());
                        }
                        JugadorGol.setEnabled(true);
                    } else {
                        JugadorGol.removeAllItems();
                        JugadorGol.addItem("Seleccione jugador");
                        for (Jugador jugador : e2.getJugadores()) {
                            JugadorGol.addItem(jugador.getNombre());
                        }
                        JugadorGol.setEnabled(true);
                    }
                }
                else JugadorGol.setEnabled(false);
            }
        });
        equipoTarjeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(Objects.equals(equipoTarjeta.getSelectedItem(), "Seleccione equipo"))) {
                    if (Objects.equals(equipoTarjeta.getSelectedItem(), e1.getNombre())) {
                        JugadorTarjeta.removeAllItems();
                        JugadorTarjeta.addItem("Seleccione jugador");
                        for (Jugador jugador : e1.getJugadores()) {
                            JugadorTarjeta.addItem(jugador.getNombre());
                        }
                        JugadorTarjeta.setEnabled(true);
                    } else {
                        JugadorTarjeta.removeAllItems();
                        JugadorTarjeta.addItem("Seleccione jugador");
                        for (Jugador jugador : e2.getJugadores()) {
                            JugadorTarjeta.addItem(jugador.getNombre());
                        }
                        JugadorTarjeta.setEnabled(true);
                    }
                }
                else JugadorTarjeta.setEnabled(false);
            }
        });
        amarilla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    private void createUIComponents(){
        panel = new SubirDatosPanel();
    }
}
