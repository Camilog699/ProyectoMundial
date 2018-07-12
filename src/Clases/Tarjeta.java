package Clases;

public class Tarjeta{

    /**
     * @amarilla Es true si es amarilla, si no, es roja
     */
    private boolean amarilla;

    public Tarjeta(boolean amarilla) {
        this.amarilla = amarilla;
    }

    public boolean isAmarilla() {
        return amarilla;
    }

    public void setAmarilla(boolean amarilla) {
        this.amarilla = amarilla;
    }
}
