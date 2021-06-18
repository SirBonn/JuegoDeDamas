package src.Jugador;

import src.MainDamas.Datos;
import src.Textos.Escribir;

public class ListadoJugadores {
    /** Atributos de la clase */
    private Jugador jugadores[] = new Jugador[5];
    private int lugar = 0;

    /** Metodos para introducir jugadores a la lista */
    private void agregarJugador(String nombre, int edad) {
        if (lugar < 5) {
            jugadores[lugar] = new Jugador(nombre, edad);
        } else {
            System.out.println("\n---Limite de jugadores alcanzado---");
        }
        lugar++;
    }

    public void agregarJugador() {
        String nombre = Datos.getTexto("Ingrese el nombre del participante: ");
        int edad = Datos.getEntero("Ingrese la edad del participante: ", false);
        agregarJugador(nombre, edad);
    }

    /** Metodo para mostrar los jugadores en el listado */
    public void mostrarJugadores() {
        if (lugar < 6){
            Escribir.participantes();
            for (int i = 0; i < lugar; i++) {
                System.out.println((i + 1) + ". " + jugadores[i].getDatosJugador());
            }
        }

    }

    public void mostrarPosiciones() {

        if (lugar < 5) {
            for (int i = 1; i < (lugar-1); i++) {
                for (int j = 0; j < (lugar); j++) {
                    // String.compareTo(String)
                    // [-oo , + oo]
                    boolean ordenar = (jugadores[j].getPartidasGanadas() > jugadores[j + 1].getPartidasGanadas());
                    System.out.println((i + 1) + "º lugar: " + jugadores[i].getReportePartidas());
                    if (ordenar) {
                        // clientes i va antes que clientes j <0 descendente
                        Jugador aux = jugadores[j];
                        jugadores[j] = jugadores[j + 1];
                        jugadores[j + 1] = aux;
                    }
                }
            }
        }
    }

    public Jugador getJugador(int slot){
        return jugadores[slot];
    }
}
