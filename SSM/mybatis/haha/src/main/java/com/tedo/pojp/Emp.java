package com.tedo.pojp;

public class Emp {
    private  Integer id;
    private  String name;
    private String job;
    private Double salary;
    //get和set方法
    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public String getJob() {
        return job;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    /*
* Student
* privat doyble score //基本数据类型默认值是0
* 所以导致比如有些学生缺考了，基本数据就会变成0分，这样就无法区分这个学生是考了0分还是缺考了
* */
}
