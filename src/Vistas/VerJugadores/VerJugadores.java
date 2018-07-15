package Vistas.VerJugadores;

import Vistas.ContJugadores.ContJugadores;
import Vistas.Tablero.Tablero;

import javax.swing.*;
import java.awt.*;

public class VerJugadores {
    public JPanel esp;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    FrameVerJugadores contJugadoresFrame;
    public VerJugadores() {
        button1.addActionListener(e -> {
            FrameVerJugadores frame = (FrameVerJugadores) SwingUtilities.getWindowAncestor(button1);
            contJugadoresFrame = new FrameVerJugadores("Ver jugadores | Mundial Russia 2018", frame.getEquipos());
            contJugadoresFrame.setContentPane(new ContJugadores().panel);
            contJugadoresFrame.pack();
            contJugadoresFrame.setIconImage(Toolkit.getDefaultToolkit().
                    getImage(Tablero.class.getResource("../../Img/ico.png")));
            contJugadoresFrame.setLocationRelativeTo(null);
            contJugadoresFrame.setVisible(true);
            contJugadoresFrame.setResizable(false);
        });
    }


    private void createUIComponents() {
        this.esp = new VerJugadoresPanel();
    }
}
