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
    LinkedList<Gol> goals = new LinkedList<>();
    LinkedList<Tarjeta> tarjetas = new LinkedList<>();
    LinkedList<Cambio> cambios = new LinkedList<>();
    LinkedList<Esquina> esquinas = new LinkedList<>();
    public Juego(Equipo e1, Equipo e2, String fecha, String estadio) {
        this.e1 = e1;
        this.e2 = e2;
        this.fecha = fecha;
        this.estadio = estadio;
    }
    public  static void agregarTarjeta(Jugador j, Tarjeta t){
        tarjetas.add(j,t);
    }
    public  static void golazohpta(Jugador j, Tiempo t){
        goals.add(j,t);
    }
    public static void prostitucion(Jugador js, Jugador je, Tiempo t){
        cambios.add(js,je,t,e);
    }
}
