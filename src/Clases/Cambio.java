package Clases;

public class Cambio extends DatoPartido{
    private Jugador entra;
    private Jugador sale;

    public Cambio(Jugador entra, Jugador sale, String tiempo, Equipo e) {
        super(tiempo, e);
        this.setEntra(entra);
        this.setSale(sale);
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
