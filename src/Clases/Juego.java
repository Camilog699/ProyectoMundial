/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

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

    public Juego(Equipo e1, Equipo e2, String fecha, String estadio) {
        this.e1 = e1;
        this.e2 = e2;
        this.fecha = fecha;
        this.estadio = estadio;
    }
}
