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
    private String PaisNacimiento;

    //Costructores
    public Jugador() {
    }

    public Jugador(String posicion, String nacimiento, int dorsal, String PaisNacimiento) {
        this.posicion = posicion;
        this.nacimiento = nacimiento;
        this.dorsal = dorsal;
        this.PaisNacimiento = PaisNacimiento;
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

    public String getPaisNacimiento() {
        return PaisNacimiento;
    }

    public void setPaisNacimiento(String PaisNacimiento) {
        this.PaisNacimiento = PaisNacimiento;
    }
    
    
    
}
