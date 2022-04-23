package com.taobao.hello;

public class Car {
    String name;
    double price;
    public Car(){
        System.out.println("无参数构造器中的this："+this);
    }
    public void run(){
        System.out.println("方法中的this： "+this);
    }
    public Car(String name,double price){
        this.name=name;
        this.price=price;
        //Car a=new Car();  this和a的值一样都是一个地址
        //this.name可以在有参数构造器中赋值
        //在类中，传递进来的name和this.name不一定相同
    }
    public void bisai(String name){
        System.out.println(this.name+"正和"+name+"比赛");
    }

}
