public class toString {
    public static void main(String[] args) {
        Student s = new Student("jack", 10);
        Student s2 = new Student("jack", 10);
        Student s3 = new Student("jack", 11);
        // toString()返回对象的字符串标识
        // 我想要的效果是查看属性是否赋值成功
        // 现在的效果是Student@2a84aee7
        int a = 10;
        // 原因是在打印对象s时底层会自动的调用s.toString()而且使用的是Object的toString方法
        System.out.println(s);
        System.out.println(s.equals(s2));
        System.out.println(s.equals(s3));
    }
}

class Student {
    String name;
    int age;

    public Student() {
    };

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name" + name + ",age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student argStudent = (Student) obj;
            if (this.name == argStudent.name && this.age == argStudent.age) {
                return true;
            }
        }
        return false;
    }
}
