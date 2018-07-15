package Vistas.Tablero;

import Vistas.CrearPartido.CrearPartido;
import Vistas.CrearPartido.FrameCrearPartido;
import Vistas.SubirDatos.FrameSubirDatos;
import Vistas.TablaPosiciones.TablaPosiciones;
import Vistas.VerJugadores.FrameVerJugadores;
import Vistas.VerJugadores.VerJugadores;

import javax.swing.*;
import java.awt.*;

public class Tablero {
    
    public JPanel panel;
    public FrameVerJugadores verJugadoresFrame;
    public FrameSubirDatos subirDatosFrame;
    public JFrame tablaPosicionesFrame;
    public FrameCrearPartido crearPartido;
    
    private JButton subirDatosPartidoButton;
    private JButton verJugadoresButton;
    private JButton TablaPosicionesButton;
    
    public Tablero() {
        verJugadoresButton.addActionListener(e -> {
            FrameTablero frame = (FrameTablero) SwingUtilities.getWindowAncestor(verJugadoresButton);
            verJugadoresFrame = new FrameVerJugadores("Ver jugadores | Mundial Russia 2018", frame.getEquipos());
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
