public class test {
    public static void main(String[] args) {
        nani b = new nani();
        b.test11();
        b.test12();
    }
}

class nani {
    public nani() {
        super();
        a = "aaaaaa";
        System.out.println(a);
    }

    String a = new String("nan");

    public void test11() {
        StringBuffer b = new StringBuffer();
        long c = System.currentTimeMillis();
        for (int a = 1; a < 10000; a++) {
            b.append(this.a);// 原本使用+=需要170毫秒但是使用StringBuff或者StringBuilder可以做到只有16毫秒StringBuff的安全性更好StringBuilder的效率更高但是安全不行.
        }
        long e = System.currentTimeMillis();
        System.out.println(e - c);
   
    }

    public void test12() {
        StringBuilder b = new StringBuilder();
        long c = System.currentTimeMillis();
        for (int a = 1; a < 10000; a++) {
            b.append(this.a);// 原本使用+=需要170毫秒但是使用StringBuff或者StringBuilder可以做到只有16毫秒StringBuff的安全性更好StringBuilder的效率更高但是安全不行.
        }
        long e = System.currentTimeMillis();
        System.out.println(e - c);
      
    }
}
