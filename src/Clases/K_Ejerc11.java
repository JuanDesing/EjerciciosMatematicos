package Clases;

public class K_Ejerc11 {

    private int resultado;

    public K_Ejerc11() {
    }

    public K_Ejerc11(int resultado) {
        this.resultado = resultado;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public static boolean verificarqueseade6digitos(int num) {
        boolean esde6digitos = false;

        int cantidadedigitos = String.valueOf(num).length();

        if (cantidadedigitos == 6) {
            esde6digitos = true;
        }

        return esde6digitos;
    }

    public static int potenciadez(int z, int y) {
        int potenciadez = (int) Math.pow(z, y);

        return potenciadez;
    }

    public static int factorialnumerador(int x) {
        int factorialnumerador = 0;
        int res = 0;
        int num1 = 1;

        for (int i = 2; i <= x; i++) {
            res = num1 * i;
            num1 = res;
        }

        return res;
    }

    public static int factorialdenominador(int x, int z) {
        int numero = x + z;

        int res = 0;
        int num1 = 1;

        for (int i = 2; i <= numero; i++) {
            res = num1 * i;
            num1 = res;
        }

        return res;
    }

    public static int calcular(int num) {
        int resultado = 0;

        int z = num % 100;
        num = num / 100;
        int y = num % 100;
        num = num / 100;
        int x = num % 100;

        //resultado = (int) (factorialnumerador(x) + potenciadez(z, y)) / factorialdenominador(x, z);

        return resultado;
    }

}
