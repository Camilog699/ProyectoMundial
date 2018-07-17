package Clases;

public class Cambio {
    private int entra;
    private int sale;
    private String tiempo;

    public Cambio(int entra, int sale, String tiempo) {
        this.entra = entra;
        this.sale = sale;
        this.tiempo = tiempo;
    }

    public void setEntra(int entra) {
        this.entra = entra;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public int getEntra() {

        return entra;
    }

    public int getSale() {
        return sale;
    }

    public String getTiempo() {
        return tiempo;
    }
}