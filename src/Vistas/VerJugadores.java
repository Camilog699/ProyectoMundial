package Vistas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerJugadores {
    public JPanel esp;
    private JButton button1;

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
