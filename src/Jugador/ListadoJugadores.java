package Jugador;

import MainDamas.Datos;
import src.Jugador.Jugador;

public class ListadoJugadores {
    /**Atributos de la clase */
    private Jugador jugadores[] = new Jugador[5];
    private int lugar=0;

    /**Metodos para introducir jugadores a la lista*/
    public void agregarJugador(String nombre, int edad){
        if (lugar<5) {
            jugadores[lugar] = new Jugador(nombre, edad);
        } else {
            System.println("\n---Limite de jugadores alcanzado---");
        }
        lugar++;
    }

    public void agregarJugador(){
        String nombre = Datos.getTexto("Ingrese el nombre del participante: ");
        int edad = Datos.getEntero("ingrese la edad del participante", false);
    }
}
