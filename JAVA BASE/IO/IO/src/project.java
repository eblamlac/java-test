import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class project {

    public static void main(String[] args)throws IOException {
        directorycopy();

    }

    private static void directorycopy() throws IOException{
        System.out.println("请输入想要复制的文件夹路径");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        File in = new File(a);
        System.out.println("请输入目标文件夹的路径");
        a = scan.nextLine();
        File out = new File(a);
        scan.close();
        dir(in, out);
    }
    private static void dir(File from, File to) throws IOException {
        InputStream in1 = null;
        OutputStream out1 = null;
        try {
            File fs[] = from.listFiles();
            for (int i = 0; i < fs.length; i++) {
                if (fs[i].isFile()) {
                    in1 = new BufferedInputStream(new FileInputStream(fs[i]));
                    File files1 = new File(to.getPath().toString() + "\\" + fs[i].getName().toString());
                    out1 = new BufferedOutputStream(new FileOutputStream(files1));
                    int c = 0;
                    while ((c = in1.read()) != -1) {
                        out1.write(c);
                    }
                    in1.close();
                    out1.close();
                } else if (fs[i].isDirectory()) {
                    File dirs1 = new File(to.getPath().toString() + "\\" + fs[i].getName().toString());
                    dirs1.mkdir();
                    System.out.println(dirs1.getPath());
                    dir(fs[i], dirs1);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } 

    }

    private static void filecopy() {
        System.out.println("请输入想要复制的文件路径");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        File in = new File(a);
        System.out.println("请输入目标文件路径");
        a = scan.nextLine();
        File out = new File(a);
        InputStream in1 = null;
        OutputStream out1 = null;

        scan.close();

        try {
            in1 = new BufferedInputStream(new FileInputStream(in));
            int b = 0;
            out1 = new BufferedOutputStream(new FileOutputStream(out));
            while ((b = in1.read()) != -1) {
                out1.write(b);
            }
            in1.close();
            out1.close();
            System.out.println("文件复制完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in1.close();
                out1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
