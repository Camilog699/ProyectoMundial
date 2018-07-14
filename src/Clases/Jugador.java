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
public class Jugador extends Persona{
    
    //Atributos
    private String posicion;
    private String nacimiento;
    private int dorsal;
    
    //Costructores
    public Jugador() {
    }
    
    public Jugador(String nombre, String id, String posicion, String nacimiento, int dorsal) {
        super(nombre, id);
        this.posicion = posicion;
        this.nacimiento = nacimiento;
        this.dorsal = dorsal;
    }
    
    //get y set
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    
}
