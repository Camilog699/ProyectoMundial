package Vistas;

import Modelos.Fondo;
import Modelos.Objeto;

import java.awt.*;

public class verJugadoresPanel extends javax.swing.JPanel {
    Fondo bg;
    Objeto bandera1;
    Objeto bandera2;
    Objeto bandera3;
    Objeto bandera4;

    public verJugadoresPanel() {
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

        this.bandera1.setX(getWidth() / 5);
        this.bandera1.setY(getHeight() / 3);
        this.bandera1.setAncho(getWidth() / 3 - 40);
        this.bandera1.setAlto(getHeight() / 3 - 40);

        this.bandera2.setX(getWidth() / 2);
        this.bandera2.setY(getHeight() / 3);
        this.bandera2.setAncho(getWidth() / 3 - 40);
        this.bandera2.setAlto(getHeight() / 3 - 40);

        this.bandera3.setX(getWidth() / 5);
        this.bandera3.setY(getHeight() * 2 / 3);
        this.bandera3.setAncho(getWidth() / 3 - 40);
        this.bandera3.setAlto(getHeight() / 3 - 40);

        this.bandera4.setX(getWidth() / 2);
        this.bandera4.setY(getHeight() * 2 / 3);
        this.bandera4.setAncho(getWidth() / 3 - 40);
        this.bandera4.setAlto(getHeight() / 3 - 40);

        g.drawImage(this.bg.getSprite().getImage(), this.bg.getX(), this.bg.getY(), this.bg.getAncho(), this.bg.getAlto(), this);
        g.drawImage(this.bandera1.getSprite().getImage(), this.bandera1.getX(), this.bandera1.getY(), this.bandera1.getAncho(), this.bandera1.getAlto(), this);
        g.drawImage(this.bandera2.getSprite().getImage(), this.bandera2.getX(), this.bandera2.getY(), this.bandera2.getAncho(), this.bandera2.getAlto(), this);
        g.drawImage(this.bandera3.getSprite().getImage(), this.bandera3.getX(), this.bandera3.getY(), this.bandera3.getAncho(), this.bandera3.getAlto(), this);
        g.drawImage(this.bandera4.getSprite().getImage(), this.bandera4.getX(), this.bandera4.getY(), this.bandera4.getAncho(), this.bandera4.getAlto(), this);
        repaint();
    }
}
