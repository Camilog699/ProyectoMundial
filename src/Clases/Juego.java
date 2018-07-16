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
public class Juego {
    private Equipo e1;
    private Equipo e2;
    private String fecha;
    private String estadio;
    private LinkedList<Gol> golesE1;
    private LinkedList<Gol> golesE2;
    private LinkedList<Tarjeta> tarjetasE1;
    private LinkedList<Tarjeta> tarjetasE2;
    private LinkedList<Cambio> cambiosE1;
    private LinkedList<Cambio> cambiosE2;
    private LinkedList<Esquina> esquinasE1;
    private LinkedList<Esquina> esquinasE2;
    
    public Juego(Equipo e1, Equipo e2, String fecha, String estadio) {
        this.setE1(e1);
        this.setE2(e2);
        this.setFecha(fecha);
        this.setEstadio(estadio);
        setGolesE1(new LinkedList<>());
        setGolesE2(new LinkedList<>());
        setTarjetasE1(new LinkedList<>());
        setTarjetasE2(new LinkedList<>());
        setCambiosE1(new LinkedList<>());
        setCambiosE2(new LinkedList<>());
        setEsquinasE1(new LinkedList<>());
        setEsquinasE2(new LinkedList<>());
    }
    
    public Equipo getE1() {
        return e1;
    }
    
    public void setE1(Equipo e1) {
        this.e1 = e1;
    }
    
    public Equipo getE2() {
        return e2;
    }
    
    public void setE2(Equipo e2) {
        this.e2 = e2;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getEstadio() {
        return estadio;
    }
    
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }


    public LinkedList<Esquina> getEsquinasE2() {
        return esquinasE2;
    }

    public void setEsquinasE2(LinkedList<Esquina> esquinasE2) {
        this.esquinasE2 = esquinasE2;
    }

    public LinkedList<Gol> getGolesE1() {
        return golesE1;
    }

    public void setGolesE1(LinkedList<Gol> golesE1) {
        this.golesE1 = golesE1;
    }

    public LinkedList<Gol> getGolesE2() {
        return golesE2;
    }

    public void setGolesE2(LinkedList<Gol> golesE2) {
        this.golesE2 = golesE2;
    }

    public LinkedList<Tarjeta> getTarjetasE1() {
        return tarjetasE1;
    }

    public void setTarjetasE1(LinkedList<Tarjeta> tarjetasE1) {
        this.tarjetasE1 = tarjetasE1;
    }

    public LinkedList<Tarjeta> getTarjetasE2() {
        return tarjetasE2;
    }

    public void setTarjetasE2(LinkedList<Tarjeta> tarjetasE2) {
        this.tarjetasE2 = tarjetasE2;
    }

    public LinkedList<Cambio> getCambiosE1() {
        return cambiosE1;
    }

    public void setCambiosE1(LinkedList<Cambio> cambiosE1) {
        this.cambiosE1 = cambiosE1;
    }

    public LinkedList<Cambio> getCambiosE2() {
        return cambiosE2;
    }

    public void setCambiosE2(LinkedList<Cambio> cambiosE2) {
        this.cambiosE2 = cambiosE2;
    }

    public LinkedList<Esquina> getEsquinasE1() {
        return esquinasE1;
    }

    public void setEsquinasE1(LinkedList<Esquina> esquinasE1) {
        this.esquinasE1 = esquinasE1;
    }
}
