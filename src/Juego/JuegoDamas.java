package src.Juego;

import src.Jugador.*;
import src.MainDamas.*;
import src.Textos.Escribir;

public class JuegoDamas {
    private MatrizTablero tablero;
    private Jugador jugadorBlancas;
    private Jugador jugadorNegras;

    public JuegoDamas(Jugador jugadorBlancas, Jugador jugadorNegras) {
        this.tablero = new MatrizTablero();
        this.jugadorBlancas = jugadorBlancas;
        this.jugadorNegras = jugadorNegras;
        dibujarTableroPartida();
        Datos.esperar("--- Pulse enter para Comenzar ---");
        jugarPartida();
    }

    private void dibujarTableroPartida() {
        System.out.println("Jugador1: " + jugadorBlancas.getNombre());
        System.out.print("_________________________________________________\n");
        tablero.mostrarTablero();
        System.out.print("\n_________________________________________________\n");
        System.out.println("Jugador2: " + jugadorNegras.getNombre());
    }


    public void jugarPartida() {
        do {
            Escribir.limpiadorPantalla();
            dibujarTableroPartida();
            System.out.println("Turno de blancas");
            jugadorBlancas.moverPieza(tablero, jugadorBlancas, jugadorNegras);
            Datos.esperar("- enter para continuar -");
            Escribir.limpiadorPantalla();
            dibujarTableroPartida();
            System.out.println("Turno de negras");
            jugadorNegras.moverPieza(tablero, jugadorBlancas, jugadorNegras);
            Datos.esperar("- enter para continuar -");
            
        } while (jugadorBlancas.getpiezasEnTablero() != 0 || jugadorNegras.getpiezasEnTablero() != 0);
    }

}
