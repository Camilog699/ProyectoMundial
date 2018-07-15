package Vistas.ContJugadores;

import Clases.Jugador;

import javax.swing.*;
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
                    JPanel jugPanel = new JPanel(new GridLayout(2, 0));
                    JPanel imgPanel = new JPanel(new GridLayout(1, 0));
                    JPanel dataPanel = new JPanel(new GridLayout(2, 3));
                    dataPanel.setFont(new Font("Dusha", Font.PLAIN, 12));
                    jugPanel.setBorder(BorderFactory.createLineBorder(Color.red));
                    jugPanel.setOpaque(false);
                    imgPanel.setOpaque(false);
                    dataPanel.setOpaque(false);
                    if (jugador.getId().startsWith("02")) {
                        imgPanel.add(new JLabel("", new ImageIcon(getClass().getResource("../../Img/" +
                                jugador.getId() + ".png")), SwingConstants.CENTER));
                    }
                    dataPanel.setForeground(Color.WHITE);
                    dataPanel.add(new JLabel(jugador.getId(), SwingConstants.CENTER));
                    dataPanel.add(new JLabel(jugador.getNombre(), SwingConstants.CENTER));
                    dataPanel.add(new JLabel(jugador.getPosicion(), SwingConstants.CENTER));
                    dataPanel.add(new JLabel(String.valueOf(jugador.getDorsal()), SwingConstants.CENTER));
                    dataPanel.add(new JLabel(jugador.getNacimiento(), SwingConstants.CENTER));
                    jugPanel.add(imgPanel);
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
