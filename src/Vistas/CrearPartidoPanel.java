package Vistas;

import Modelos.Fondo;

import java.awt.*;

public class CrearPartidoPanel extends javax.swing.JPanel {
    Fondo bg;
    public CrearPartidoPanel() { this.bg = new Fondo("bg", 0, 0, 0 ,0); }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.bg.setAncho(this.getWidth());
        this.bg.setAlto(this.getHeight());
        g.drawImage(this.bg.getSprite().getImage(), this.bg.getX(), this.bg.getY(), this.bg.getAncho(), this.bg.getAlto(), this);
        repaint();
    }
}
