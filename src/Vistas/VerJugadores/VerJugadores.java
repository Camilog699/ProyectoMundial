package Vistas.VerJugadores;

import Vistas.ContJugadores.ContJugadores;
import Vistas.Tablero.Tablero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VerJugadores {
    public JPanel esp;
    private JButton españa;
    private JButton iran;
    private JButton marruecos;
    private JButton portugal;
    private JButton backVJ;
    FrameVerJugadores frame;

    FrameVerJugadores contJugadoresFrame;
    public VerJugadores() {
        españa.addActionListener(e -> {
            FrameVerJugadores frame = (FrameVerJugadores) SwingUtilities.getWindowAncestor(españa);
            contJugadoresFrame = new FrameVerJugadores("Ver jugadores | Mundial Russia 2018", frame.getEquipos());
            contJugadoresFrame.setContentPane(new ContJugadores().panel);
            contJugadoresFrame.pack();
            contJugadoresFrame.setIconImage(Toolkit.getDefaultToolkit().
                    getImage(Tablero.class.getResource("../../Img/ico.png")));
            contJugadoresFrame.setLocationRelativeTo(null);
            contJugadoresFrame.setVisible(true);
            contJugadoresFrame.setResizable(false);
            contJugadoresFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        });


        backVJ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame = (FrameVerJugadores) SwingUtilities.getWindowAncestor(esp);
                frame.setVisible(false);
                frame.dispose();
            }
        });
    }


    private void createUIComponents() {
        this.esp = new VerJugadoresPanel();
    }
}
