/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.LinkedList;

/**
 *
 * @author amrag
 */
public class Equipo {
    
    
    //Atributos
    private String nombre;
    private int PosicionFifa;
    private LinkedList<Jugador> jugadores;
    private LinkedList<CuerpoTecnico> tecnicos;
    
    private int perdidos;
    private int ganados;
    private int empatados;

    
    //Costructores
    public Equipo() {
    }
    
    public Equipo(String nombre, int posicionFifa) {
        this.nombre = nombre;
        PosicionFifa = posicionFifa;
        jugadores = new LinkedList<>();
        tecnicos = new LinkedList<>();
    }
    
    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getPosicionFifa() {
        return PosicionFifa;
    }
    
    public void setPosicionFifa(int posicionFifa) {
        PosicionFifa = posicionFifa;
    }
    
    public LinkedList<Jugador> getJugadores() {
        return jugadores;
    }
    
    public void setJugadores(LinkedList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", PosicionFifa=" + PosicionFifa +
                ", jugadores=" + jugadores +
                '}';
    }

    public int getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getEmpatados() {
        return empatados;
    }

    public void setEmpatados(int empatados) {
        this.empatados = empatados;
    }
    
    public LinkedList<CuerpoTecnico> getTecnicos() {
        return tecnicos;
    }
    
    public void setTecnicos(LinkedList<CuerpoTecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }
}
