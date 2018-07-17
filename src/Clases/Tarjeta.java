package Clases;

public class Tarjeta {
    
    /**
     * @amarilla Es true si es amarilla, si no, es roja
     */
    private boolean amarilla;
    private Jugador jugador;
    
    public Tarjeta(boolean amarilla, Jugador jugador) {
        this.amarilla = amarilla;
        this.jugador = jugador;
    }
    
    public boolean isAmarilla() {
        return amarilla;
    }
    
    public void setAmarilla(boolean amarilla) {
        this.amarilla = amarilla;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
}
