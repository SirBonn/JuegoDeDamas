package src.Juego;

public class Arbitro {

    public static boolean puedeComer(Casilla quieroComer, Casilla come, Casilla salto) {
        boolean puedeComer = true;

        if (salto.isOcupada()) {
            puedeComer = false;
            System.out.println("No puedes comer a esa pieza");
        }
        return puedeComer;
    }

    public static boolean verificarMovimiento(int turno, Casilla casillaE, boolean isPrimeraFase, int iF, int i){
        boolean isCorrecto = false;
        if (isPrimeraFase){
            if(casillaE.getPistaPieza() == 1){
                System.out.println("\nmueve negras");
                isCorrecto = true;
            } if(casillaE.getPistaPieza() == 2){
                isCorrecto = true; 
                System.out.println("\nmueve blancas");
            }    
        } else {
            if (turno == 1 && iF<i){
                isCorrecto = true;
                System.out.println("\nmovio blancas");

            }
            if (turno == 2 && iF>i){
                System.out.println("movio negras");
                isCorrecto = true;
            }
        }
        return isCorrecto;
    }
}
