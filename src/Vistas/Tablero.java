package Vistas;

import javax.swing.*;

public class Tablero {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tablero");
        frame.setContentPane(new Tablero().inicio);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    private JPanel inicio;
}
