package src.Textos;

public class Escribir {
      //colores para las letras
      public final static String negro = "\u001b[30m";
      public final static String reset = "\u001b[0m";
      public final static String rojo = "\u001b[31m";
      public final static String verde = "\u001b[32m";
      public final static String azul = "\u001b[34m";
      public final static String magenta = "\u001b[35m";
      public final static String cyan = "\u001b[36m";
      public final static String blanco = "\u001b[37m";
      public final static String amarillo = "\u001b[33m";
      //colores para el fondo
      public final static String frojo = "\u001b[41m";
      public final static String fverde = "\u001b[42m";
      public final static String fazul = "\u001b[44m";
      public final static String fmagenta = "\u001b[45m";
      public final static String fcyan = "\u001b[46m";
      public final static String fblanco = "\u001b[47m";
      public static final String fnegro = "\u001B[40m";
      public final static String famarillo = "\u001b[43m";
      //mas colores hechos
      public final static String naranja = amarillo + rojo;
      public final static String cafe = azul + amarillo + rojo;

    public static void titulo(){
        System.out.println("\n\n   ___    ___    __  ___   ___    ____       _____   __ __   ____   _  __   ___    ____");
        System.out.println("  / _ \\  / _ |  /  |/  /  / _ |  / __/      / ___/  / // /  /  _/  / |/ /  / _ |  / __/");
        System.out.println(" / // / / __ | / /|_/ /  / __ | _\\ \\       / /__   / _  /  _/ /   /    /  / __ | _\\ \\  ");
        System.out.println("/____/ /_/ |_|/_/  /_/  /_/ |_|/___/       \\___/  /_//_/  /___/  /_/|_/  /_/ |_|/___/  \n\n");
    }

    public static void menuPrincipal(){
        System.out.println("\n\n                                             _               _                 __");
        System.out.println("  __ _  ___   ___  __ __        ___   ____  (_)  ___  ____  (_)   ___  ___ _  / /");
        System.out.println(" /  ' \\/ -_) / _ \\/ // /       / _ \\ / __/ / /  / _ \\/ __/ / /   / _ \\/ _ `/ / / ");
        System.out.println("/_/_/_/\\__/ /_//_/\\_,_/       / .__//_/   /_/  /_//_/\\__/ /_/   / .__/\\_,_/ /_/  ");
        System.out.println("                             /_/                               /_/               \n\n");
    }

    public static void participantes(){
        System.out.println("\n\n ____    __    ____  ____  ____   ___  ____  ____    __    _  _  ____  ____  ___ ");
        System.out.println("(  _ \\  /__\\  (  _ \\(_  _)(_  _) / __)(_  _)(  _ \\  /__\\  ( \\( )(_  _)( ___)/ __)");
        System.out.println(" )___/ /(__)\\  )   /  )(   _)(_ ( (__  _)(_  )___/ /(__)\\  )  (   )(   )__) \\__ \\");
        System.out.println("(__)  (__)(__)(_)\\_) (__) (____) \\___)(____)(__)  (__)(__)(_)\\_) (__) (____)(___/\n\n");
    }

    public static void tablero(){
        System.out.println("\n\n ____    __    ____  __    ____  ____  _____ ");
        System.out.println("(_  _)  /__\\  (  _ \\(  )  ( ___)(  _ \\(  _  )");
        System.out.println("  )(   /(__)\\  ) _ < )(__  )__)  )   / )(_)( ");
        System.out.println(" (__) (__)(__)(____/(____)(____)(_)\\_)(_____)\n\n");
    }

    public static void limpiadorPantalla(){
        for(int i=0; i<50; i++){
            System.out.println("");
        }
    }
}
