package Vistas.Tablero;

import Clases.Equipo;
import Clases.Juego;
import Clases.Jugador;
import Vistas.CrearPartido.CrearPartido;
import Vistas.SubirDatos.FrameSubirDatos;
import Vistas.SubirDatos.SubirDatos;
import Vistas.TablaPosiciones.TablaPosiciones;
import Vistas.VerJugadores.VerJugadores;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.util.LinkedList;

public class Tablero {
    
    private JPanel panel1;
    public static JFrame inicio;
    public static JFrame verJugadoresFrame;
    public static JFrame subirDatosFrame;
    public static JFrame tablaPosicionesFrame;
    public static JFrame crearPartido;
    public static JSONObject obj;
    public static String databaseStr;
    LinkedList<Juego> juegos = new LinkedList<>();
    LinkedList<Equipo> equipos = new LinkedList<>();
    
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
        });
        
        TablaPosicionesButton.addActionListener(e -> {
            tablaPosicionesFrame = new JFrame("Tabla de posiciones | Mundial Russia 2018");
            tablaPosicionesFrame.setContentPane(new TablaPosiciones().panel);
            tablaPosicionesFrame.pack();
            tablaPosicionesFrame.setIconImage(Toolkit.getDefaultToolkit().
                    getImage(Tablero.class.getResource("../../Img/ico.png")));
            tablaPosicionesFrame.setLocationRelativeTo(null);
            tablaPosicionesFrame.setVisible(true);
            tablaPosicionesFrame.setResizable(false);
        });
    }
    
    public static void cargarDatos() {
        try {
            FileInputStream fis = new FileInputStream(Tablero.class.getResource("../../JSON/database.json").getFile());
            byte[] buffer = new byte[10];
            StringBuilder sb = new StringBuilder();
            while (fis.read(buffer) != -1) {
                sb.append(new String(buffer));
                buffer = new byte[10];
            }
            fis.close();
            String content = sb.toString();
            obj = new JSONObject(content);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        
        for (int i = 0; i < obj.names().length(); i++) {
            String key = (String) obj.names().get(i);
            JSONObject jugs = obj.getJSONObject(key).getJSONObject("Jugadores");
            Equipo equipo = new Equipo(key, obj.getJSONObject(key).getInt("Posicion FIFA"));
            for (int j = 0; j < jugs.names().length(); j++) {
                String jugKey = (String) jugs.names().get(i);
                equipo.getJugadores().add(
                        new Jugador(jugs.getJSONObject(jugKey).getString("Nombre"), jugKey,
                                jugs.getJSONObject(jugKey).getString("Posicion"),
                                jugs.getJSONObject(jugKey).getString("Nacimiento"),
                                jugs.getJSONObject(jugKey).getInt("Dorsal")
                        ));
            }
        }
    }
    
    public static void main(String[] args) {
        cargarDatos();
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
