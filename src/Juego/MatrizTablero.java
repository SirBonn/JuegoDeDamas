package src.Juego;

import src.Textos.*;

public class MatrizTablero {
    private String[][] tablero = new String[9][9];
    private static String celdaRfichaJ1 =Escribir.frojo +  Escribir.negro + " Ø " + Escribir.reset + Escribir.reset;
    private static String celdaRfichaJ2 = Escribir.frojo +  Escribir.blanco + " Ø " + Escribir.reset + Escribir.reset;
    private static String celdaRoja = Escribir.frojo + "   " + Escribir.reset;
    private static String celdaNegra = Escribir.fnegro + "   " + Escribir.reset;

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
         * i%2!=0 && j%2==0 >>> celda[impar,par] -- color rojo 
         * i%2==0 && j%2!=0 >>> celda[par, impar] -- color rojo
         * i%2==0 && j%2==0 >>> celda[par, par] -- color negro 
         * i%2!=0 && j%2!=0 >>> celda[impar, impar] -- color negro
         */

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (i % 2 != 0 && j % 2 == 0 || i % 2 == 0 && j % 2 != 0) {
                    if (i < 3)
                        tablero[i][j] = celdaRfichaJ1;
                    else if (i > 4)
                        tablero[i][j] = celdaRfichaJ2;
                    else
                        tablero[i][j] = celdaRoja;
                } else {
                    tablero[i][j] = celdaNegra;
                }
                if (j < 8)
                    tablero[8][(j)] = Escribir.amarillo + "[" + (j + 1) + "]" + Escribir.reset;
            }
            if (i < 8)
                tablero[i][8] = Escribir.cyan + "[" + (i + 1) + "]" + Escribir.reset;
        }
    }

    public void setCeldaVieja(int i, int j) {
        tablero[i][j] = comprobarCelda(i, j);
    }

    private String comprobarCelda(int i, int j){
        String celda = "   ";
        
            if (i%2!=0 && j%2==0 || i%2==0 && j%2!=0){
                celda = celdaRoja;
            }
            if ( i%2==0 && j%2==0 || i%2!=0 && j%2!=0){
                celda = celdaNegra;
            }

        return celda;
    }


}
