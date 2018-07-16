import Clases.CuerpoTecnico;
import Clases.Equipo;
import Clases.Juego;
import Clases.Jugador;
import Vistas.Tablero.FrameTablero;
import Vistas.Tablero.Tablero;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.util.LinkedList;

public class Mundial {
    public static void main(String[] args) {
        LinkedList<Equipo> equipos = new LinkedList<>();
        LinkedList<CuerpoTecnico> tecnicos = new LinkedList<>();
        LinkedList<Juego> juegos = new LinkedList<>();
        cargarDatos(equipos);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }
        UIManager.put("Label.font", new javax.swing.plaf.FontUIResource("Dusha V5", Font.PLAIN, 12));
        setUIFont(new javax.swing.plaf.FontUIResource("Dusha V5", Font.PLAIN, 12));
        UIManager.put("TabbedPane.contentOpaque", false);
        JFrame inicio = new FrameTablero("Mundial Rusia 2018", equipos, juegos);
        inicio.setContentPane(new Tablero().panel);
        inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicio.pack();
        inicio.setIconImage(Toolkit.getDefaultToolkit().
                getImage(Tablero.class.getResource("../../Img/ico.png")));
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        inicio.setResizable(false);
        inicio.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
    public static void setUIFont(javax.swing.plaf.FontUIResource f) {
        java.util.Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof javax.swing.plaf.FontUIResource) {
                UIManager.put(key, f);
            }
        }
    }
    
    public static void cargarDatos(LinkedList<Equipo> equipos) {
        try {
            FileInputStream fis = new FileInputStream(Tablero.class.getResource("../../JSON/database.json").getFile());
            byte[] buffer = new byte[10];
            StringBuilder sb = new StringBuilder();
            while (fis.read(buffer) != -1) {
                sb.append(new String(buffer));
                buffer = new byte[10];
            }
            fis.close();
            String content = sb.toString();
            JSONObject obj = new JSONObject(content);
            
            for (int i = 0; i < obj.names().length(); i++) {
                String key = (String) obj.names().get(i);
                Equipo equipo = new Equipo(key, obj.getJSONObject(key).getInt("Posicion FIFA"));
                JSONObject jugs = obj.getJSONObject(key).getJSONObject("Jugadores");
                JSONObject tecs = obj.getJSONObject(key).getJSONObject("Cuerpo tecnico");
                for (int j = 0; j < jugs.names().length(); j++) {
                    String jugKey = (String) jugs.names().get(j);
                    equipo.getJugadores().add(
                            new Jugador(jugs.getJSONObject(jugKey).getString("Nombre"), jugKey,
                                    jugs.getJSONObject(jugKey).getString("Posicion"),
                                    jugs.getJSONObject(jugKey).getString("Nacimiento"),
                                    jugs.getJSONObject(jugKey).getInt("Dorsal")
                            ));
                }
                for (int k = 0; k < tecs.names().length(); k++) {
                    String tecKey = (String) tecs.names().get(k);
                    equipo.getTecnicos().add(
                            new CuerpoTecnico(tecs.getJSONObject(tecKey).getString("Nombre"), tecKey, tecs.getJSONObject(tecKey).getString("Posicion"),
                                    tecs.getJSONObject(tecKey).getString("Pais")
                            ));
                }
                equipos.add(equipo);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
