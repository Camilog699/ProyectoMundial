package Vistas;

import Clases.Juego;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class Tablero {
    
    private JPanel panel1;
    public static JFrame inicio;
    public static JFrame verJugadoresFrame;
    public static JFrame subirDatosFrame;
    LinkedList<Juego> juegos = new LinkedList<>();

    private JButton subirDatosPartidoButton;
    private JButton verJugadoresButton;
    private JButton verEquiposButton;
    
    public Tablero() {
        verJugadoresButton.addActionListener(e -> {
            verJugadoresFrame = new JFrame("Ver jugadores | Mundial Russia 2018");
            verJugadoresFrame.setContentPane(new VerJugadores().esp);
            verJugadoresFrame.pack();
            verJugadoresFrame.setIconImage(Toolkit.getDefaultToolkit().
                    getImage(Tablero.class.getResource("../Img/ico.png")));
            verJugadoresFrame.setLocationRelativeTo(null);
            verJugadoresFrame.setVisible(true);
            verJugadoresFrame.setResizable(false);
            subirDatosPartidoButton.setBorder(BorderFactory.createLineBorder(Color.RED,5));
            verEquiposButton.setBorder(BorderFactory.createLineBorder(Color.RED,5));
            verEquiposButton.setBorder(BorderFactory.createLineBorder(Color.RED,5));
        });
        subirDatosPartidoButton.addActionListener(l -> {
            subirDatosFrame = new FrameSubirDatos("Subir datos partido | Mundial Russia 2018", juegos);
            subirDatosFrame.setContentPane(new SubirDatos().panel);
            subirDatosFrame.pack();
            subirDatosFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(Tablero.class.getResource("../Img/ico.png")));
            subirDatosFrame.setLocationRelativeTo(null);
            subirDatosFrame.setVisible(true);
            subirDatosFrame.setResizable(false);
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
        inicio.setResizable(false);
    }
    private void createUIComponents() {
        panel1 = new Inicio();
    }
}
