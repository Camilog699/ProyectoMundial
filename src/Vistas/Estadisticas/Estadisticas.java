package Vistas.Estadisticas;

import Clases.Gol;
import Clases.Juego;
import Clases.Tarjeta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Estadisticas {
    JPanel golesPanel;
    JPanel tarjetasPanel;
    private JTabbedPane tabbedPane1;
    Juego juego;
    public JPanel panel;
    private JScrollPane golesScrollPanel;
    private JScrollPane tarjetasScrollPanel;
    private JScrollPane sustitucionesScrollPanel;
    private JScrollPane esquinasScrollPanel;
    
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
    }
    
    public void actualizarGolesPanel(Gol gol) {
        JLabel jugador = new JLabel(gol.getJ().getNombre());
        JLabel tiempo = new JLabel(gol.getTiempo());
        golesPanel.add(jugador);
        golesPanel.add(tiempo);
    }
    
    public void actualizarTarjetasPanel(Tarjeta tarjeta) {
        JLabel jugador = new JLabel(tarjeta.getJugador().getNombre());
        JLabel tiempo = new JLabel();
        if (tarjeta.isAmarilla()) {
            tiempo.setText("Amarilla");
        } else {
            tiempo.setText("Roja");
        }
        tarjetasPanel.add(jugador);
        tarjetasPanel.add(tiempo);
    }
    
    private void createUIComponents() {
        panel = new EstadisticasPanel();
    }
}
