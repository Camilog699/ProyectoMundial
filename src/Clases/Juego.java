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
    private Equipo e1;
    private Equipo e2;
    private String resultado;
    private String fecha;
    private String estadio;
    private LinkedList<Gol> goals = new LinkedList<>();
    private LinkedList<Tarjeta> tarjetas = new LinkedList<>();
    private LinkedList<Cambio> cambios = new LinkedList<>();
    private LinkedList<Esquina> esquinas = new LinkedList<>();
    public Juego(Equipo e1, Equipo e2, String fecha, String estadio) {
        this.setE1(e1);
        this.setE2(e2);
        this.setFecha(fecha);
        this.setEstadio(estadio);
    }
    public void agregarTarjeta(Tarjeta t){
        getTarjetas().add(t);
    }
    public void golazohpta(Gol g){
        getGoals().add(g);
    }
    public void prostitucion(Cambio c){
        getCambios().add(c);
    }
    public void corner(Esquina e){
        getEsquinas().add(e);
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

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
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


    public LinkedList<Gol> getGoals() {
        return goals;
    }

    public void setGoals(LinkedList<Gol> goals) {
        this.goals = goals;
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


}
