public class PS25 {



    public void calculateDiscount(Integer com) {
        int discount = 0;

        if (com < 800) {
            System.out.println("No se aplica descuento. Precio total = " + com);
        } else if (com <= 1500) {
            discount = (int) (com * 0.10);
            System.out.println("Se aplica un descuento del 10%. El precio total es = " + (com - discount));
        } else if (com <= 5000) {
            discount = (int) (com * 0.15);
            System.out.println("Se aplica un descuento del 15%. El precio total es de = " + (com - discount));
        } else {
            discount = (int) (com * 0.20);
            System.out.println("Se aplica un descuento del 20%. El precio total es de = " + (com - discount));
        }
    }

}
