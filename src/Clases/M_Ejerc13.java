package Clases;

public class M_Ejerc13 {

    public static boolean espar(int numero) {

        boolean espar = false;

        if (numero % 2 == 0) {
            espar = true;
        }

        return espar;
    }

    public static boolean escapicua(int numero) {

        boolean escapicua = false;
        String numeroinvertido = "";
        int num = numero;

        while (numero != 0) {

            int res = numero % 10;
            numeroinvertido += res;
            numero = numero / 10;

        }

        if (num == Integer.parseInt(numeroinvertido)) {
            escapicua = true;
        }

        return escapicua;
    }

    public static boolean esmultiplode4(int numero) {

        boolean esmultiplode4 = false;

        if (numero % 4 == 0) {
            esmultiplode4 = true;
        }

        return esmultiplode4;
    }

    public static boolean terminaen8(int numero) {

        boolean terminaen8 = false;

        if (numero % 10 == 8) {
            terminaen8 = true;
        }

        return terminaen8;
    }

}
