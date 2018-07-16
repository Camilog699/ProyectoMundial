package Clases;

public class Gol {

    private  String tiempo;
    private  Jugador j;

    public Gol(String tiempo, Jugador j) {

        this.tiempo = tiempo;
        this.j = j;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    
    public void setJ(Jugador j) {
        this.j = j;
    }

    public String getTiempo() {
        return tiempo;
    }
    
    public Jugador getJ() {
        return j;
    }

}
