/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import javax.swing.*;

/**
 * @author Juan José González G
 */
public class Objeto {
    private String id;
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private ImageIcon sprite;
    
    public Objeto(String bandera, int i, int i1, int i2, int i3) {
    }
    
    public Objeto(String id, int x, int y, int ancho, int alto, String ruta) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.sprite = new ImageIcon(getClass().getResource(ruta));
    }
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }
    
    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * @return the y
     */
    public int getY() {
        return y;
    }
    
    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }
    
    /**
     * @param ancho the ancho to set
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    /**
     * @return the alto
     */
    public int getAlto() {
        return alto;
    }
    
    /**
     * @param alto the alto to set
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    /**
     * @return the sprite
     */
    public ImageIcon getSprite() {
        return sprite;
    }
    
    /**
     * @param sprite the sprite to set
     */
    public void setSprite(ImageIcon sprite) {
        this.sprite = sprite;
    }
}
