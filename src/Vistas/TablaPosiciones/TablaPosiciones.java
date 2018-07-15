package Vistas.TablaPosiciones;

import Clases.Equipo;
import Clases.Juego;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Comparator;
import java.util.LinkedList;

public class TablaPosiciones {
    public JPanel panel;
    private JPanel PanelInterno;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label7;
    private JLabel label8;
    private JLabel label11;
    private JLabel label22;
    private JLabel label33;
    private JLabel label44;
    private JLabel label55;
    private JLabel label66;
    private JLabel label77;
    private JLabel label88;
    private JLabel label111;
    private JLabel label222;
    private JLabel label333;
    private JLabel label444;
    private JLabel label555;
    private JLabel label666;
    private JLabel label777;
    private JLabel label888;
    private JLabel label1111;
    private JLabel label2222;
    private JLabel label3333;
    private JLabel label4444;
    private JLabel label5555;
    private JLabel label6666;
    private JLabel label7777;
    private JLabel label8888;
    private JButton backTP;
    FrameTablaPosiciones frame;
    LinkedList<Juego> juegos;
    LinkedList<Equipo> equipos;

    private void createUIComponents() {
        panel = new TablaPosicionesPanel();
    }

    public TablaPosiciones() {
        PanelInterno.setOpaque(false);

        panel.setFocusable(true);

        backTP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame = (FrameTablaPosiciones) SwingUtilities.getWindowAncestor(panel);
                frame.setVisible(false);
                frame.dispose();
            }
        });
        panel.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                frame = (FrameTablaPosiciones) SwingUtilities.getWindowAncestor(panel);
                juegos = frame.getJuegos();
                equipos = frame.getEquipos();
                setPosiciones();
            }
        });

    }

    public void setPosiciones() {
        equipos.sort(new Comparator<Equipo>() {
            @Override
            public int compare(Equipo o1, Equipo o2) {
                return o1.getGanados()-o2.getGanados();
            }
        });
        label1.setText(equipos.get(0).getNombre());
        label11.setText(equipos.get(1).getNombre());
        label111.setText(equipos.get(2).getNombre());
        label1111.setText(equipos.get(3).getNombre());

        System.out.println("hola");
    }
}
