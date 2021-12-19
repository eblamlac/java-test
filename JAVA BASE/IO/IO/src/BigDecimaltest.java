import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimaltest {
    public static void main(String[] args) {
        method2();
    }

    private static void method2() {
        Scanner a = new Scanner(System.in);
        double c = a.nextDouble();
        double b = a.nextDouble();
        a.close();
        BigDecimal bd1 = new BigDecimal(b+"");
        BigDecimal bd2 = new BigDecimal(c+"");
        BigDecimal bd4;
        bd4 = bd1.add(bd2);
  System.out.println(bd4);
    }
}