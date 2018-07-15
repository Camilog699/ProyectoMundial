package Vistas.TablaPosiciones;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    JFrame frame;

    private void createUIComponents() {
        panel = new TablaPosicionesPanel();
    }

    public TablaPosiciones() {
        PanelInterno.setOpaque(false);

        backTP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame = (JFrame) SwingUtilities.getWindowAncestor(panel);
                frame.setVisible(false);
                frame.dispose();
            }
        });
    }
}
