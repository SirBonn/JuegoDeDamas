package src.Jugador;

import src.Juego.MatrizTablero;
import src.MainDamas.Datos;

public class Jugador {
    /**
     * Ingresamos los atributos que definiran a nuestro objeto jugador
     */

    private String nombre;
    private int edad;
    private int piezasEnTablero;
    private int puntuacion;
    private int partidasGanadas;
    private int partidasPerdidas;

    /** Fin de atributos */

    /** Creamos los constructores de nuestro objeto jugador */
    public Jugador() {

    }

    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.puntuacion = 0;
        this.partidasGanadas = 0;
        this.partidasPerdidas = 0;
        this.piezasEnTablero = 12;
    }

    public void moverPieza(MatrizTablero tablero, Jugador jugador1, Jugador jugador2){
        int iInicial=0;
        int jInicial=0;
        int iFinal=0;
        int jFinal=0;

        do {
            jInicial= Datos.getEntero("Que celda desea mover\nColumna: ", false);
            iInicial=Datos.getEntero("Fila: ", false);
            if (iInicial > 8 || jInicial > 8){
                System.out.println("Verifique las entradas y vuelva a intentarlo");
            } else {
                jFinal = Datos.getEntero("A que celda la desea mover\nColumna", false);
                iFinal = Datos.getEntero("Fila: ", false);
                if (iInicial > 8 || jInicial > 8){
                    System.out.println("Verifique las entradas y vuelva a intentarlo");
                }
            }
        } while (iInicial > 8 || jInicial > 8);
        
        int movimiento = tablero.moverPiezas(iInicial-1, jInicial-1, iFinal-1, jFinal-1);
        if(movimiento == 1){
            moverPieza(tablero, jugador1, jugador2);
        }
        if(movimiento == 2){
            jugador2.setPiezasEnTablero(jugador2.getpiezasEnTablero()-1);
        }
        if (movimiento == 3) {
            jugador1.setPiezasEnTablero(jugador1.getpiezasEnTablero()-1);
        } 
    }

    /** Inician getters y setters */
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public boolean isGanador() {
        if (this.piezasEnTablero == 0)
            return false;
        else
            return true;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getPartidasGanadas() {
        return this.partidasGanadas;
    }

    public void setPiezasEnTablero(int piezas){
        this.piezasEnTablero = piezas;
    }

    public int getpiezasEnTablero() {
        return piezasEnTablero;
    }

    public String getDatosJugador() {
        String jugador;
        jugador = "Nombre: " + this.nombre + "\n   Edad: " + this.edad + "\n";
        return jugador;
    }

    public String getReportePartidas() {
        return " " + this.nombre + " tiene: \n\t-> " + this.partidasGanadas + " Victorias" + "\n\t-> "
                + this.partidasPerdidas + " Derrotas";
    }

}
