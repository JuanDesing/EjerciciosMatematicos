package Clases;

public class H_Num_Amig {

    private int sumadedivisores;

    public H_Num_Amig(int sumadedivisores) {
        this.sumadedivisores = sumadedivisores;
    }

    public H_Num_Amig() {
    }

    public int getSumadedivisores() {
        return sumadedivisores;
    }

    public void setSumadedivisores(int sumadedivisores) {
        this.sumadedivisores = sumadedivisores;
    }

    public static int Calcularsumadedivisorespropios(int num) {

        int res = 0, sumadedivisores = 0;
        for (int i = 1; i <= (num - 1); i++) {

            res = num % i;
            if (res == 0) {
                sumadedivisores = sumadedivisores + i;
            }

        }

        return sumadedivisores;
    }

}
