package com.blupe470.d1_static;

public class Test {
//    静态成员
    public static int onLineNumber = 5;
//    实例成员
    private int age;
//    1.静态方法只能访问静态成员，不能 直接 访问实例成员
//    静态方法不能出现this
    public static void test(){
        System.out.println("静态成员方法success");
    }
    public void test2(){
//     2。实例方法可以访问静态成员，也可以访问实例成员
        System.out.println(onLineNumber+"实例成员方法success"+age);
    }

    public static void main(String[] args) {
        Test.test();
        test();
        Test e=new Test();
        e.age=45;
        e.test2();
    }
}