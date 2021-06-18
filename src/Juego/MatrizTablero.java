package src.Juego;

import src.Textos.*;

public class MatrizTablero {
    private String[][] tablero = new String[9][9];
    private String fichaJ1 = Escribir.negro  +" Ø " +Escribir.reset;
    private String fichaJ2 = Escribir.blanco +" Ø " +Escribir.reset;

    public MatrizTablero() {
        crearTablero();
    }

    public void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }
    }

    private void crearTablero() {
        /**
        * llenamos la matriz tomando en cuenta que: 
        * i%2!=0 && j%2==0 >>> celda[impar, par]
        * i%2!=0 && j%2!=0 >>> celda[impar, impar]
        * i%2==0 && j%2==0 >>> celda[par, par]
        * i%2==0 && j%2!=0 >>> celda[par, impar]
        */

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (i % 2 != 0 && j % 2 == 0 || i % 2 == 0 && j % 2 != 0) {
                    if (i<3)
                        tablero[i][j] = Escribir.frojo + fichaJ1 + Escribir.reset;
                    else if (i>4)
                    tablero[i][j] = Escribir.frojo + fichaJ2 + Escribir.reset;
                    else
                        tablero[i][j] = Escribir.frojo + "   " + Escribir.reset;
                } else {
                    tablero[i][j] = Escribir.fnegro + "   " + Escribir.reset;
                }
                if (j < 8)
                    tablero[8][(j)] = Escribir.amarillo + "[" + (j + 1) + "]" + Escribir.reset;
            }
            if (i < 8)
                tablero[i][8] = Escribir.cyan + "[" + (i + 1) + "]" + Escribir.reset;
        }
    }

    public String getTablero(int i, int j){
        return tablero[i][j];
    }

}
