package src.Jugador;

import src.Juego.*;
import src.MainDamas.Datos;

public class Jugador {
    /**
     * Ingresamos los atributos que definiran a nuestro objeto jugador
     */
    //Arbitro arbitro = new Arbitro();
    private String nombre;
    private int edad;
    private int piezasEnTablero;
    private int piezasComidas;
    private int partidasGanadas;
    private int partidasPerdidas;

    /** Fin de atributos */

    /** Creamos los constructores de nuestro objeto jugador */
    public Jugador() {

    }

    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.piezasComidas=0;
        this.partidasGanadas = 0;
        this.partidasPerdidas = 0;
        this.piezasEnTablero = 12;
    }

    public void moverPieza(MatrizTablero tablero, Jugador jugador1, Jugador jugador2, int turno){
        int iInicial=0;
        int jInicial=0;
        int iFinal=0;
        int jFinal=0;  
        boolean isValido;

        do{
            isValido = false;
            jInicial= Datos.getEntero("Que celda desea mover\nColumna: ", false);
            iInicial=Datos.getEntero("Fila: ", false);
            isValido = Arbitro.verificarMovimiento(turno, tablero.getCasilla(iInicial-1, jInicial-1), true, iFinal, iInicial);
            if (isValido == false)
                System.out.println("Movimiento invalido, verifica las entradas");
        } while (isValido == false);
        
        do {
            isValido = false;
            jFinal = Datos.getEntero("A que celda la desea mover\nColumna", false);
            iFinal = Datos.getEntero("Fila: ", false);
            isValido = Arbitro.verificarMovimiento(turno, tablero.getCasilla(iInicial-1, jInicial-1), false, iFinal, iInicial);
            if (isValido == false)
                System.out.println("Movimiento invalido, verifica las entradas");
        } while (isValido == false);
        
        int movimiento = tablero.moverPiezas(iInicial-1, jInicial-1, iFinal-1, jFinal-1, turno);
        if(movimiento == 1){
            moverPieza(tablero, jugador1, jugador2, turno);
        }
        if(movimiento == 2){
            jugador2.setPiezasEnTablero(jugador2.getpiezasEnTablero()-1);
            jugador2.setPiezasComidas(jugador2.getPIezasComidas()+1);
        }
        if (movimiento == 3) {
            jugador1.setPiezasEnTablero(jugador1.getpiezasEnTablero()-1);
            jugador1.setPiezasComidas(jugador1.getPIezasComidas()+1);
        } 
    }

    /** Inician getters y setters */

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

    public void setPiezasComidas(int piezas){
        this.piezasComidas = piezas;
    }

    public int getPIezasComidas(){
        return piezasComidas;
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