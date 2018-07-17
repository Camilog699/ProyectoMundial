package Vistas.VerJugadores;

import Clases.Equipo;
import Vistas.ContJugadores.ContJugadores;
import Vistas.ContJugadores.FrameContJugadores;
import Vistas.Tablero.Tablero;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;


public class VerJugadores {
    public JPanel esp;
    FrameVerJugadores frame;
    FrameContJugadores contJugadoresFrame;
    private JButton españa;
    private JButton iran;
    private JButton marruecos;
    private JButton portugal;
    private JButton backVJ;
    
    public VerJugadores() {
        try {
            esp.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(ImageIO.read(getClass().getResource("../../Img/cursor.png")), new Point(esp.getX(),
                    esp.getY()), "img"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        españa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        marruecos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iran.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        portugal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backVJ.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
        
        
        backVJ.addActionListener(e -> {
            frame = (FrameVerJugadores) SwingUtilities.getWindowAncestor(esp);
            frame.setVisible(false);
            frame.dispose();
        });
    }
    
    
    private void createUIComponents() {
        this.esp = new VerJugadoresPanel();
    }
}
