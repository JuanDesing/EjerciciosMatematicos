/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author USUARIO
 */
public class J_Num_Narc {

    public static int calcularresultdeldígitoelevadoaxpotencia(int cifra, int exponente) {

        int sumaexponentes = (int) Math.pow(cifra, exponente);

        return sumaexponentes;
    }

    public static String calcularlosnumerosnarcisistas(int numero) {

        String numerosnarcisistas = "";
        int cont = 1;

        int Sumatotaldeexponentes = 0;

        for (int i = 1; i <= numero; i++) {
            int potencia = String.valueOf(i).length();
            int j = i;

            while (j > 0) {
                int cifras = j % 10;

                Sumatotaldeexponentes += calcularresultdeldígitoelevadoaxpotencia(cifras, potencia);
                j = j / 10;
            }
            if (Sumatotaldeexponentes == i) {
                numerosnarcisistas += cont + ") " + i + "\n";
                cont++;
            }
            Sumatotaldeexponentes = 0;
        }

        return numerosnarcisistas;
    }

}
