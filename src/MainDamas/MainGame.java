package src.MainDamas;

import src.Juego.*;
import src.Jugador.*;
import src.Textos.*;

public class MainGame {
    ListadoJugadores participantes = new ListadoJugadores();
    MatrizTablero tablero = new MatrizTablero();
    JuegoDamas juegoDamas;

    public static void main(String[] args) {
        MainGame juego = new MainGame();
    }

    public MainGame() {
        menuPrincipal();
    }

    public void menuPrincipal() {
        boolean salir = false;

        do {
            Escribir.titulo();
            Escribir.menuPrincipal();
            System.out.println("1. Inscribir jugador");
            System.out.println("2. Jugar");
            System.out.println("3. Ver tabla de puntos");
            System.out.println("4. Ver tablero de juego");
            System.out.println("0. Salir");
            switch (Datos.getEntero("Ingrese su opcion\n--> ", true)) {
                case 1:
                    participantes.agregarJugador();
                    Datos.esperar("... Presione enter para continuar ...");
                    participantes.mostrarJugadores();
                    Datos.esperar("... Pulse enter para regresar ...");
                    break;

                case 2:
                    participantes.mostrarJugadores();
                    iniciarPartida();
                    break;

                case 3:
                    Escribir.tablero();
                    participantes.mostrarPosiciones();
                    participantes.mostrarJugadores();
                    Datos.esperar("... Pulse enter para regresar ...");
                    break;
                case 4: 
                System.out.println("\n\n");
                    tablero.mostrarTablero();
                    Datos.esperar("... Pulse enter para regresar...");
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Error, entrada invalida.\nVuelva a intentarlo");
                    Datos.esperar("... Pulse enter para continuar ...");
            }
            Escribir.limpiadorPantalla();
        } while (salir == false);

    }

    private void iniciarPartida(){
        int jugadorBlancas = Datos.getEntero("Ingrese el numero del competidor: ", false);
        System.out.println("Tienes blancas");
        int jugadorNegras = Datos.getEntero("Ingrese el numero del contrincante: ", false);
        System.out.println("Tienes blancas");
        Datos.esperar("--- PULSE ENTER PARA COMENZAR ---");
        
        juegoDamas = new JuegoDamas((participantes.getJugador(jugadorBlancas-1)), (participantes.getJugador(jugadorNegras-1)));
    }

}
