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
public class CuerpoTecnico extends Persona {

    //Atributos
    private String funcion;
    private String PaisNacimiento;

    //Constructores
    public CuerpoTecnico() {
    }

    public CuerpoTecnico(String funcion, String PaisNacimiento) {
        this.funcion = funcion;
        this.PaisNacimiento = PaisNacimiento;
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
