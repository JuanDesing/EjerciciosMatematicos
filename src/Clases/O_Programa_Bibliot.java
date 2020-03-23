package Clases;

public class O_Programa_Bibliot {

    public static boolean Validar_Codigo(int codigo) {

        boolean codigovalidado = false;

        int cantidad = String.valueOf(codigo).length();

        int area = codigo / 100000;
        int cantexistentes = (codigo / 1000) % 100;

        if (cantidad == 8 && area >= 101 && area <= 108 && cantexistentes != 0) {
            codigovalidado = true;
        }

        return codigovalidado;
    }

    public static boolean Realizar_Prestamo(int codigo) {

        boolean sepuedeprestar = false;

        int area = codigo / 100000;

        if (area == 101 || area == 102 || area == 104) {
            sepuedeprestar = true;
        }
        return sepuedeprestar;
    }

    public static int Recibir_Libro_Prestado(int codigo) {

        int valoracobrarporellibro = 0;

        int cantexistentes = (codigo / 1000) % 100;

        if (cantexistentes >= 1 && cantexistentes <= 2) {
            valoracobrarporellibro = 2000;
        } else if (cantexistentes >= 3 && cantexistentes <= 6) {
            valoracobrarporellibro = 1000;
        } else if (cantexistentes > 6) {
            valoracobrarporellibro = 500;
        }

        return valoracobrarporellibro;
    }

}
