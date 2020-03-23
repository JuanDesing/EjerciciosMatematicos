package Clases;

public class I_Acum_Perf {

    private int acum_perfectos;

    public I_Acum_Perf(int acum_perfectos) {
        this.acum_perfectos = acum_perfectos;
    }

    public I_Acum_Perf() {
    }

    public int getAcum_perfectos() {
        return acum_perfectos;
    }

    public void setAcum_perfectos(int acum_perfectos) {
        this.acum_perfectos = acum_perfectos;
    }
    
    public static boolean evalua_perfectos(int i) {

        boolean esperfecto = false;
        int sumadedivisores = 0;

        for (int j = 1; j <= (i - 1); j++) {

            int res = i % j;
            if (res == 0) {
                sumadedivisores = sumadedivisores + j;
            }
            if (j == i - 1) {
                if (sumadedivisores == i) {
                    esperfecto = true;
                }
            }
        }
        return esperfecto;
    }

    public static int acum_perfectos(int num) {

        int acumperfectos = 0;

        for (int i = 1; i <= num; i++) {

            if (I_Acum_Perf.evalua_perfectos(i) == true) {
                acumperfectos += i;
            }
        }
        return acumperfectos;
    }
}
