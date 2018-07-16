package Clases;

public class DatoPartido {
    private String tiempo;
    private Equipo equipo;
    private Jugador j;
    
    
    public DatoPartido() {
    }
    
    public DatoPartido(String tiempo, Equipo equipo, Jugador j) {
        this.tiempo = tiempo;
        this.equipo = equipo;
        this.j = j;
    }
}
