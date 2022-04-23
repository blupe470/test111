package com.taobao.hello;

public class User {
    //标准javaBean
    //1.成员变量使用private私有
    //2.添加无参数构造器，有参数可选
    //3.必须提供setter和getter
    private String name;
    private double salary;
    //右键generate->construcuor或setter和getter快捷键
    public User(){

    }
    public User(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


