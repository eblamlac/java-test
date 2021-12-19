public class jiekou {
    public static void main(String[] args) {
        nani6 a = new nani6();
        a.nani5();
        a.test();
    }
}

interface nani2 {
    abstract void nani1();
}
interface nani7 {
    abstract void nani8();
}

abstract class nani4 {
    public static void test() {
        System.out.println("hah");
    }

    public abstract void nani5();
}

class nani3 implements nani2,nani7 {
    @Override
    public void nani1() {

    }
    @Override
    public void nani8() {

    }
}

class nani6 extends nani4 {
    @Override
    public void nani5() {
        System.out.println("hah2");
    }

}
