package Clases;

public class Gol {

    private  String tiempo;
    private  Equipo equipo;
    private  Jugador j;

    public Gol(String tiempo, Equipo equipo, Jugador j) {

        this.tiempo = tiempo;
        this.equipo = equipo;
        this.j = j;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void setJ(Jugador j) {
        this.j = j;
    }

    public String getTiempo() {
        return tiempo;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public Jugador getJ() {
        return j;
    }

}
