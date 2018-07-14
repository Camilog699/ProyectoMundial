package Vistas.SubirDatos;

import javax.swing.*;

public class SubirDatos {
    public JPanel panel;
    private JComboBox Equipo;
    private JComboBox TiroEsquina;
    private JLabel gol;

    private void createUIComponents() {
        panel = new SubirDatosPanel();
    }
}
