package Vistas.ContJugadores;

import javax.swing.*;

public class ContJugadores {
    public JPanel panel;
    private JScrollPane scrollPane;
    
    public ContJugadores() {
        scrollPane.getViewport().setOpaque(false);
    }
    
    private void createUIComponents() {
        panel = new ContJugadoresPanel();
        scrollPane = new ContJugadoresScrollPane();
    }
}
