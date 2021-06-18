package src.Textos;

public class Escribir {
    
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
        System.out.println("                                   /_/                               /_/               \n\n");
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
