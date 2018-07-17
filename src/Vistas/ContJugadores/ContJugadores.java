package Vistas.ContJugadores;

import Clases.CuerpoTecnico;
import Clases.Jugador;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.IOException;
import java.util.LinkedList;

public class ContJugadores {
    public JPanel panel;
    FrameContJugadores frame;
    private JScrollPane tecsScroll;
    private JTabbedPane tabs;
    private JScrollPane jugsScroll;
    private JButton backCJ;
    
    public ContJugadores() {
        try {
            panel.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(ImageIO.read(getClass().getResource("../../Img/cursor.png")), new Point(panel.getX(),
                    panel.getY()), "img"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        JPanel jugsPanelScroll = new JPanel();
        JPanel tecsPanelScroll = new JPanel();
        backCJ.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tabs.setBorder(new EmptyBorder(0, 0, 0, 0));
        jugsPanelScroll.setLayout(new GridLayout(12, 3));
        jugsScroll.setViewportView(jugsPanelScroll);
        jugsScroll.setOpaque(false);
        jugsScroll.getViewport().setOpaque(false);
        jugsScroll.setFont(new javax.swing.plaf.FontUIResource("Dusha V5", Font.PLAIN, 20));
        jugsPanelScroll.setOpaque(false);
        tecsPanelScroll.setLayout(new GridLayout(12, 3));
        tecsPanelScroll.setPreferredSize(new Dimension(600, 1000));
        tecsScroll.setViewportView(tecsPanelScroll);
        tecsScroll.setOpaque(false);
        tecsScroll.getViewport().setOpaque(false);
        tecsPanelScroll.setOpaque(false);
        tabs.setOpaque(false);
        panel.setFocusable(true);
        panel.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                FrameContJugadores frame = (FrameContJugadores) SwingUtilities.getWindowAncestor(panel);
                LinkedList<Jugador> jugadores = frame.getJugadores();
                LinkedList<CuerpoTecnico> tecnicos = frame.getTecnicos();
                for (Jugador jugador : jugadores) {
                    JPanel jugPanel;
                    JPanel dataPanel = new JPanel(new GridLayout(3, 3));
                    dataPanel.setFont(new Font("Dusha", Font.PLAIN, 12));
                    dataPanel.setOpaque(false);
                    if (jugador.getId().startsWith("02")) {
                        jugsPanelScroll.setPreferredSize(new Dimension(600, 3000));
                        JPanel imgPanel = new JPanel(new GridLayout(1, 0));
                        imgPanel.setOpaque(false);
                        imgPanel.add(new JLabel("", new ImageIcon(getClass().getResource("../../Img/" +
                                jugador.getId() + ".png")), SwingConstants.CENTER));
                        jugPanel = new JPanel(new GridLayout(2, 0));
                        jugPanel.add(imgPanel);
                    } else {
                        jugPanel = new JPanel(new GridLayout(1, 0));
                        jugsPanelScroll.setPreferredSize(new Dimension(600, 1500));
                    }
                    jugPanel.setBorder(BorderFactory.createLineBorder(Color.white));
                    jugPanel.setOpaque(false);
                    JLabel idLabel = new JLabel(jugador.getId(), SwingConstants.CENTER);
                    JLabel nombreLabel = new JLabel(jugador.getNombre(), SwingConstants.CENTER);
                    JLabel posicionLabel = new JLabel(jugador.getPosicion(), SwingConstants.CENTER);
                    JLabel dorsalLabel = new JLabel(String.valueOf(jugador.getDorsal()), SwingConstants.CENTER);
                    JLabel nacimientoLabel = new JLabel(jugador.getNacimiento(), SwingConstants.CENTER);
                    idLabel.setForeground(Color.WHITE);
                    nombreLabel.setForeground(Color.WHITE);
                    posicionLabel.setForeground(Color.WHITE);
                    dorsalLabel.setForeground(Color.WHITE);
                    nacimientoLabel.setForeground(Color.WHITE);
                    idLabel.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 15));
                    nombreLabel.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 15));
                    posicionLabel.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 15));
                    dorsalLabel.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 15));
                    nacimientoLabel.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 15));
                    dataPanel.add(idLabel);
                    dataPanel.add(nombreLabel);
                    dataPanel.add(posicionLabel);
                    dataPanel.add(dorsalLabel);
                    dataPanel.add(nacimientoLabel);
                    jugPanel.add(dataPanel);
                    jugsPanelScroll.add(jugPanel);
                }
                tecsScroll.updateUI();
                for (CuerpoTecnico tecnico : tecnicos) {
                    JPanel tecPanel;
                    JPanel dataPanel = new JPanel(new GridLayout(2, 2));
                    dataPanel.setFont(new Font("Dusha", Font.PLAIN, 12));
                    dataPanel.setOpaque(false);
                    tecPanel = new JPanel(new GridLayout(1, 0));
                    tecPanel.setBorder(BorderFactory.createLineBorder(Color.white));
                    tecPanel.setOpaque(false);
                    JLabel nombreLabel = new JLabel(tecnico.getNombre(), SwingConstants.CENTER);
                    JLabel funcionLabel = new JLabel(tecnico.getFuncion(), SwingConstants.CENTER);
                    JLabel paisLabel = new JLabel(tecnico.getPaisNacimiento(), SwingConstants.CENTER);
                    nombreLabel.setForeground(Color.WHITE);
                    funcionLabel.setForeground(Color.WHITE);
                    paisLabel.setForeground(Color.WHITE);
                    nombreLabel.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 15));
                    funcionLabel.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 15));
                    paisLabel.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 15));
                    dataPanel.add(nombreLabel);
                    dataPanel.add(funcionLabel);
                    dataPanel.add(paisLabel);
                    tecPanel.add(dataPanel);
                    tecsPanelScroll.add(tecPanel);
                }
                panel.setFocusable(false);
            }
        });
        backCJ.addActionListener(e -> {
            frame = (FrameContJugadores) SwingUtilities.getWindowAncestor(panel);
            frame.setVisible(false);
            frame.dispose();
        });
    }
    
    private void createUIComponents() {
        panel = new ContJugadoresPanel();
    }
}
