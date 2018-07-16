package Vistas.TablaPosiciones;

import Clases.Equipo;
import Clases.Juego;

import java.awt.*;
import java.util.LinkedList;

public class FrameTablaPosiciones extends javax.swing.JFrame {
    
    private LinkedList<Juego> juegos;
    private LinkedList<Equipo> equipos;
    
    public FrameTablaPosiciones(String title, LinkedList<Juego> juegos, LinkedList<Equipo> equipos) throws HeadlessException {
        super(title);
        this.setJuegos(juegos);
        this.setEquipos(equipos);
    }
    
    
    public LinkedList<Juego> getJuegos() {
        return juegos;
    }
    
    public void setJuegos(LinkedList<Juego> juegos) {
        this.juegos = juegos;
    }
    
    public LinkedList<Equipo> getEquipos() {
        return equipos;
    }
    
    public void setEquipos(LinkedList<Equipo> equipos) {
        this.equipos = equipos;
    }
}
