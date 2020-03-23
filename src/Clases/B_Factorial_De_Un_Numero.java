package Clases;

public class B_Factorial_De_Un_Numero {

    private int num;

    public B_Factorial_De_Un_Numero(int num) {
        this.num = num;
    }

    public B_Factorial_De_Un_Numero() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static String calcularfactorialdeunnumero(int num) {

        String factorial = " ";
        int num1 = 1;

        for (int i = 2; i <= num; i++) {
            int res = num1 * i;
            factorial += ("  " + num1 + "*" + i + "=" + res + '\n');
            //factorial += '\n';
            num1 = res;
        }

        return factorial;
    }
}
