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
public class Juego {
    private LinkedList<Gol> golesE1;
    private LinkedList<Gol> golesE2;
    private Equipo e1;
    private Equipo e2;
    private String fecha;
    private String estadio;
    private LinkedList<Tarjeta> tarjetas = new LinkedList<>();
    private LinkedList<Cambio> cambios = new LinkedList<>();
    private LinkedList<Esquina> esquinas = new LinkedList<>();
    public Juego(Equipo e1, Equipo e2, String fecha, String estadio) {
        this.setE1(e1);
        this.setE2(e2);
        this.setFecha(fecha);
        this.setEstadio(estadio);
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
    
    
    public LinkedList<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(LinkedList<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public LinkedList<Cambio> getCambios() {
        return cambios;
    }

    public void setCambios(LinkedList<Cambio> cambios) {
        this.cambios = cambios;
    }

    public LinkedList<Esquina> getEsquinas() {
        return esquinas;
    }

    public void setEsquinas(LinkedList<Esquina> esquinas) {
        this.esquinas = esquinas;
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
}
