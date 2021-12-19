package stack;

public class test11 {

    public static void main(String[] args) {
      Student s1=new Student("jack",10);
      Student s2=new Student("jack",10);
      System.out.println(  s1.toString());

      System.out.println(  s1.equals(s2));
    
    }
}

class Student {
    
        int age = 10;
        String name = "jack";
        
        
    public Student() {
    };

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Studeng [name=" + name + "age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            if(((Student) obj).age==10){
           return true;
            }
        }
        return false;
    }
}