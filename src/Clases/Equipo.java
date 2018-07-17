/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.LinkedList;

/**
 * @author amrag
 */
public class Equipo {


    //Atributos
    private String nombre;
    private int posicionFifa;
    private int cantAmarillas;
    private int cantRojas;
    private int partJugados;
    private int partGanados;
    private int partEmpatados;
    private int partPerdidos;
    private int puntos;
    private int golesFavor;
    private int golesContra;
    private LinkedList<Jugador> jugadores;
    private LinkedList<CuerpoTecnico> tecnicos;


    //Costructores
    public Equipo() {
    }

    public Equipo(String nombre, int posicionFifa) {
        this.nombre = nombre;
        this.posicionFifa = posicionFifa;
        jugadores = new LinkedList<>();
        tecnicos = new LinkedList<>();
    }

    public int diferenciaGoles() {
        return golesFavor - golesContra;
    }

    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicionFifa() {
        return posicionFifa;
    }

    public void setPosicionFifa(int posicionFifa) {
        this.posicionFifa = posicionFifa;
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
                ", posicionFifa=" + posicionFifa +
                ", jugadores=" + jugadores +
                '}';
    }


    public LinkedList<CuerpoTecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(LinkedList<CuerpoTecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public int getCantAmarillas() {
        return cantAmarillas;
    }

    public void setCantAmarillas(int cantAmarillas) {
        this.cantAmarillas = cantAmarillas;
    }

    public int getCantRojas() {
        return cantRojas;
    }

    public void setCantRojas(int cantRojas) {
        this.cantRojas = cantRojas;
    }

    public int getPartJugados() {
        return partJugados;
    }

    public void setPartJugados(int partJugados) {
        this.partJugados = partJugados;
    }

    public int getPartGanados() {
        return partGanados;
    }

    public void setPartGanados(int partGanados) {
        this.partGanados = partGanados;
    }

    public int getPartEmpatados() {
        return partEmpatados;
    }

    public void setPartEmpatados(int partEmpatados) {
        this.partEmpatados = partEmpatados;
    }

    public int getPartPerdidos() {
        return partPerdidos;
    }

    public void setPartPerdidos(int partPerdidos) {
        this.partPerdidos = partPerdidos;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
