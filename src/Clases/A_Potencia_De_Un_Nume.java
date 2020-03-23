
package Clases;

public class A_Potencia_De_Un_Nume {
    
    private double resultado;

    public A_Potencia_De_Un_Nume(double resultado) {
        this.resultado = resultado;
    }

    public A_Potencia_De_Un_Nume() {
    }
    
    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public static double calcularlapotencia (int base, int exponente){
        
        double potencia = Math.pow(base, exponente);
        
        return potencia;
    }
    
}
