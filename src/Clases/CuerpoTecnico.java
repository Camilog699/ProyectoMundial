/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 * @author amrag
 */
public class CuerpoTecnico extends Persona {
    
    //Atributos
    private String funcion;
    private String PaisNacimiento;
    
    public CuerpoTecnico(String nombre, String id, String funcion, String paisNacimiento) {
        super(nombre, id);
        this.funcion = funcion;
        PaisNacimiento = paisNacimiento;
    }
    
    //get y set
    public String getFuncion() {
        return funcion;
    }
    
    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    
    public String getPaisNacimiento() {
        return PaisNacimiento;
    }
    
    public void setPaisNacimiento(String PaisNacimiento) {
        this.PaisNacimiento = PaisNacimiento;
    }
}
