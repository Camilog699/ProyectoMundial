package Vistas.SubirDatos;

import Clases.Juego;

import java.awt.*;

public class FrameSubirDatos extends javax.swing.JFrame {
    private Juego juego;
    
    public FrameSubirDatos(String titulo, Juego juego) throws HeadlessException {
        super(titulo);
        this.juego = juego;
    }
    
    public Juego getJuego() {
        return juego;
    }
    
    public void setJuego(Juego juego) {
        this.juego = juego;
    }
}
