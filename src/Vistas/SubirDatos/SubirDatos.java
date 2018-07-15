package Vistas.SubirDatos;

import Clases.Equipo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class SubirDatos {
    public JPanel panel;
    private JComboBox Equipo;
    private JComboBox TiroEsquina;
    private JLabel gol;
    private JButton backSD;
    Equipo e1;
    Equipo e2;
    FrameSubirDatos frame;

    public SubirDatos() {
        panel.setFocusable(true);

        panel.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                frame = (FrameSubirDatos) SwingUtilities.getWindowAncestor(panel);
                e1 = frame.e1;
                e2 = frame.e2;
            }
        });
        backSD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame = (FrameSubirDatos) SwingUtilities.getWindowAncestor(panel);
                frame.setVisible(false);
                frame.dispose();
            }
        });
    }

    private void createUIComponents() {
        panel = new SubirDatosPanel();

    }
}
