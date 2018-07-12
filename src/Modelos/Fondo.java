/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author amrag
 */
public class Fondo extends Objeto{

    public Fondo() {
    }

    public Fondo(String id, int x, int y, int alto, int ancho) {
        super(id, x, y, ancho, alto, "../Img/Fondo.png");
    }
}
