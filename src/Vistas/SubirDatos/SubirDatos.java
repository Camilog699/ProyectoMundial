package Vistas.SubirDatos;

import Clases.Gol;
import Clases.Juego;
import Clases.Jugador;
import Clases.Tarjeta;
import Vistas.Estadisticas.Estadisticas;
import Vistas.Estadisticas.FrameEstadisticas;
import Vistas.Tablero.Tablero;

import javax.swing.*;
import java.awt.*;
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
    private JComboBox<String> jugadorTarjeta;
    private JComboBox equipoEsquina;
    private JTextField minutoEsquina;
    private JButton guardarEsquina;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JButton amarilla;
    private JButton roja;
    private JComboBox<String> equipoTarjeta;
    private JButton finPartido;
    private Juego juego;
    private FrameSubirDatos frame;


    public SubirDatos() {
        JugadorGol.setPrototypeDisplayValue("Juan Carlos Herranz");
        jugadorTarjeta.setPrototypeDisplayValue("Juan Carlos Herranz");
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
                    jugadorTarjeta.removeAllItems();
                    jugadorTarjeta.addItem("Seleccione jugador");
                    for (Jugador jugador : juego.getE1().getJugadores()) {
                        jugadorTarjeta.addItem(jugador.getNombre());
                    }
                } else {
                    jugadorTarjeta.removeAllItems();
                    jugadorTarjeta.addItem("Seleccione jugador");
                    for (Jugador jugador : juego.getE2().getJugadores()) {
                        jugadorTarjeta.addItem(jugador.getNombre());
                    }
                }
                jugadorTarjeta.setEnabled(true);
            } else {
                jugadorTarjeta.setEnabled(false);
            }
        });
        jugadorTarjeta.addActionListener(e -> {
            if (!(Objects.equals(jugadorTarjeta.getSelectedItem(), "Seleccione jugador"))) {
                amarilla.setEnabled(true);
                roja.setEnabled(true);
            } else {
                amarilla.setEnabled(false);
                roja.setEnabled(false);
            }
        });
        //Añadir Amarilla
        amarilla.addActionListener(e -> {
            if (Objects.equals(equipoTarjeta.getSelectedItem(), "Seleccione equipo")) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar el quipo al que pertenece el jugador");
            } else if (Objects.equals(equipoTarjeta.getSelectedItem(), juego.getE1().getNombre())) {
                for (Jugador jugador : juego.getE1().getJugadores()) {
                    if (Objects.equals(jugador.getNombre(), jugadorTarjeta.getSelectedItem())) {
                        juego.getTarjetasE1().add(new Tarjeta(true, jugador));
                        juego.getE1().setCantAmarillas(juego.getE1().getCantAmarillas() + 1);
                        break;
                    }
                }
                JOptionPane.showMessageDialog(null, "Se ha agregado la tarjeta amarrila a "
                        + juego.getTarjetasE1().getLast().getJugador().getNombre());
            } else {
                for (Jugador jugador : juego.getE2().getJugadores()) {
                    if (Objects.equals(jugador.getNombre(), jugadorTarjeta.getSelectedItem())) {
                        juego.getTarjetasE2().add(new Tarjeta(true, jugador));
                        juego.getE2().setCantAmarillas(juego.getE2().getCantAmarillas() + 1);
                        break;
                    }
                }
                JOptionPane.showMessageDialog(null, "Se ha agregado la tarjeta amarrila a "
                        + juego.getTarjetasE2().getLast().getJugador().getNombre());
            }
        });
        //Añadir Roja
        roja.addActionListener(e -> {
            if (Objects.equals(equipoTarjeta.getSelectedItem(), "Seleccione equipo")) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar el quipo al que pertenece el jugador");
            } else if (Objects.equals(equipoTarjeta.getSelectedItem(), juego.getE1().getNombre())) {
                for (Jugador jugador : juego.getE1().getJugadores()) {
                    if (Objects.equals(jugador.getNombre(), jugadorTarjeta.getSelectedItem())) {
                        juego.getTarjetasE1().add(new Tarjeta(true, jugador));
                        juego.getE1().setCantRojas(juego.getE1().getCantRojas() + 1);
                        break;
                    }
                }
                JOptionPane.showMessageDialog(null, "Se ha agregado la tarjeta roja a "
                        + juego.getTarjetasE1().getLast().getJugador().getNombre());
            } else {
                for (Jugador jugador : juego.getE2().getJugadores()) {
                    if (Objects.equals(jugador.getNombre(), jugadorTarjeta.getSelectedItem())) {
                        juego.getTarjetasE2().add(new Tarjeta(true, jugador));
                        juego.getE2().setCantRojas(juego.getE2().getCantRojas() + 1);
                        break;
                    }
                }
                JOptionPane.showMessageDialog(null, "Se ha agregado la tarjeta roja a "
                        + juego.getTarjetasE2().getLast().getJugador().getNombre());
            }
        });
        //Lanzando frame de estadisticas
        finPartido.addActionListener(e -> {
            if (juego.getE1().getGolesFavor() > juego.getE2().getGolesFavor()) {
                juego.getE1().setPartJugados(juego.getE1().getPartJugados() + 1);
                juego.getE1().setPartGanados(juego.getE1().getPartGanados() + 1);
                juego.getE1().setPuntos(juego.getE1().getPuntos() + 3);
                juego.getE2().setPartJugados(juego.getE2().getPartJugados() + 1);
                juego.getE2().setPartPerdidos(juego.getE2().getPartPerdidos() + 1);
            } else if (juego.getE1().getGolesFavor() < juego.getE2().getGolesFavor()) {
                juego.getE2().setPartJugados(juego.getE2().getPartJugados() + 1);
                juego.getE2().setPartGanados(juego.getE2().getPartGanados() + 1);
                juego.getE2().setPuntos(juego.getE2().getPuntos() + 3);
                juego.getE1().setPartJugados(juego.getE1().getPartJugados() + 1);
                juego.getE1().setPartPerdidos(juego.getE1().getPartPerdidos() + 1);
            } else {
                juego.getE1().setPartJugados(juego.getE1().getPartJugados() + 1);
                juego.getE1().setPartEmpatados(juego.getE1().getPartEmpatados() + 1);
                juego.getE1().setPuntos(juego.getE1().getPuntos() + 1);
                juego.getE2().setPartJugados(juego.getE1().getPartJugados() + 1);
                juego.getE2().setPartEmpatados(juego.getE1().getPartEmpatados() + 1);
                juego.getE2().setPuntos(juego.getE2().getPuntos() + 1);
            }

            FrameEstadisticas frameEstadisticas = new FrameEstadisticas("Subir datos partido | Mundial Russia 2018", juego);
            frameEstadisticas.setContentPane(new Estadisticas().panel);
            frameEstadisticas.pack();
            frameEstadisticas.setIconImage(Toolkit.getDefaultToolkit().
                    getImage(Tablero.class.getResource("../../Img/ico.png")));
            frameEstadisticas.setLocationRelativeTo(null);
            frameEstadisticas.setVisible(true);
            frameEstadisticas.setResizable(false);
            frameEstadisticas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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
