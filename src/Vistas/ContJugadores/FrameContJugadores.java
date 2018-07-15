package Vistas.ContJugadores;

import Clases.Jugador;

import java.awt.*;
import java.util.LinkedList;

public class FrameContJugadores extends javax.swing.JFrame {
    private LinkedList<Jugador> jugadores;
    
    public FrameContJugadores(String titulo, LinkedList<Jugador> jugadores) throws HeadlessException {
        super(titulo);
        this.jugadores = jugadores;
    }
    
    public LinkedList<Jugador> getJugadores() {
        return jugadores;
    }
    
    public void setJugadores(LinkedList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
