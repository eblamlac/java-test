import java.util.ArrayList;
import java.util.List;

public class fanxing {
    public static void main(String[] args) {
        List<Integer> My = new ArrayList<>();
         My.add(11);
        Integer[] a = { 1, 2, 3, 4, 5 };
        print(a);
        String[] b = { "aaa", "bbb", "cccc" };
        print(b);
        Double[] c = { 11.222, 22.111, 212.1111 };
        print(c);
    }
    private static <SSSAA> void print(SSSAA y[]) {
        for (SSSAA d : y)
            System.out.println(d);
    }
}
