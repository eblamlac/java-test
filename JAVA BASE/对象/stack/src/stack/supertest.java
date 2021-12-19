package stack;

public class supertest {
    public static void main(String[] args) {
        test1 a = new test1();
    }
}

class test1 {
    public test1() {

    }
    
    int a = 20;
    public void nani1() {
    }
}

class test2 extends test1 {
    int b = 20;
     
    public test2() {
     System.out.println(this.a);
    
    }
}