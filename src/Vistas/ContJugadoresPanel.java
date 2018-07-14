package Vistas;

import Modelos.Fondo;
import org.json.JSONObject;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;

public class ContJugadoresPanel extends javax.swing.JPanel {
    
    Fondo bg;
    String databaseStr;
    JSONObject obj;
    
    public ContJugadoresPanel() {
        this.bg = new Fondo("bg", 0, 0, 0, 0);
        try {
        FileInputStream fis = new FileInputStream(getClass().getResource("../JSON/database.json").getFile());
        byte[] buffer = new byte[10];
        StringBuilder sb = new StringBuilder();
        while (fis.read(buffer) != -1) {
            sb.append(new String(buffer));
            buffer = new byte[10];
        }
            fis.close();
            databaseStr = sb.toString();
            obj = new JSONObject(databaseStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.bg.setAncho(this.getWidth());
        this.bg.setAlto(this.getHeight());
    }
}
