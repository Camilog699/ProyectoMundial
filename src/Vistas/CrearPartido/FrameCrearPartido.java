package Vistas.CrearPartido;

import Clases.Equipo;

import java.awt.*;
import java.util.LinkedList;

public class FrameCrearPartido extends javax.swing.JFrame {
    
    LinkedList<Equipo> equipos;
    
    public FrameCrearPartido(String titulo, LinkedList<Equipo> equipos) throws HeadlessException {
        super(titulo);
        this.equipos = equipos;
    }
}
