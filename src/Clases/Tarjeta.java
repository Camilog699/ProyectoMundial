package Clases;

public class Tarjeta extends DatoPartido{

    /**
     * @amarilla Es true si es amarilla, si no, es roja
     */
    private boolean amarilla;
    public Tarjeta(Jugador j, String tiempo, Equipo e, boolean amarilla) {
        super(j, tiempo, e);
    }

    public boolean isAmarilla() {
        return amarilla;
    }

    public void setAmarilla(boolean amarilla) {
        this.amarilla = amarilla;
    }
}
