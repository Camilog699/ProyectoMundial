package Vistas.TablaPosiciones;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TablaPosiciones {
    public JPanel panel;

    private void createUIComponents() {
        panel = new TablaPosicionesPanel();
    }

    public TablaPosiciones() {

    }
}
