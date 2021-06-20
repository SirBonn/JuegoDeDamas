package src.Juego;

import src.MainDamas.Datos;
import src.Textos.*;

public class MatrizTablero {
    private Casilla[][] tablero = new Casilla[9][9];
    private boolean isRojas;
    private String fichaJ1;
    private String fichaJ2;

    public MatrizTablero() {
        seleccionarTablero();
    }

    public void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j].getContenido());
            }
            System.out.println("");
        }
    }

    private void iniciarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = new Casilla();
            }
        }
    }
    
    private void seleccionarTablero() {
        this.isRojas = true;
        int opcion = Datos.getEntero("Seleccione cassillas a jugar: \n1. Rojo\t2. Negros", false);
        if (opcion == 2) {
            this.isRojas = false;
        }
        setTipoFichas(isRojas);
        crearTablero(isRojas);
    }

    private String pintarFicha(String colorFondoFicha, String colorFicha, String caracter){
        return colorFondoFicha + colorFicha +caracter + Escribir.reset;
    }
    
    private void setTipoFichas(boolean isRojas) {
        if (isRojas) {
            this.fichaJ1 = pintarFicha(Escribir.frojo, Escribir.negro, " ● ");
            this.fichaJ2 = pintarFicha(Escribir.frojo, Escribir.blanco, " ● ");
        } else {
            this.fichaJ1 = pintarFicha(Escribir.fnegro, Escribir.rojo, " ● ");
            this.fichaJ2 = pintarFicha(Escribir.fnegro, Escribir.blanco, " ● ");
        }
    }

    private boolean condicion(int i, int j, boolean isRojas){
        if(isRojas){
            return (i % 2 != 0 && j % 2 == 0 || i % 2 == 0 && j % 2 != 0);
        } else{
            return !(i % 2 != 0 && j % 2 == 0 || i % 2 == 0 && j % 2 != 0);
        }
    }

    private void crearTablero(boolean isRojas) {
        iniciarTablero();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {

                if (condicion(i, j, isRojas)) {
                    if (i < 3)
                        tablero[i][j].ocuparCelda(isRojas, fichaJ1, 1);
                    else if (i > 4)
                        tablero[i][j].ocuparCelda(isRojas, fichaJ2, 2);
                    else
                        tablero[i][j].vaciarCelda(isRojas);
                } else {
                    tablero[i][j].vaciarCelda(!isRojas);
                }
                if (j < 8)
                    tablero[8][(j)].setContenido(Escribir.amarillo + "[" + (j + 1) + "]" + Escribir.reset);
            }
            if (i < 8)
                tablero[i][8].setContenido(Escribir.cyan + "[" + (i + 1) + "]" + Escribir.reset);
                tablero[8][8].setContenido("   ");
        }
    }

    public int moverPiezas(int iInicial, int jInicial, int iFinal, int jFinal){
        int movimiento = 1;
        Casilla aux;

        if (tablero[iFinal][jFinal].isOcupada()){
            if ((tablero[iInicial][jInicial]).getPistaPieza() < tablero[iFinal][jFinal].getPistaPieza()){
                //caso en que el jugador 1 come al jugador 2
                tablero[iFinal+1][jFinal+1].ocuparCelda(isRojas, fichaJ1, 1);
                tablero[iFinal][jFinal].vaciarCelda(this.isRojas); 
                tablero[iInicial][jInicial].vaciarCelda(this.isRojas); 
                System.out.println("1 come 2");
                movimiento = 2;
            } if((tablero[iInicial][jInicial]).getPistaPieza() > tablero[iFinal][jFinal].getPistaPieza()){
                //caso en el que el jugador 2 come al jugador 1
                tablero[iFinal+1][jFinal+1].ocuparCelda(isRojas, fichaJ2, 2);
                tablero[iFinal][jFinal].vaciarCelda(this.isRojas); 
                tablero[iInicial][jInicial].vaciarCelda(this.isRojas); 
                System.out.println("2 come 1");
                movimiento = 3;
            }
        } else {
            if((tablero[iInicial][jInicial]).getPistaPieza() == tablero[iFinal][jFinal].getPistaPieza()){
                //caso en el que se quiere mover a donde hay una pieza del mismo jugador    
                System.out.println("No puedes realizar este movimiento\nVuelve a intentarlo");
            }
             else {
                movimiento = 0;
                aux = tablero[iFinal][jFinal];
                tablero[iFinal][jFinal] = tablero[iInicial][jInicial];
                //tablero[iInicial][jInicial].vaciarCelda(!isRojas); 
                tablero[iInicial][jInicial] = aux;
            }
        }

        return movimiento;
    }



}
