package unit;
public class suanfa {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i=0;i<33;i++) {
            System.out.println(a);
            b=c;
            c=a;
            if (a == 0) {
                a = 1;
            }else{
                a=b+c;
            }
        } 
    }
}
