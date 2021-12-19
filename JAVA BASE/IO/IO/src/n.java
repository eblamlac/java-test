public class n {

    public  static void test(int a,int b,int c,int d){
       int[] l={a,b,c,d};
         for (int h=0;h<l.length-1;h++) {
         for(int y=0;y<l.length-1;y++)
            if (l[y]>l[y+1]){
                int g=l[y];
                l[y]=l[y+1];
                l[y+1]=g;}}
        for(int gg=0;gg<l.length;gg++){
            System.out.println(l[gg]);
        }
    }

    public  static void test1(int a,int b,int t,int c,int d){
        int[] l={a,b,t,c,d};
        for (int h=0;h<l.length;h++) {
            for(int y=0;y<l.length-1;y++)
                if (l[y]>l[h]){
                    int g=l[h];
                    l[h]=l[y];
                    l[y]=g;
                }
        }
        for(int gg=0;gg<l.length;gg++){
            System.out.println(l[gg]);
        }
    }
    public static void test3 (String a,String b,String c,String d)   {
            String[] l={a,b,c,d};
            for (int h=0;h<l.length;h++){



            }
    }



    public static void main(String[] args) {
//       test(10,6,8,4);//第一种方法从小到大
//       test1(10,11,22,8,4);//第二种方法从小到大
        test3("a","b","c","d");
    }

}
