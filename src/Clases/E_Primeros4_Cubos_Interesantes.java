
package Clases;

public class E_Primeros4_Cubos_Interesantes {

    private int num;

    public E_Primeros4_Cubos_Interesantes(int num) {
        this.num = num;
    }

    public E_Primeros4_Cubos_Interesantes() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static String calcular4primeroscubosinteresantes() {
        int sumadeexponentes = 0;
        String respuesta = "";

        int c = 0;
        int numero = 100;

        while (c < 4) {
            int num = numero;
            while (num > 0) {
                int cifra = num % 10;
                num = num / 10;

                sumadeexponentes += (int) Math.pow(cifra, 3);
            }
            //JOptionPane.showMessageDialog(null, "la suma de los cubos de sus dígitos es: " + sumadeexponentes);
            if (sumadeexponentes == numero) {
                respuesta += numero + "  ";
                c++;
            }
            sumadeexponentes = 0;
            numero++;
        }

        return respuesta;
    }
}
