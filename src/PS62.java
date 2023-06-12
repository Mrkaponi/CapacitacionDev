import java.util.Random;

public class PS62 {
    private int monthlySaled;

    private int annualFactorySales;
    private static int[][] factory;


    public PS62() {
        factory = new int[5][12];
        for (int i = 0; i <= factory.length - 1; i++) {
            for (int j = 0; j < factory[i].length; j++) {
                factory[i][j] = new Random().nextInt(1000) + 100;
            }
        }
    }

    public void printReport() {
        for (int i = 0; i <= factory.length - 1; i++) {
            for (int j = 0; j < factory[i].length; j++) {
                System.out.printf("|%s| ", factory[i][j]);
            }
            System.out.println();
        }
    }

    //can be modified to calculate any selected mont
    public void calculateMonthlySale() {
        int accountant = 0;
        for (int i = 0; i < factory[0].length; i++) {
            monthlySaled = 0;
            System.out.println("|Dept1||Dept2||Dept3||Dept4||Dept5|");
            for (int j = 0; j < factory.length; j++) {
                monthlySaled += factory[j][i];
                annualFactorySales += factory[j][i];
                System.out.printf("| %s | ", factory[j][i]);
            }
            System.out.printf("\n venta total del mes numero %s  de la fabrica es = %s", ++accountant, monthlySaled);
            System.out.println(" ");
        }
        System.out.printf("\nla venta total del año es = %s", annualFactorySales);
    }

    //can be modified to calculate any selected mont
    public void maximumSalesInThemonth() {
        int auxMax = 0;
        int department = 0;
        for (int i = 0; i < factory.length; i++) {
            auxMax = factory[i][6];
            System.out.println(" " + auxMax);
            for (int j = 0; j < factory.length; j++) {
                if (auxMax <= factory[j][6]) {
                    auxMax = factory[j][6];
                    department = j + 1;
                }
            }
        }
        System.out.printf("La mayor venta de departamento en el mes de julio  es = %s ", auxMax);
        System.out.println("Corresponde al departamento numero  = " + (department));
    }

    public void calculateMaximumDepartmentSale() {
        int auxMax = 0;
        for (int i = 0; i < factory[0].length; i++) {
            auxMax = factory[2][i];
            System.out.print("  " + factory[2][i]);

            for (int j = 0; j < factory[0].length; j++) {
                if (factory[2][j] > auxMax) {

                    auxMax = factory[2][j];

                }

            }
        }
        System.out.println("\nLa mayor venta del del departamento 3 es = " + auxMax);


    }

    public void calculateMinimumDepartmentSale() {
        int auxMin = 0;
        for (int i = 0; i < factory[0].length; i++) {
            auxMin = factory[2][i];
            System.out.print("  " + factory[2][i]);

            for (int j = 0; j < factory[0].length; j++) {
                if (factory[2][j] <= auxMin) {

                    auxMin = factory[2][j];

                }

            }
        }
        System.out.println("\nLa menor  venta del del departamento 3 es = " + auxMin);


    }

}
