package Clases;

public class P_Ejercicio16 {

    public static boolean Verificarsiesde6digitos(int num) {
        boolean esde6digitos = false;

        int cantidaddecifras = String.valueOf(num).length();

        if (cantidaddecifras == 6) {
            esde6digitos = true;
        }

        return esde6digitos;
    }

    public static String Generar_Tablas_De_Mult(int a, int b) {
        
        String tablasdemultiplicar = "";

        for (int i = a; i <= b; i++) {
            //JOptionPane.showMessageDialog(null, i);
            for (int j = 1; j <= 10; j++) {
                int res = i * j;
                tablasdemultiplicar += i + " X " + j + " = " + res + "\n";
                //JOptionPane.showMessageDialog(null, tablasdemultiplicar);
            }
            tablasdemultiplicar += "\n\n";
        }

        return tablasdemultiplicar;
    }

}
