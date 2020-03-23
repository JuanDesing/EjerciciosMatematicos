package Clases;

public class G_Ejerc7 {

    private int resultado;

    public G_Ejerc7(int resultado) {
        this.resultado = resultado;
    }

    public G_Ejerc7() {
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public static int factorialnumerador(int x) {
        int factorialnumerador = 0;
        int mult = 1;

        for (int multr = 2; multr <= (1 + x); multr++) {
            factorialnumerador = mult * multr;
            mult = factorialnumerador;
        }

        return factorialnumerador;
    }

    public static int factorialdeN(int N) {
        int factorialnumerador = 0;
        int mult = 1;

        for (int multr = 2; multr <= N; multr++) {
            factorialnumerador = mult * multr;
            mult = factorialnumerador;
        }

        return factorialnumerador;
    }

    public static int potencianumerador(int x, int N) {
        int potencianumerador = 0;
        
        potencianumerador = (int) Math.pow((N+factorialnumerador(x)), x);
        
        return potencianumerador;
    }

    public static int potenciadenominador(int x, int N) {
        int potenciadenominador = 0;
        
        potenciadenominador = (int) Math.pow((x*2), factorialdeN(N));

        return potenciadenominador;
    }

}
