package Clases;

public class L_Definitiva_Universitario {

    private int codigo;
    private float corte1, corte2, corte3, promedio3cortes, cuantodebesacar;

    public L_Definitiva_Universitario(int codigo, float corte1, float corte2, float corte3, float promedio3cortes, float cuantodebesacar) {
        this.codigo = codigo;
        this.corte1 = corte1;
        this.corte2 = corte2;
        this.corte3 = corte3;
        this.promedio3cortes = promedio3cortes;
        this.cuantodebesacar = cuantodebesacar;
    }

    public int getCodigo() {
        return codigo;
    }

    public float getPromedio3cortes() {
        return promedio3cortes;
    }

    public void setPromedio3cortes(float promedio3cortes) {
        this.promedio3cortes = promedio3cortes;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getCorte1() {
        return corte1;
    }

    public void setCorte1(float corte1) {
        this.corte1 = corte1;
    }

    public float getCorte2() {
        return corte2;
    }

    public void setCorte2(float corte2) {
        this.corte2 = corte2;
    }

    public float getCorte3() {
        return corte3;
    }

    public void setCorte3(float corte3) {
        this.corte3 = corte3;
    }

    public float getCuantodebesacar() {
        return cuantodebesacar;
    }

    public void setCuantodebesacar(float cuantodebesacar) {
        this.cuantodebesacar = cuantodebesacar;
    }

    public L_Definitiva_Universitario() {
    }

    public static float metodoacumulado(float nota1, float nota2, float nota3, float nota4, float nota5) {

        float definitivadelcorte = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        return definitivadelcorte;
    }

    public static float metodocalculo(float promedio3cortes) {

        float notafinal = (float) (6.0 - promedio3cortes); 

        return notafinal;
    }

}
