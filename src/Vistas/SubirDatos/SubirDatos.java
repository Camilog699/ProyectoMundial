package Vistas.SubirDatos;

import javax.swing.*;

public class SubirDatos {
    public JPanel panel;
    private JComboBox Equipo;
    private JComboBox TiroEsquina;
    private JLabel gol;
    private JButton button1;

    private void createUIComponents() {
        panel = new SubirDatosPanel();
    }
}
