package Vistas.Estadisticas;

import Clases.*;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Estadisticas {
    JPanel golesPanel;
    JPanel tarjetasPanel;
    JPanel sustitucionesPanel;
    JPanel esquinasPanel;
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
                sustitucionesPanel = new JPanel(new GridLayout(juego.getGolesE1().size() + juego.getGolesE2().size(), 4));
                sustitucionesPanel.setPreferredSize(new Dimension(600, juego.getGolesE1().size() + juego.getGolesE2().size() * 70));
                sustitucionesPanel.setOpaque(false);
                sustitucionesScrollPanel.setViewportView(sustitucionesPanel);
                sustitucionesScrollPanel.setOpaque(false);
                sustitucionesScrollPanel.getViewport().setOpaque(false);
                sustitucionesScrollPanel.setFont(new javax.swing.plaf.FontUIResource("Dusha V5", Font.PLAIN, 20));
                JLabel titEquipo = new JLabel("Equipo");
                JLabel titIn = new JLabel("Entra");
                JLabel titOut = new JLabel("Sale");
                JLabel titTiempo = new JLabel("Tiempo");
                titEquipo.setHorizontalAlignment(SwingConstants.CENTER);
                titIn.setHorizontalAlignment(SwingConstants.CENTER);
                titOut.setHorizontalAlignment(SwingConstants.CENTER);
                titTiempo.setHorizontalAlignment(SwingConstants.CENTER);
                titEquipo.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 20));
                titIn.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 20));
                titOut.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 20));
                titTiempo.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 20));
                titEquipo.setForeground(Color.WHITE);
                titIn.setForeground(Color.WHITE);
                titOut.setForeground(Color.WHITE);
                titTiempo.setForeground(Color.WHITE);
                sustitucionesPanel.add(titEquipo);
                sustitucionesPanel.add(titIn);
                sustitucionesPanel.add(titOut);
                sustitucionesPanel.add(titTiempo);
                juego.getCambiosE1().forEach(cambio -> actualizarSustitucionesPanel(cambio, juego.getE1()));
                juego.getCambiosE2().forEach(cambio -> actualizarSustitucionesPanel(cambio, juego.getE2()));
                esquinasPanel = new JPanel(new GridLayout(juego.getGolesE1().size() + juego.getGolesE2().size(), 2));
                esquinasPanel.setPreferredSize(new Dimension(600, juego.getGolesE1().size() + juego.getGolesE2().size() * 70));
                esquinasPanel.setOpaque(false);
                esquinasScrollPanel.setViewportView(esquinasPanel);
                esquinasScrollPanel.setOpaque(false);
                esquinasScrollPanel.getViewport().setOpaque(false);
                esquinasScrollPanel.setFont(new javax.swing.plaf.FontUIResource("Dusha V5", Font.PLAIN, 20));
                juego.getEsquinasE1().forEach(esquina -> actualizarEsquinasPanel(esquina));
                juego.getEsquinasE2().forEach(esquina -> actualizarEsquinasPanel(esquina));
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
    
    public void actualizarSustitucionesPanel(Cambio cambio, Equipo equi) {
        JLabel equiLabel = new JLabel(String.valueOf(equi.getNombre()));
        JLabel jugadorIn = new JLabel(String.valueOf(cambio.getEntra()));
        JLabel jugadorOut = new JLabel(String.valueOf(cambio.getSale()));
        JLabel tiempo = new JLabel(String.valueOf(cambio.getTiempo()));
        equiLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jugadorIn.setHorizontalAlignment(SwingConstants.CENTER);
        jugadorOut.setHorizontalAlignment(SwingConstants.CENTER);
        tiempo.setHorizontalAlignment(SwingConstants.CENTER);
        equiLabel.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 20));
        jugadorIn.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 20));
        jugadorOut.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 20));
        tiempo.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 20));
        equiLabel.setForeground(Color.WHITE);
        jugadorIn.setForeground(Color.WHITE);
        jugadorOut.setForeground(Color.WHITE);
        tiempo.setForeground(Color.WHITE);
        sustitucionesPanel.add(equiLabel);
        sustitucionesPanel.add(jugadorIn);
        sustitucionesPanel.add(jugadorOut);
        sustitucionesPanel.add(tiempo);
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
    
    public void actualizarEsquinasPanel(Esquina esquina) {
        JLabel tiempo = new JLabel(esquina.getTiempo());
        JLabel equipo = new JLabel(esquina.getEquipo().getNombre());
        tiempo.setHorizontalAlignment(SwingConstants.CENTER);
        equipo.setHorizontalAlignment(SwingConstants.CENTER);
        tiempo.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 20));
        equipo.setFont(new FontUIResource("Dusha V5", Font.PLAIN, 20));
        tiempo.setForeground(Color.WHITE);
        equipo.setForeground(Color.WHITE);
        esquinasPanel.add(tiempo);
        esquinasPanel.add(equipo);
    }
    
    private void createUIComponents() {
        panel = new EstadisticasPanel();
    }
}
