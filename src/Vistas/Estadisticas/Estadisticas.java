package Vistas.Estadisticas;

import Clases.Gol;
import Clases.Juego;
import Clases.Tarjeta;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Estadisticas {
    JPanel golesPanel;
    JPanel tarjetasPanel;
    private JTabbedPane tabs;
    Juego juego;
    public JPanel panel;
    private JScrollPane golesScrollPanel;
    private JScrollPane tarjetasScrollPanel;
    private JScrollPane sustitucionesScrollPanel;
    private JScrollPane esquinasScrollPanel;
    private JButton backE;
    private FrameEstadisticas frame;

    public Estadisticas() {
        panel.setFocusable(true);
        panel.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                FrameEstadisticas frame = (FrameEstadisticas) SwingUtilities.getWindowAncestor(panel);
                juego = frame.getJuego();
                golesPanel = new JPanel(new GridLayout(juego.getGolesE1().size() + juego.getGolesE2().size(), 2));
                golesPanel.setPreferredSize(new Dimension(600, juego.getGolesE1().size() + juego.getGolesE2().size() * 70));
                golesPanel.setOpaque(false);
                golesScrollPanel.setViewportView(golesPanel);
                golesScrollPanel.setOpaque(false);
                golesScrollPanel.getViewport().setOpaque(false);
                golesScrollPanel.setFont(new javax.swing.plaf.FontUIResource("Dusha V5", Font.PLAIN, 20));
                juego.getGolesE1().forEach(gol -> actualizarGolesPanel(gol));
                juego.getGolesE2().forEach(gol -> actualizarGolesPanel(gol));
                tarjetasPanel = new JPanel(new GridLayout(juego.getGolesE1().size() + juego.getGolesE2().size(), 2));
                tarjetasPanel.setPreferredSize(new Dimension(600, juego.getGolesE1().size() + juego.getGolesE2().size() * 70));
                tarjetasPanel.setOpaque(false);
                tarjetasScrollPanel.setViewportView(tarjetasPanel);
                tarjetasScrollPanel.setOpaque(false);
                tarjetasScrollPanel.getViewport().setOpaque(false);
                tarjetasScrollPanel.setFont(new javax.swing.plaf.FontUIResource("Dusha V5", Font.PLAIN, 20));
                juego.getTarjetasE1().forEach(tarjeta -> actualizarTarjetasPanel(tarjeta));
                juego.getTarjetasE2().forEach(tarjeta -> actualizarTarjetasPanel(tarjeta));
            }
        });
        backE.addActionListener(e -> {
            frame = (FrameEstadisticas) SwingUtilities.getWindowAncestor(panel);
            frame.setVisible(false);
            frame.dispose();
        });
    }
    
    public void actualizarGolesPanel(Gol gol) {
        JLabel jugador = new JLabel(gol.getJ().getNombre());
        JLabel tiempo = new JLabel(gol.getTiempo());
        jugador.setHorizontalAlignment(SwingConstants.CENTER);
        tiempo.setHorizontalAlignment(SwingConstants.CENTER);
        jugador.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 20));
        tiempo.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 20));
        jugador.setForeground(Color.WHITE);
        tiempo.setForeground(Color.WHITE);
        golesPanel.add(jugador);
        golesPanel.add(tiempo);
    }
    
    public void actualizarTarjetasPanel(Tarjeta tarjeta) {
        JLabel jugador = new JLabel(tarjeta.getJugador().getNombre());
        JLabel tipo = new JLabel();
        jugador.setHorizontalAlignment(SwingConstants.CENTER);
        tipo.setHorizontalAlignment(SwingConstants.CENTER);
        jugador.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 20));
        tipo.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 20));
        jugador.setForeground(Color.WHITE);
        tipo.setForeground(Color.WHITE);
        if (tarjeta.isAmarilla()) {
            tipo.setText("Amarilla");
        } else {
            tipo.setText("Roja");
        }
        tarjetasPanel.add(jugador);
        tarjetasPanel.add(tipo);
    }
    
    private void createUIComponents() {
        panel = new EstadisticasPanel();
    }
}
