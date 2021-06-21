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
        System.out.print("\nJugador 1: " + jugadorBlancas.getNombre());
        tablero.mostrarComidas(true, this.jugadorBlancas.getPIezasComidas());
        System.out.print("_________________________________________________\n");
        tablero.mostrarTablero();
        System.out.print("\n_________________________________________________\n");
        System.out.print("Jugador2: " + jugadorNegras.getNombre());
        tablero.mostrarComidas(false, jugadorNegras.getPIezasComidas());

    }


    public void jugarPartida() {
        do {
            Escribir.limpiadorPantalla();
            dibujarTableroPartida();
            System.out.println("Turno de blancas");
            jugadorBlancas.moverPieza(tablero, jugadorBlancas, jugadorNegras, 1);
            Datos.esperar("- enter para continuar -");
            Escribir.limpiadorPantalla();
            dibujarTableroPartida();
            System.out.println("Turno de negras");
            jugadorNegras.moverPieza(tablero, jugadorBlancas, jugadorNegras, 2);
            Datos.esperar("- enter para continuar -");
            
        } while (jugadorBlancas.getpiezasEnTablero() != 0 || jugadorNegras.getpiezasEnTablero() != 0);
    
        if(jugadorBlancas.getpiezasEnTablero() == 0){
            Escribir.ganador();
            System.out.println("\n\n" +jugadorNegras.getNombre());  
        } else {
            Escribir.ganador();
            System.out.println("\n\n" +jugadorBlancas.getNombre());  
        }

    }

}
