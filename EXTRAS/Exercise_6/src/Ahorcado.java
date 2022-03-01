public class Ahorcado  {
    private String[] palabra;
    private int cantEncontradas;
    private int contJugadasMax;

    public Ahorcado(String[] palabra, int cantEncontradas, int contJugadasMax) {
        this.palabra = palabra;
        this.cantEncontradas = cantEncontradas;
        this.contJugadasMax = contJugadasMax;
    }

    public Ahorcado() {
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantEncontradas() {
        return cantEncontradas;
    }

    public void setCantEncontradas(int cantEncontradas) {
        this.cantEncontradas = cantEncontradas;
    }

    public int getContJugadasMax() {
        return contJugadasMax;
    }

    public void setContJugadasMax(int contJugadasMax) {
        this.contJugadasMax = contJugadasMax;
    }
}
