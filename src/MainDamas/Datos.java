package src.MainDamas;
import java.util.*;

public class Datos {

    static Scanner sc = new Scanner(System.in);

    private static void mostrarMensaje(String mensaje){
        System.out.print("\n"+mensaje+" ");
    }

    public static int getEntero(String mensaje, boolean isNegativo){
        mostrarMensaje(mensaje);
        int tmp = Integer.parseInt(sc.nextLine());

        if( isNegativo ){
            return tmp;
        }

        if (tmp<0){
            do{
                mostrarMensaje("\n\n El dato ingresdo no puede ser negativo\n");
                mostrarMensaje(mensaje);
                tmp = Integer.parseInt(sc.nextLine());
            } while(tmp<0);
        }

        return tmp;
    } 

    public static String getTexto(String mensaje){
        mostrarMensaje(mensaje);
        String texto = sc.nextLine();
        return texto;
    }

    public static void esperar(String texto){
        System.out.println(texto);
        String tmp = sc.nextLine();
        tmp.length();
    }
}
