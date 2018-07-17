package Vistas.Estadisticas;

import Clases.Gol;
import Clases.Juego;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Estadisticas {
    JPanel golesPanel;
    private JTabbedPane tabbedPane1;
    Juego juego;
    private JPanel panel;
    private JScrollPane golesScrollPanel;
    private JScrollPane tarjetasScrollPanel;
    private JScrollPane sustitucionesScrollPanel;
    private JScrollPane esquinasScrollPanel;
    
    public Estadisticas() {
        panel.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                FrameEstadisticas frame = (FrameEstadisticas) SwingUtilities.getWindowAncestor(panel);
                juego = frame.getJuego();
                golesPanel = new JPanel(new GridLayout(juego.getGolesE1().size() + juego.getGolesE2().size(), 2));
                golesPanel.setPreferredSize(new Dimension(600, juego.getGolesE1().size() + juego.getGolesE2().size() * 70));
                golesScrollPanel.setViewportView(golesPanel);
                golesScrollPanel.setOpaque(false);
                golesScrollPanel.getViewport().setOpaque(false);
                juego.getGolesE1().forEach(gol -> actualiizarGolesPanel(gol));
                juego.getGolesE2().forEach(gol -> actualiizarGolesPanel(gol));
            }
        });
    }
    
    public void actualiizarGolesPanel(Gol gol) {
        JLabel jugador = new JLabel(gol.getJ().getNombre());
        JLabel tiempo = new JLabel(gol.getTiempo());
        golesPanel.add(jugador);
        golesPanel.add(tiempo);
    }
    
    private void createUIComponents() {
        panel = new EstadisticasPanel();
    }
}
