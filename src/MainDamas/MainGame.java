package src.MainDamas;

import src.Juego.MatrizTablero;
import src.Jugador.*;
import src.Textos.*;

public class MainGame {
    ListadoJugadores participantes = new ListadoJugadores();
    MatrizTablero tablero = new MatrizTablero();

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
                    Escribir.participantes();
                    participantes.mostrarJugadores();
                    Datos.esperar("... Pulse enter para regresar ...");
                    break;

                case 2:
                    
                    break;

                case 3:
                    Escribir.tablero();
                    participantes.mostrarPosiciones();
                    participantes.mostrarJugadores();
                    Datos.esperar("... Pulse enter para regresar ...");
                    break;
                case 4: 
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

}
