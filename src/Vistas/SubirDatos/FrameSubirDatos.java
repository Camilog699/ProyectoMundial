package Vistas.SubirDatos;

import Clases.Equipo;

import java.awt.*;

public class FrameSubirDatos extends javax.swing.JFrame {
    Equipo e1;
    Equipo e2;

    public FrameSubirDatos(String title, Equipo e1, Equipo e2) throws HeadlessException {
        super(title);
        this.e1 = e1;
        this.e2 = e2;
    }
}
