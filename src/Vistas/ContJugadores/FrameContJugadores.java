package Vistas.ContJugadores;

import Clases.CuerpoTecnico;
import Clases.Jugador;

import java.awt.*;
import java.util.LinkedList;

public class FrameContJugadores extends javax.swing.JFrame {
    private LinkedList<Jugador> jugadores;
    private LinkedList<CuerpoTecnico> tecnicos;
    
    public FrameContJugadores(String title, LinkedList<Jugador> jugadores, LinkedList<CuerpoTecnico> tecnicos) throws HeadlessException {
        super(title);
        this.jugadores = jugadores;
        this.tecnicos = tecnicos;
    }
    
    public LinkedList<Jugador> getJugadores() {
        return jugadores;
    }
    
    public void setJugadores(LinkedList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    public LinkedList<CuerpoTecnico> getTecnicos() {
        return tecnicos;
    }
    
    public void setTecnicos(LinkedList<CuerpoTecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }
}
