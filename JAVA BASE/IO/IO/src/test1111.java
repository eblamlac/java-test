public class test1111 {
    public static void main(String[] args) {
        String[] A = { "A", "B", "C", "D" };
        for (int a = 0; a <= A.length; a++) {
            System.out.println(A[a]);
            for (int aa = 1; aa < A.length - a; aa++) {
                System.out.println(A[a] + A[aa]);
                for (int aaa = 0; aaa < A.length - aa; aaa++) {
                    System.out.println(A[a] + A[aa] + A[aaa]);
                    for (int aaaa = 0; aaaa < A.length - aaa; aaaa++) {
                        System.out.println(A[a] + A[aa] + A[aaa] + A[aaaa]);
                    }
                }
            }
        }
    }

}
