package Vistas.Tablero;

import Clases.Juego;
import Vistas.CrearPartido.CrearPartido;
import Vistas.SubirDatos.FrameSubirDatos;
import Vistas.SubirDatos.SubirDatos;
import Vistas.VerJugadores.VerJugadores;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class Tablero {

    private JPanel panel1;
    public static JFrame inicio;
    public static JFrame verJugadoresFrame;
    public static JFrame subirDatosFrame;
    public static JFrame crearPartido;
    LinkedList<Juego> juegos = new LinkedList<>();

    private JButton subirDatosPartidoButton;
    private JButton verJugadoresButton;
    private JButton TablaPosicionesButton;

    public Tablero() {
        verJugadoresButton.addActionListener(e -> {
            verJugadoresFrame = new JFrame("Ver jugadores | Mundial Russia 2018");
            verJugadoresFrame.setContentPane(new VerJugadores().esp);
            verJugadoresFrame.pack();
            verJugadoresFrame.setIconImage(Toolkit.getDefaultToolkit().
                    getImage(Tablero.class.getResource("../../Img/ico.png")));
            verJugadoresFrame.setLocationRelativeTo(null);
            verJugadoresFrame.setVisible(true);
            verJugadoresFrame.setResizable(false);
        });
        subirDatosPartidoButton.addActionListener(l -> {
            subirDatosFrame = new FrameSubirDatos("Subir datos partido | Mundial Russia 2018", juegos);
            subirDatosFrame.setContentPane(new SubirDatos().panel);
            subirDatosFrame.pack();
            subirDatosFrame.setIconImage(Toolkit.getDefaultToolkit().
                    getImage(Tablero.class.getResource("../../Img/ico.png")));
            subirDatosFrame.setLocationRelativeTo(null);
            subirDatosFrame.setVisible(true);
            subirDatosFrame.setResizable(false);
            crearPartido = new JFrame("Crear partido | Mundial Russia 2018");
            crearPartido.setContentPane(new CrearPartido().panel);
            crearPartido.pack();
            crearPartido.setIconImage(Toolkit.getDefaultToolkit().
                    getImage(Tablero.class.getResource("../../Img/ico.png")));
            crearPartido.setLocationRelativeTo(null);
            crearPartido.setVisible(true);
            crearPartido.setResizable(false);


            verJugadoresButton.addActionListener(f -> {
                verJugadoresFrame = new JFrame("Ver Tabla de Posiciones | Mundial Russia 2018");
                verJugadoresFrame.setContentPane(new VerJugadores().esp);
                verJugadoresFrame.pack();
                verJugadoresFrame.setIconImage(Toolkit.getDefaultToolkit().
                        getImage(Tablero.class.getResource("../Img/ico.png")));
                verJugadoresFrame.setLocationRelativeTo(null);
                verJugadoresFrame.setVisible(true);
                verJugadoresFrame.setResizable(false);
            });
        });

    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }
        setUIFont(new javax.swing.plaf.FontUIResource("Dusha", 0, 12));
        inicio = new JFrame("Mundial Rusia 2018");
        inicio.setContentPane(new Tablero().panel1);
        inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicio.pack();
        inicio.setIconImage(Toolkit.getDefaultToolkit().
                getImage(Tablero.class.getResource("../../Img/ico.png")));
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        inicio.setResizable(false);
    }

    private void createUIComponents() {
        panel1 = new TableroPanel();
    }

    public static void setUIFont(javax.swing.plaf.FontUIResource f) {
        java.util.Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof javax.swing.plaf.FontUIResource) {
                UIManager.put(key, f);
            }
        }
    }
}
