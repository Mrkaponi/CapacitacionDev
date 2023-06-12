import javax.swing.*;

public class PS32 {

    private int n;
    private double result;
    private static final int DENOMINADOR = 1;


    public void calulated() {
        this.n = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero de la serie"));

        for (int i = 1; i <= n; i++) {

            result = result + ((double) DENOMINADOR / i);
            System.out.printf("+ %s/%s  ", DENOMINADOR,i);

        }
        System.out.printf("\nresultado de la serie es = %.4f%n",result);
    }
}
