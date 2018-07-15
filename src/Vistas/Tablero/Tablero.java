package Vistas.Tablero;

import Vistas.CrearPartido.CrearPartido;
import Vistas.CrearPartido.FrameCrearPartido;
import Vistas.SubirDatos.FrameSubirDatos;
import Vistas.SubirDatos.SubirDatos;
import Vistas.TablaPosiciones.TablaPosiciones;
import Vistas.VerJugadores.VerJugadores;

import javax.swing.*;
import java.awt.*;

public class Tablero {
    
    public JPanel panel;
    public JFrame verJugadoresFrame;
    public JFrame subirDatosFrame;
    public JFrame tablaPosicionesFrame;
    public JFrame crearPartido;
    
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
            FrameTablero frame = (FrameTablero) SwingUtilities.getWindowAncestor(subirDatosPartidoButton);
            subirDatosFrame = new FrameSubirDatos("Subir datos partido | Mundial Russia 2018");
            subirDatosFrame.setContentPane(new SubirDatos().panel);
            subirDatosFrame.pack();
            subirDatosFrame.setIconImage(Toolkit.getDefaultToolkit().
                    getImage(Tablero.class.getResource("../../Img/ico.png")));
            subirDatosFrame.setLocationRelativeTo(null);
            subirDatosFrame.setVisible(true);
            subirDatosFrame.setResizable(false);
            crearPartido = new FrameCrearPartido("Crear partido | Mundial Russia 2018", frame.getEquipos());
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
    
    private void createUIComponents() {
        panel = new TableroPanel();
    }
    
}
