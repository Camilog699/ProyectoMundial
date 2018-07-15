package Vistas.VerJugadores;

import Clases.Equipo;

import java.awt.*;
import java.util.LinkedList;

public class FrameVerJugadores extends javax.swing.JFrame {
    private LinkedList<Equipo> equipos;
    
    public FrameVerJugadores(String titulo, LinkedList<Equipo> equipos) throws HeadlessException {
        super(titulo);
        this.equipos = equipos;
    }
    
    public LinkedList<Equipo> getEquipos() {
        return equipos;
    }
    
    public void setEquipos(LinkedList<Equipo> equipos) {
        this.equipos = equipos;
    }
}
