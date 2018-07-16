package Vistas.VerJugadores;

import Modelos.Fondo;
import Modelos.Objeto;

import java.awt.*;

public class VerJugadoresPanel extends javax.swing.JPanel {
    Fondo bg;
    Objeto bandera1;
    Objeto bandera2;
    Objeto bandera3;
    Objeto bandera4;
    
    public VerJugadoresPanel() {
        this.bg = new Fondo("bg", 0, 0, 0, 0);
        this.bandera1 = new Objeto("Bandera1", 0, 0, 0, 0, "../img/esp.png");
        this.bandera2 = new Objeto("Bandera2", 0, 0, 0, 0, "../img/irn.png");
        this.bandera3 = new Objeto("Bandera3", 0, 0, 0, 0, "../img/mar.png");
        this.bandera4 = new Objeto("Bandera4", 0, 0, 0, 0, "../img/por.png");
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.bg.setAncho(this.getWidth());
        this.bg.setAlto(this.getHeight());
        
        g.drawImage(this.bg.getSprite().getImage(), this.bg.getX(), this.bg.getY(), this.bg.getAncho(), this.bg.getAlto(), this);
        repaint();
    }
    
    
}
