package Clases;

public class Cambio extends DatoPartido {
    private Jugador entra;
    private Jugador sale;
    
    
    public Cambio(Jugador entra, Jugador sale) {
        this.entra = entra;
        this.sale = sale;
    }
    
    public Cambio(String tiempo, Equipo equipo, Jugador j, Jugador entra, Jugador sale) {
        super(tiempo, equipo, j);
        this.entra = entra;
        this.sale = sale;
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
