import javax.swing.*;

public class PS31 {

    private int number;


    public void generateMultiplicationTable() {
        this.number = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero que deseas calcular"));
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresas hasta que numero quieres generar la tabla de multiplciacion"));
        for (int i = 1; i <=+ option; i++) {
            System.out.printf("\n %s * %s = %d", number, i, (Integer)(number * i));
        }
    }
}
