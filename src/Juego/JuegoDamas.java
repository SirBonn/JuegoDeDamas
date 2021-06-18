package src.Juego;

import src.Jugador.*;
import src.MainDamas.*;

public class JuegoDamas {
    private MatrizTablero tablero;
    private Jugador jugadorBlancas;
    private Jugador jugadorNegras;

    public JuegoDamas(Jugador jugadorBlancas, Jugador jugadorNegras) {
        this.tablero = new MatrizTablero();
        this.jugadorBlancas = jugadorBlancas;
        this.jugadorNegras = jugadorNegras;
        dibujarTableroPartida();
    }

    private void dibujarTableroPartida() {
        System.out.println("Jugador1: " + jugadorBlancas.getNombre()));
        System.out.print("_________________________________________________\n");
        tablero.mostrarTablero();
        System.out.print("\n_________________________________________________\n");
        System.out.println("Jugador2: " + jugadorNegras.getNombre());
    }


    public void jugarPartida() {
        do {
            
        } while (jugadorBlancas.getpiezasEnTablero() == 0 || jugadorNegras.getpiezasEnTablero() == 0);
    }

}
