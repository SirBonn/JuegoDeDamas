package src.Jugador;

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
    private boolean ganador;

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
    }

    /** Inician getters y setters */
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void isGanador(boolean ganador) {
        this.ganador = ganador;
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

    public int getPartidasGanadas(){
        return this.partidasGanadas;
    }

    public String getDatosJugador(){
        String jugador;
        jugador = "Nombre: " +this.nombre +"\n   Edad: " +this.edad +"\n";
        return jugador;
    }

    public String getReportePartidas() {
        return " " + this.nombre + " tiene: \n\t-> " + this.partidasGanadas + " Victorias" + "\n\t-> "
                + this.partidasPerdidas + " Derrotas";
    }

}
