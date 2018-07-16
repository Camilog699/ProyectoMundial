package Vistas.SubirDatos;

import Clases.Gol;
import Clases.Juego;
import Clases.Jugador;

import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Objects;

public class SubirDatos {
    public JPanel panel;
    private JComboBox<String> EquipoGol;
    private JComboBox<String> JugadorGol;
    private JLabel gol;
    private JButton backSD;
    private JTextField minutoGol;
    private JButton guardarGol;
    private JComboBox<String> JugadorTarjeta;
    private JComboBox comboBox3;
    private JTextField minutoEnElQueTextField;
    private JButton GUARDARESQUINAButton;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JButton amarilla;
    private JButton roja;
    private JComboBox<String> equipoTarjeta;
    private Juego juego;
    private FrameSubirDatos frame;
    
    public SubirDatos() {
        JugadorGol.setPrototypeDisplayValue("Juan Carlos Herranz");
        JugadorTarjeta.setPrototypeDisplayValue("Juan Carlos Herranz");
        panel.setFocusable(true);
        panel.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                frame = (FrameSubirDatos) SwingUtilities.getWindowAncestor(panel);
                juego = frame.getJuego();
            }
        });
        backSD.addActionListener(e -> {
            frame = (FrameSubirDatos) SwingUtilities.getWindowAncestor(panel);
            frame.setVisible(false);
            frame.dispose();
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
        guardarGol.addActionListener(e -> {
            if (Objects.equals(EquipoGol.getSelectedItem(), "Seleccione equipo")) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar el quipo al que pertenece el gol");
            } else if (Objects.equals(JugadorGol.getSelectedItem(), "Seleccione jugador")) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar el jugador que hizo el gol");
            } else if (minutoGol.getText().equals("Minuto en el que marcó")) {
                JOptionPane.showMessageDialog(null, "Digite el minuto en el que se marcó el gol");
            } else {
                if (Objects.equals(EquipoGol.getSelectedItem(), juego.getE1().getNombre())) {
                    for (Jugador jugador : juego.getE1().getJugadores()) {
                        if (Objects.equals(jugador.getNombre(), JugadorGol.getSelectedItem())) {
                            juego.getGolesE1().add(new Gol(minutoGol.getText(), jugador));
                            juego.getE1().setGolesFavor(juego.getE2().getGolesFavor() + 1);
                            juego.getE2().setGolesContra(juego.getE2().getGolesContra() + 1);
                            break;
                        }
                    }
                } else if (Objects.equals(EquipoGol.getSelectedItem(), juego.getE2().getNombre())) {
                    for (Jugador jugador : juego.getE2().getJugadores()) {
                        if (Objects.equals(jugador.getNombre(), JugadorGol.getSelectedItem())) {
                            juego.getGolesE2().add(new Gol(minutoGol.getText(), jugador));
                            juego.getE1().setGolesContra(juego.getE2().getGolesContra() + 1);
                            juego.getE2().setGolesFavor(juego.getE2().getGolesFavor() + 1);
                            break;
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, "Se ha guardado el gol de "
                        + JugadorGol.getSelectedItem());
            }
            
        });
        //Añadir equipos dinamicamente
        panel.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                frame = (FrameSubirDatos) SwingUtilities.getWindowAncestor(panel);
                EquipoGol.addItem(juego.getE1().getNombre());
                EquipoGol.addItem(juego.getE2().getNombre());
                equipoTarjeta.addItem(juego.getE1().getNombre());
                equipoTarjeta.addItem(juego.getE2().getNombre());
            }
        });
        //agregar jugadores dinamicamente en gol
        EquipoGol.addActionListener(e -> {
            if (!(Objects.equals(EquipoGol.getSelectedItem(), "Seleccione equipo"))) {
                if (Objects.equals(EquipoGol.getSelectedItem(), juego.getE1().getNombre())) {
                    JugadorGol.removeAllItems();
                    JugadorGol.addItem("Seleccione jugador");
                    for (Jugador jugador : juego.getE1().getJugadores()) {
                        JugadorGol.addItem(jugador.getNombre());
                    }
                    JugadorGol.setEnabled(true);
                } else {
                    JugadorGol.removeAllItems();
                    JugadorGol.addItem("Seleccione jugador");
                    for (Jugador jugador : juego.getE2().getJugadores()) {
                        JugadorGol.addItem(jugador.getNombre());
                    }
                    JugadorGol.setEnabled(true);
                }
            } else {
                JugadorGol.setEnabled(false);
            }
        });
        equipoTarjeta.addActionListener(e -> {
            if (!(Objects.equals(equipoTarjeta.getSelectedItem(), "Seleccione equipo"))) {
                if (Objects.equals(equipoTarjeta.getSelectedItem(), juego.getE1().getNombre())) {
                    JugadorTarjeta.removeAllItems();
                    JugadorTarjeta.addItem("Seleccione jugador");
                    for (Jugador jugador : juego.getE1().getJugadores()) {
                        JugadorTarjeta.addItem(jugador.getNombre());
                    }
                    JugadorTarjeta.setEnabled(true);
                } else {
                    JugadorTarjeta.removeAllItems();
                    JugadorTarjeta.addItem("Seleccione jugador");
                    for (Jugador jugador : juego.getE2().getJugadores()) {
                        JugadorTarjeta.addItem(jugador.getNombre());
                    }
                    JugadorTarjeta.setEnabled(true);
                }
            } else {
                JugadorTarjeta.setEnabled(false);
            }
        });
        amarilla.addActionListener(e -> {
        
        });
    }
    
    private void createUIComponents() {
        panel = new SubirDatosPanel();
    }
    
    public Juego getJuego() {
        return juego;
    }
    
    public void setJuego(Juego juego) {
        this.juego = juego;
    }
    
    public FrameSubirDatos getFrame() {
        return frame;
    }
    
    public void setFrame(FrameSubirDatos frame) {
        this.frame = frame;
    }
}
