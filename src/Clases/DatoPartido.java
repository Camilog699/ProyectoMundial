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
    
    public DatoPartido(String tiempo, Equipo equipo) {
        this.tiempo = tiempo;
        this.equipo = equipo;
    }
    
    public String getTiempo() {
        return tiempo;
    }
    
    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    
    public Equipo getEquipo() {
        return equipo;
    }
    
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    public Jugador getJ() {
        return j;
    }
    
    public void setJ(Jugador j) {
        this.j = j;
    }
}
