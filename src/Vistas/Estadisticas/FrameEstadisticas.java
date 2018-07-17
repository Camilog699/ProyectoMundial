package Vistas.Estadisticas;

import Clases.Juego;

import java.awt.*;

public class FrameEstadisticas extends javax.swing.JFrame {
    private Juego juego;
    
    public FrameEstadisticas(String titulo, Juego juego) throws HeadlessException {
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
