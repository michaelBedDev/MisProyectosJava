package ruleta;

public class Resultado {
    private int[] numerosApostados;
    private double apuestaFinal;
    private float banca;

    public Resultado(int[] numerosApostados, double apuestaFinal, float banca) {
        this.numerosApostados = numerosApostados;
        this.apuestaFinal = apuestaFinal;
        this.banca = banca;
    }

    public int[] getNumerosApostados() {
        return numerosApostados;
    }

    public double getApuestaFinal() {
        return apuestaFinal;
    }

    public float getBanca() {
        return banca;
    }
}

