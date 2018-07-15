package Vistas.CrearPartido;

import Clases.Equipo;

import java.awt.*;
import java.util.LinkedList;

public class FrameCrearPartido extends javax.swing.JFrame {
    
    private LinkedList<Equipo> equipos;
    
    public FrameCrearPartido(String titulo, LinkedList<Equipo> equipos) throws HeadlessException {
        super(titulo);
        this.setEquipos(equipos);
    }

    public LinkedList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(LinkedList<Equipo> equipos) {
        this.equipos = equipos;
    }
}
