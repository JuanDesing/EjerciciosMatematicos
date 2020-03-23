
package Clases;

public class D_Suma_Cifras_Par_Imp {

    private int num;

    public D_Suma_Cifras_Par_Imp(int num) {
        this.num = num;
    }

    public D_Suma_Cifras_Par_Imp() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public static String calcularsumadepareseimpares(int num) {

        String respuesta = "";
        int sumadepares = 0;
        int sumadeimp = 0;

        while (num > 0) {
            int cifra = num % 10;

            if (cifra % 2 == 0) {
                sumadepares += cifra;
            } else {
                sumadeimp += cifra;
            }

            num = num / 10;
        }

        respuesta = "La suma de las cifras pares es: " + sumadepares
                + "\nLa suma de las cifras impares es: " + sumadeimp;

        return respuesta;
    }

}
