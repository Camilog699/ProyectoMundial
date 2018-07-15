package Vistas.VerJugadores;

import Clases.Equipo;
import Vistas.ContJugadores.ContJugadores;
import Vistas.ContJugadores.FrameContJugadores;
import Vistas.Tablero.Tablero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VerJugadores {
    public JPanel esp;
    private JButton españa;
    private JButton iran;
    private JButton marruecos;
    private JButton portugal;
    private JButton backVJ;
    FrameVerJugadores frame;

    FrameContJugadores contJugadoresFrame;
    public VerJugadores() {
        españa.addActionListener(e -> {
            FrameVerJugadores frame = (FrameVerJugadores) SwingUtilities.getWindowAncestor(españa);
            for (Equipo equipo : frame.getEquipos()) {
                if (equipo.getNombre().equals("Espana")) {
                    contJugadoresFrame = new FrameContJugadores("Ver jugadores | Mundial Russia 2018", equipo.getJugadores(), equipo.getTecnicos());
                    contJugadoresFrame.setContentPane(new ContJugadores().panel);
                    contJugadoresFrame.pack();
                    contJugadoresFrame.setIconImage(Toolkit.getDefaultToolkit().
                            getImage(Tablero.class.getResource("../../Img/ico.png")));
                    contJugadoresFrame.setLocationRelativeTo(null);
                    contJugadoresFrame.setVisible(true);
                    contJugadoresFrame.setResizable(false);
                    contJugadoresFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                    break;
                }
            }
        });

        iran.addActionListener(e -> {
            FrameVerJugadores frame = (FrameVerJugadores) SwingUtilities.getWindowAncestor(iran);
            for (Equipo equipo : frame.getEquipos()) {
                if (equipo.getNombre().equals("Iran")) {
                    contJugadoresFrame = new FrameContJugadores("Ver jugadores | Mundial Russia 2018", equipo.getJugadores(), equipo.getTecnicos());
                    contJugadoresFrame.setContentPane(new ContJugadores().panel);
                    contJugadoresFrame.pack();
                    contJugadoresFrame.setIconImage(Toolkit.getDefaultToolkit().
                            getImage(Tablero.class.getResource("../../Img/ico.png")));
                    contJugadoresFrame.setLocationRelativeTo(null);
                    contJugadoresFrame.setVisible(true);
                    contJugadoresFrame.setResizable(false);
                    contJugadoresFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                    break;
                }
            }
        });

        portugal.addActionListener(e -> {
            FrameVerJugadores frame = (FrameVerJugadores) SwingUtilities.getWindowAncestor(portugal);
            for (Equipo equipo : frame.getEquipos()) {
                if (equipo.getNombre().equals("Portugal")) {
                    contJugadoresFrame = new FrameContJugadores("Ver jugadores | Mundial Russia 2018", equipo.getJugadores(), equipo.getTecnicos());
                    contJugadoresFrame.setContentPane(new ContJugadores().panel);
                    contJugadoresFrame.pack();
                    contJugadoresFrame.setIconImage(Toolkit.getDefaultToolkit().
                            getImage(Tablero.class.getResource("../../Img/ico.png")));
                    contJugadoresFrame.setLocationRelativeTo(null);
                    contJugadoresFrame.setVisible(true);
                    contJugadoresFrame.setResizable(false);
                    contJugadoresFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                    break;
                }
            }
        });

        marruecos.addActionListener(e -> {
            FrameVerJugadores frame = (FrameVerJugadores) SwingUtilities.getWindowAncestor(marruecos);
            for (Equipo equipo : frame.getEquipos()) {
                if (equipo.getNombre().equals("Marruecos")) {
                    contJugadoresFrame = new FrameContJugadores("Ver jugadores | Mundial Russia 2018", equipo.getJugadores(), equipo.getTecnicos());
                    contJugadoresFrame.setContentPane(new ContJugadores().panel);
                    contJugadoresFrame.pack();
                    contJugadoresFrame.setIconImage(Toolkit.getDefaultToolkit().
                            getImage(Tablero.class.getResource("../../Img/ico.png")));
                    contJugadoresFrame.setLocationRelativeTo(null);
                    contJugadoresFrame.setVisible(true);
                    contJugadoresFrame.setResizable(false);
                    contJugadoresFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                    break;
                }
            }
        });


        backVJ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame = (FrameVerJugadores) SwingUtilities.getWindowAncestor(esp);
                frame.setVisible(false);
                frame.dispose();
            }
        });
    }


    private void createUIComponents() {
        this.esp = new VerJugadoresPanel();
    }
}
