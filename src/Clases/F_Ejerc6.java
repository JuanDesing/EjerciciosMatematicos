package Clases;

public class F_Ejerc6 {

    private int sumadivisorespares;
    private int sumadividoresimp;
    private int cantcifrasdelnumero;

    public F_Ejerc6(int sumadivisorespares, int sumadividoresimp, int cantcifrasdelnumero) {
        this.sumadivisorespares = sumadivisorespares;
        this.sumadividoresimp = sumadividoresimp;
        this.cantcifrasdelnumero = cantcifrasdelnumero;
    }

    public F_Ejerc6() {
    }

    public int getSumadivisorespares() {
        return sumadivisorespares;
    }

    public void setSumadivisorespares(int sumadivisorespares) {
        this.sumadivisorespares = sumadivisorespares;
    }

    public int getSumadividoresimp() {
        return sumadividoresimp;
    }

    public void setSumadividoresimp(int sumadividoresimp) {
        this.sumadividoresimp = sumadividoresimp;
    }

    public int getCantcifrasdelnumero() {
        return cantcifrasdelnumero;
    }

    public void setCantcifrasdelnumero(int cantcifrasdelnumero) {
        this.cantcifrasdelnumero = cantcifrasdelnumero;
    }

    public static int valordex(int num) {

        int sumadedivisorespares = 0;
        //int sumadedivisoresimp = 0;

        for (int i = 2; i <= num; i += 2) {
            if (num % i == 0) {
                sumadedivisorespares += i;
            }
            //JOptionPane.showMessageDialog(null, "La suma de los divisores impares es esta: "+sumadedivisorespares);
        }

        return sumadedivisorespares;
    }

    public static int valordey(int num) {

        //int sumadedivisorespares = 0;
        int sumadedivisoresimp = 0;

        for (int i = 1; i <= num; i += 2) {
            if (num % i == 0) {
                sumadedivisoresimp += i;
            }
            //JOptionPane.showMessageDialog(null, "La suma de los divisores impares es esta: "+sumadedivisoresimp);
        }

        return sumadedivisoresimp;
    }

}
