package Vistas;

import Clases.Juego;

import java.awt.*;
import java.util.LinkedList;

public class FrameSubirDatos extends javax.swing.JFrame {
    LinkedList<Juego> juegos;
    
    public FrameSubirDatos(String title, LinkedList<Juego> juegos) throws HeadlessException {
        super(title);
        this.juegos = juegos;
    }
}
