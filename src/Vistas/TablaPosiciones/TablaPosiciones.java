package Vistas.TablaPosiciones;

import Clases.Equipo;
import Clases.Juego;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;

public class TablaPosiciones {
    public JPanel panel;
    FrameTablaPosiciones frame;
    LinkedList<Juego> juegos;
    LinkedList<Equipo> equipos;
    private JPanel PanelInterno;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label22;
    private JLabel label33;
    private JLabel label44;
    private JLabel label55;
    private JLabel label66;
    private JLabel label77;
    private JLabel label88;
    private JLabel label99;
    private JLabel label1010;
    private JLabel label111;
    private JLabel label222;
    private JLabel label333;
    private JLabel label444;
    private JLabel label555;
    private JLabel label666;
    private JLabel label777;
    private JLabel label888;
    private JLabel label999;
    private JLabel label101010;
    private JLabel label1111;
    private JLabel label2222;
    private JLabel label3333;
    private JLabel label4444;
    private JLabel label5555;
    private JLabel label6666;
    private JLabel label7777;
    private JLabel label8888;
    private JLabel label9999;
    private JLabel label10101010;
    private JButton backTP;
    
    public TablaPosiciones() {
        try {
            panel.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(ImageIO.read(getClass().getResource("../../Img/cursor.png")), new Point(panel.getX(),
                    panel.getY()), "img"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        backTP.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
    
    private void createUIComponents() {
        panel = new TablaPosicionesPanel();
    }
    
    public void setPosiciones() {
        equipos.sort(new Comparator<Equipo>() {
            @Override
            public int compare(Equipo o1, Equipo o2) {
                int puntosO1 = 0;
                int puntosO2 = 0;
                
                if (o1.getPuntos() < o2.getPuntos()) {
                    puntosO2 -= 4;
                } else if (o1.getPuntos() > o2.getPuntos()) {
                    puntosO1 -= 4;
                }
                
                if (o1.diferenciaGoles() < o2.diferenciaGoles()) {
                    puntosO2 -= 3;
                } else if (o1.diferenciaGoles() > o2.diferenciaGoles()) {
                    puntosO1 -= 3;
                }
                
                if (o1.getCantAmarillas() > o2.getCantAmarillas()) {
                    puntosO2 -= 2;
                } else if (o1.getCantAmarillas() < o2.getCantAmarillas()) {
                    puntosO1 -= 2;
                }
                
                if (o1.getCantRojas() > o2.getCantRojas()) {
                    puntosO2 -= 1;
                } else if (o1.getCantRojas() < o2.getCantRojas()) {
                    puntosO1 -= 1;
                }
                return puntosO1 - puntosO2;
            }
        });
        
        label1.setText(equipos.get(0).getNombre());
        label11.setText(equipos.get(1).getNombre());
        label111.setText(equipos.get(2).getNombre());
        label1111.setText(equipos.get(3).getNombre());
        
        label2.setText(String.valueOf(equipos.get(0).getPartJugados()));
        label22.setText(String.valueOf(equipos.get(1).getPartJugados()));
        label222.setText(String.valueOf(equipos.get(2).getPartJugados()));
        label2222.setText(String.valueOf(equipos.get(3).getPartJugados()));
        
        label3.setText(String.valueOf(equipos.get(0).getPartGanados()));
        label33.setText(String.valueOf(equipos.get(1).getPartGanados()));
        label333.setText(String.valueOf(equipos.get(2).getPartGanados()));
        label3333.setText(String.valueOf(equipos.get(3).getPartGanados()));
        
        label4.setText(String.valueOf(equipos.get(0).getPartPerdidos()));
        label44.setText(String.valueOf(equipos.get(1).getPartPerdidos()));
        label444.setText(String.valueOf(equipos.get(2).getPartPerdidos()));
        label4444.setText(String.valueOf(equipos.get(3).getPartPerdidos()));
        
        label5.setText(String.valueOf(equipos.get(0).getPuntos()));
        label55.setText(String.valueOf(equipos.get(1).getPuntos()));
        label555.setText(String.valueOf(equipos.get(2).getPuntos()));
        label5555.setText(String.valueOf(equipos.get(3).getPuntos()));
        
        label6.setText(String.valueOf(equipos.get(0).getGolesFavor()));
        label66.setText(String.valueOf(equipos.get(1).getGolesFavor()));
        label666.setText(String.valueOf(equipos.get(2).getGolesFavor()));
        label6666.setText(String.valueOf(equipos.get(3).getGolesFavor()));
        
        label7.setText(String.valueOf(equipos.get(0).getGolesContra()));
        label77.setText(String.valueOf(equipos.get(1).getGolesContra()));
        label777.setText(String.valueOf(equipos.get(2).getGolesContra()));
        label7777.setText(String.valueOf(equipos.get(3).getGolesContra()));
        
        label8.setText(String.valueOf(equipos.get(0).diferenciaGoles()));
        label88.setText(String.valueOf(equipos.get(1).diferenciaGoles()));
        label888.setText(String.valueOf(equipos.get(2).diferenciaGoles()));
        label8888.setText(String.valueOf(equipos.get(3).diferenciaGoles()));

        label9.setText(String.valueOf(equipos.get(0).getCantAmarillas()));
        label99.setText(String.valueOf(equipos.get(1).getCantAmarillas()));
        label999.setText(String.valueOf(equipos.get(2).getCantAmarillas()));
        label9999.setText(String.valueOf(equipos.get(3).getCantAmarillas()));

        label10.setText(String.valueOf(equipos.get(0).getCantRojas()));
        label1010.setText(String.valueOf(equipos.get(1).getCantRojas()));
        label101010.setText(String.valueOf(equipos.get(2).getCantRojas()));
        label10101010.setText(String.valueOf(equipos.get(3).getCantRojas()));


    }
}
