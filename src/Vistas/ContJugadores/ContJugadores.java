package Vistas.ContJugadores;

import Clases.Jugador;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.LinkedList;

public class ContJugadores {
    public JPanel panel;
    private JScrollPane tecsScroll;
    private JTabbedPane tabs;
    private JScrollPane jugsScroll;
    
    public ContJugadores() {
        JPanel jugsPanelScroll = new JPanel();
        JPanel tecsPanelScroll = new JPanel();
        jugsPanelScroll.setLayout(new GridLayout(12, 3));
        jugsPanelScroll.setPreferredSize(new Dimension(600, 3000));
        jugsScroll.setViewportView(jugsPanelScroll);
        jugsScroll.setOpaque(false);
        jugsScroll.getViewport().setOpaque(false);
        jugsScroll.setFont(new javax.swing.plaf.FontUIResource("Dusha V5", Font.PLAIN, 20));
        jugsPanelScroll.setOpaque(false);
        tecsPanelScroll.setLayout(new GridLayout(12, 3));
        tecsPanelScroll.setPreferredSize(new Dimension(600, 3000));
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
                for (Jugador jugador : jugadores) {
                    JPanel jugPanel;
                    JPanel dataPanel = new JPanel(new GridLayout(3, 3));
                    dataPanel.setFont(new Font("Dusha", Font.PLAIN, 12));
                    dataPanel.setOpaque(false);
                    if (jugador.getId().startsWith("02")) {
                        JPanel imgPanel = new JPanel(new GridLayout(1, 0));
                        imgPanel.setOpaque(false);
                        imgPanel.add(new JLabel("", new ImageIcon(getClass().getResource("../../Img/" +
                                jugador.getId() + ".png")), SwingConstants.CENTER));
                        jugPanel = new JPanel(new GridLayout(2, 0));
                        jugPanel.add(imgPanel);
                    } else {
                        jugPanel = new JPanel(new GridLayout(1, 0));
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
                panel.setFocusable(false);
            }
        });
    }
    
    private void createUIComponents() {
        panel = new ContJugadoresPanel();
    }
}
