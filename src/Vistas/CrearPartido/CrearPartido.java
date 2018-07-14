package Vistas.CrearPartido;
import javax.swing.*;

public class CrearPartido{
    public JPanel panel;
    private JComboBox equipo1;
    private JLabel vs;
    private JComboBox equipo2;
    private JTextArea Estadio;

    private void createUIComponents() {
        panel = new CrearPartidoPanel();
    }
}
