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
public class Equipo {
    
    
    //Atributos
    private String nombre;
    private int PosicionFifa;

    
    //Costructores
    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    
    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
