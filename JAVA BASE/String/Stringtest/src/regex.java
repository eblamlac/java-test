import java.util.Scanner;


public class regex {
    public static void main(String[] args) {
        Scanner my_scanner = new Scanner(System.in);
        String b=my_scanner.nextLine();
        my_scanner.close();
        String regex="[0-9]{17}[0-9Xx]";
        if(b.matches(regex)){
 System.out.println("ok");
        }else{
            System.out.println("no ok");
        }

    }
}
