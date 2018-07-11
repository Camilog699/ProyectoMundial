package Clases;

public class DatoPartido {
    private Jugador j;
    private String tiempo;
    private Equipo e;

    public DatoPartido(Jugador j, String tiempo, Equipo e) {
        this.setJ(j);
        this.setTiempo(tiempo);
        this.setE(e);
    }

    public DatoPartido(String tiempo, Equipo e) {
        this.tiempo = tiempo;
        this.e = e;
    }

    public Jugador getJ() {
        return j;
    }

    public void setJ(Jugador j) {
        this.j = j;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public Equipo getE() {
        return e;
    }

    public void setE(Equipo e) {
        this.e = e;
    }
}
