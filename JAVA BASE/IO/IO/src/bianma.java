import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class bianma {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        try {
            OutputStreamWriter a = new OutputStreamWriter(new FileOutputStream("./test1.txt"), "utf8");
            a.write("纳尼");
            a.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
