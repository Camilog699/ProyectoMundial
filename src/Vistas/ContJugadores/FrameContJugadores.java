package Vistas.ContJugadores;

import Clases.Jugador;

import java.awt.*;
import java.util.LinkedList;

public class FrameContJugadores extends javax.swing.JFrame {
    LinkedList<Jugador> jugadores;
    
    public FrameContJugadores(String titulo, LinkedList<Jugador> jugadores) throws HeadlessException {
        super(titulo);
        this.jugadores = jugadores;
    }
}
