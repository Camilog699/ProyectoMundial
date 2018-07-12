package Vistas;

import javax.swing.*;
import java.awt.*;

public class Tablero extends javax.swing.JFrame{
    
    private JPanel panel1;
    private JButton subirDatosPartidoButton;
    private JButton verJugadoresButton;
    private JButton verEquiposButton;
    
    public static void main(String[] args) {
        JFrame inicio = new JFrame("Mundial Rusia 2018");
        inicio.setContentPane(new Tablero().panel1);
        inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception ignored){}
        inicio.pack();
        inicio.setIconImage(Toolkit.getDefaultToolkit().
                getImage(Tablero.class.getResource("../Img/ico.png")));
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
    }
    
    private void createUIComponents() {
        panel1 = new Inicio();
    }
}
