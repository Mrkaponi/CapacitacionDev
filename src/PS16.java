import javax.swing.*;

public class PS16 {


    private Float dollar;
    private Float currencyExchange
    ;
    private Float moneyMexicano;

    public void calculateChangue() {
        dollar = Float.valueOf(JOptionPane.showInputDialog("ingresa dolares"));

        currencyExchange = Float.valueOf(JOptionPane.showInputDialog("ingrese la cnversion actual"));

        moneyMexicano = dollar * currencyExchange;

        JOptionPane.showMessageDialog(null, String.format("cambio a pesos mexicanos es de  %.4f ", moneyMexicano));

    }
}

