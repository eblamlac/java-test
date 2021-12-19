import java.io.*;

public class test33 {

    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./test2.txt"));
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
        
            
            bis.mark(6);// 6.0中不管读多少mark仍然有效
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
        
            bis.reset();
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
