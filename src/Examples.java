import javax.swing.*;

public class Examples {
    public static void main(String[] args) {


        int options = Integer.parseInt(JOptionPane.showInputDialog("""
                seleccion la opccion que dese\s
                1.- Para casa de cambio (PS16)
                2.- Para ia aplicacion de las x (PS17)
                3.- Para imprimir el numero (PS10)
                4.- Para imprimir el precio del prolducto (PS22)
                5.- Para calcular el descuento (PS25)
                6.- Para calcualr el numero mayor  (PS26)
                7.- Para generar la tabla de multiplicacion (PS31)
                8.- Para calcular una serie numerica   (PS32)
                9.- Para generar reportes de la fabrica  (PS62)"""
        ));
        switch (options) {
            case 1 -> {
                PS16 changCurrencyexchangehouse = new PS16();
                changCurrencyexchangehouse.calculateChangue();
            }
            case 2 -> PS17.print();

            case 3 -> {
                int number = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el numero a imprimir"));
                PS10.printNumber(number);
            }
            case 4 -> {
                PRS22 ps22 = new PRS22();
                ps22.calculate(Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el precio del producto")));
            }
            case 5 -> {
                PS25 ps25 = new PS25();
                ps25.calculateDiscount((Integer.valueOf(JOptionPane.showInputDialog(null, "Ingresa el total de la venta para calcular el descuento "))));
            }
            case 6 -> {
                PS26 ps26 = new PS26();
                ps26.setAllValues(6, 2, 10);
                ps26.maxValue();
            }
            case 7 -> {
                PS31 ps31 = new PS31();
                ps31.generateMultiplicationTable();
            }
            case 8 -> {
                PS32 ps32 = new PS32();
                ps32.calulated();
            }
            case 9 -> {
                PS62 ps62 = new PS62();
                ps62.printReport();

                System.out.println();


                System.out.println();
                ps62.calculateMonthlySale();
                System.out.println();
                ps62.maximumSalesInThemonth();
                ps62.calculateMaximumDepartmentSale();
                ps62.calculateMinimumDepartmentSale();
            }
            default -> System.out.println(" no encontrado");
        }


    }

}