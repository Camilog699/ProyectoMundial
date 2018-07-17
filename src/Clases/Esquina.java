package Clases;

public class Esquina {
    String tiempo;
    Equipo equipo;

    public Esquina(String tiempo, Equipo equipo) {
        this.tiempo = tiempo;
        this.equipo = equipo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getTiempo() {

        return tiempo;
    }

    public Equipo getEquipo() {
        return equipo;
    }
}

