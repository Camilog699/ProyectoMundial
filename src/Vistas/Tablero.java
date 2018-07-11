package Vistas;

import javax.swing.*;

public class Tablero {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mundial Rusia 2018");
        frame.setContentPane(new Tablero().inicio);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    private JPanel inicio;
    private JLabel bg;
}
