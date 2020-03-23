package Clases;

public class C_Numero_Perf_Deficiente_Abund {

    private int numero;

    public C_Numero_Perf_Deficiente_Abund(int numero) {
        this.numero = numero;
    }

    public C_Numero_Perf_Deficiente_Abund() {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static boolean Calcularsiesperfecto(int num) {

        boolean esperfecto = false;

        int res = 0, sumadedivisores = 0;
        for (int i = 1; i <= (num - 1); i++) {

            res = num % i;
            if (res == 0) {
                sumadedivisores = sumadedivisores + i;
            }
            if (i == num - 1) {
                if (sumadedivisores == num) {
                    esperfecto = true;
                }
            }
        }

        return esperfecto;
    }

    public static boolean Calcularsiesdeficiente(int num) {

        boolean esdeficiente = false;

        int res = 0, sumadedivisores = 0;
        for (int i = 1; i <= (num - 1); i++) {

            res = num % i;
            if (res == 0) {
                sumadedivisores = sumadedivisores + i;
            }
            if (i == num - 1) {
                if (sumadedivisores < num) {
                    esdeficiente = true;
                }
            }
        }

        return esdeficiente;
    }

    public static boolean Calcularsiesabundante(int num) {

        boolean esabundante = false;

        int res = 0, sumadedivisores = 0;
        for (int i = 1; i <= (num - 1); i++) {

            res = num % i;
            if (res == 0) {
                sumadedivisores = sumadedivisores + i;
            }
            if (i == num - 1) {
                if (sumadedivisores > num) {
                    esabundante = true;
                }
            }
        }

        return esabundante;
    }

}
