package Vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerJugadores {
    public JPanel esp;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    JFrame contJugadoresFrame;
    public VerJugadores() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contJugadoresFrame = new JFrame("Ver jugadores | Mundial Russia 2018");
                contJugadoresFrame.setContentPane(new ContJugadores().panel);
                contJugadoresFrame.pack();
                contJugadoresFrame.setIconImage(Toolkit.getDefaultToolkit().
                        getImage(Tablero.class.getResource("../Img/ico.png")));
                contJugadoresFrame.setLocationRelativeTo(null);
                contJugadoresFrame.setVisible(true);
                contJugadoresFrame.setResizable(false);
            }
        });
    }


    private void createUIComponents() {
        this.esp = new VerJugadoresPanel();
    }
}
