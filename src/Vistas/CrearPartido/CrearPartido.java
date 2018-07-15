package Vistas.CrearPartido;
import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CrearPartido{
    public JPanel panel;
    private JComboBox equipo1;
    private JComboBox equipo2;
    private JLabel vs;
    private JTextField estadio;
    private JTextField horaPartido;
    private JButton iniciarPartido;

    public CrearPartido() {
        panel.setFocusable(true);
        estadio.setHorizontalAlignment(JTextField.CENTER);
        estadio.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (estadio.getText().equals("Estadio")){
                    estadio.setText("");
                }
            }
        });
        estadio.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (estadio.getText().equals("")){
                    estadio.setText("Estadio");
                }
            }
        });
        horaPartido.setHorizontalAlignment(JTextField.CENTER);
        horaPartido.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (horaPartido.getText().equals("Hora del partido")){
                    horaPartido.setText("");
                }
            }
        });
        horaPartido.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (horaPartido.getText().equals("")){
                    horaPartido.setText("Hora del partido");
                }
            }
        });
    }

    private void createUIComponents() {
        panel = new CrearPartidoPanel();

    }
}
