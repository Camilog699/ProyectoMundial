package Clases;

public class Cambio{
    private Jugador entra;
    private Jugador sale;
    private Tiempo t;
    private Equipo e;

    public Cambio(Jugador entra, Jugador sale, Tiempo tiempo, Equipo e) {
        this.entra = entra;
        this.sale = sale;
        this.t = tiempo;
        this.e = e;
    }

    public Cambio() {
    }

    public Jugador getEntra() {
        return entra;
    }

    public void setEntra(Jugador entra) {
        this.entra = entra;
    }

    public Jugador getSale() {
        return sale;
    }

    public void setSale(Jugador sale) {
        this.sale = sale;
    }
}
