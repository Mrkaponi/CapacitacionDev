public class PS10 {

    public static void printNumber(Integer number) {
        String parsedNumber = String.valueOf(number);

        if (parsedNumber.length() == 4) {
            for (int i = 0; i<parsedNumber.length(); i++) {
                System.out.println(parsedNumber.charAt(i));
            }
        }
        else {
            System.out.println("el numero no contiene 4 digitos");
        }
    }
}
