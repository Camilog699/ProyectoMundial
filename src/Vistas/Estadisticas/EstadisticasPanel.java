package Vistas.Estadisticas;

import Modelos.Fondo;

import java.awt.*;

public class EstadisticasPanel extends javax.swing.JPanel {
    Fondo bg;
    
    public EstadisticasPanel() {
        this.bg = new Fondo("bg", 0, 0, 0, 0);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.bg.getSprite().getImage(), this.bg.getX(), this.bg.getY(), this.getWidth(), this.getHeight(), this);
    }
}
