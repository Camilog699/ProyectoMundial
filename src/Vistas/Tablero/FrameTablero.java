package Vistas.Tablero;

import Clases.Equipo;
import Clases.Juego;

import java.awt.*;
import java.util.LinkedList;

public class FrameTablero extends javax.swing.JFrame {
    private LinkedList<Equipo> equipos = new LinkedList<>();
    private LinkedList<Juego> juegos = new LinkedList<>();
    
    public FrameTablero(String titulo, LinkedList<Equipo> equipos, LinkedList<Juego> juegos) throws HeadlessException {
        super(titulo);
        this.equipos = equipos;
        this.juegos = juegos;
    }
    
    public LinkedList<Equipo> getEquipos() {
        return equipos;
    }
    
    public void setEquipos(LinkedList<Equipo> equipos) {
        this.equipos = equipos;
    }
    
    public LinkedList<Juego> getJuegos() {
        return juegos;
    }
    
    public void setJuegos(LinkedList<Juego> juegos) {
        this.juegos = juegos;
    }
}
