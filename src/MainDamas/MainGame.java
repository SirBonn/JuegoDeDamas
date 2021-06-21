package src.MainDamas;

import src.Juego.*;
import src.Jugador.*;
import src.Textos.*;

public class MainGame {
    ListadoJugadores participantes = new ListadoJugadores();
    MatrizTablero tablero;
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
                    tablero = new MatrizTablero();
                    tablero.mostrarTablero();
                    Datos.esperar("... Pulse enter para regresar...");
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    Escribir.error();
                    Datos.esperar("... Pulse enter para continuar ...");
            }
            Escribir.limpiadorPantalla();
        } while (salir == false);
        Escribir.despedida();

    }

    private void iniciarPartida(){
        int jugadorBlancas = Datos.getEntero("Ingrese el numero del competidor: ", false);
        System.out.println(participantes.getJugador(jugadorBlancas-1).getNombre() + "Juegas primero");
        int jugadorNegras = Datos.getEntero("Ingrese el numero del contrincante: ", false);
        System.out.println(participantes.getJugador(jugadorNegras-1).getNombre() + "Juegas segundo");
        Datos.esperar("--- PULSE ENTER PARA COMENZAR ---");
        
        juegoDamas = new JuegoDamas((participantes.getJugador(jugadorBlancas-1)), (participantes.getJugador(jugadorNegras-1)));
    }

}
