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
public class Persona {

//Atributos
    private String nombre;
    private String id;

//Costructores
    public Persona() {
    }

    public Persona(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

//get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
