
package Clases;

public class N_Programa_Vac {

    public static int calculoedad(int añodenacimiento, int añoactual) {
        /*Period periodo = Period.between(fechanacimiento, fechactual);
        int edad = periodo.getYears();*/
        int edad = añoactual - añodenacimiento;
        return edad;
    }

    public static int vacunar(int edad, int sexo) {
        int codigo = 0;

        if (edad >= 15 && edad <= 17 && sexo == 0) {
            codigo = 01;
        } else if (edad >= 15 && edad <= 17 && sexo == 1) {
            codigo = 02;
        } else if (edad >= 18 && edad <= 21 && sexo == 0) {
            codigo = 03;
        } else if (edad >= 18 && edad <= 21 && sexo == 1) {
            codigo = 04;
        } else if (edad >= 22 && sexo == 0 || sexo == 1) {
            codigo = 05;
        }

        return codigo;
    }

}
