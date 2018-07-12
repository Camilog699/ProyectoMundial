package Vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tablero {
    
    private JPanel panel1;
    public static JFrame inicio;
    public static JFrame verJugadoresFrame;
    private JButton subirDatosPartidoButton;
    private JButton verJugadoresButton;
    private JButton verEquiposButton;
    
    public Tablero() {
        verJugadoresButton.addActionListener(e -> {
            verJugadoresFrame = new JFrame("Ver jugadores | Mundial Rusia 2018");
            verJugadoresFrame.setContentPane(new VerJugadores().panel);
            verJugadoresFrame.pack();
            verJugadoresFrame.setIconImage(Toolkit.getDefaultToolkit().
                    getImage(Tablero.class.getResource("../Img/ico.png")));
            verJugadoresFrame.setLocationRelativeTo(null);
            verJugadoresFrame.setVisible(true);
        });
    }
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }
        inicio = new JFrame("Mundial Rusia 2018");
        inicio.setContentPane(new Tablero().panel1);
        inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
