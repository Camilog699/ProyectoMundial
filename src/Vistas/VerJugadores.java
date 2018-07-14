package Vistas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerJugadores {
    public JPanel esp;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;


    public VerJugadores() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createUIComponents() {
        this.esp = new verJugadoresPanel();
    }
}
