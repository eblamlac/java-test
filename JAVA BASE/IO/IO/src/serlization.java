import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serlization {
    public static void main(String[] args) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("./test1.txt")));
            serlization1 a = new serlization1("jack", 14);
            out.writeObject(a);
            System.out.println("序列化成功");
            out.close();
            unserlization cc = new unserlization();
        } catch (IOException e) {
            System.out.println("序列化失败");
            e.printStackTrace();

        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class unserlization {
    public unserlization() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("./test1.txt"));
            Object o = in.readObject();
            System.out.println(o);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException v) {
            v.printStackTrace();
        }
    }
}

class serlization1 implements Serializable {

    public serlization1() {

    };

    public serlization1(String name, int age) {
        this.age = age;
        this.name = name;

    }

    @Override
    public String toString() {
        return this.getName();

    }

    private static final long serialVersionUID = 1L;
    private String name = "";
    private int age = 11;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}