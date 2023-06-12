public class PRS22 {

    private double pre;
    private static final double MINIMUM_PRICE_PRODUCT = 1500;

    private static final double PERCENTAGE = .11;


    public void calculate(double price) {
        pre = price;
        if (pre < MINIMUM_PRICE_PRODUCT) {
            pre += (price * PERCENTAGE);

            System.out.println("el nuevo precio del producto es =" + pre);
        } else {
            System.out.println("el precio del producto se mantiene igual = " + pre);
        }

    }

}
