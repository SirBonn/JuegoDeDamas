package src.Juego;

import src.Textos.*;

public class Casilla {
    private String contenido;
    private int pistaPieza;
    private boolean isOcupada;

    public Casilla() {

    }

    public void ocuparCelda(boolean isRojas, String ficha, int pista) {
        if( isRojas){
            this.contenido = Escribir.frojo+ ficha +Escribir.reset;
        } else {
            this.contenido = Escribir.fnegro+ ficha +Escribir.reset;
        }
        this.pistaPieza = pista;
        this.isOcupada = true;
    }

    public void vaciarCelda(boolean isRoja){
        if( isRoja ){
            this.contenido = Escribir.frojo+ "   " +Escribir.reset;
        } else {
            this.contenido = Escribir.fnegro+ "   " +Escribir.reset;
        }
        this.pistaPieza=0;
        this.isOcupada = false;
    }

    public String pintarCasilla(String color) {
        return color;
    }

    /** getters y setters */
    public void Ocupada(boolean isOcupada) {
        this.isOcupada = isOcupada;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setPista(int pista){
        this.pistaPieza = pista;
    }

    public int getPistaPieza(){
        return this.pistaPieza;
    }

    public boolean isOcupada() {
        return this.isOcupada;
    }

    public String getContenido() {
        return this.contenido;
    }
}
