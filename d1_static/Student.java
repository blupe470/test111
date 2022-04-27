package com.blupe470.d1_static;

public class Student {
    private String name;

    /** static 修饰的成员方法，归属于类，可以被共享访问，用类名或对象名都可以访问
     *
     * @param a
     * @param b
     * @return
     */
    public static int max(int a,int b){
        return a > b ? a : b;
    }

    /** 没有static的为实例方法，只能用对象访问 对象.run()
     *
     */
    public void run(){
        System.out.println("run运行中");
    }

    public static void main(String[] args) {
        System.out.println(Student.max(5, 10));
        //同一个类中 调用静态方法可以省略类目
        System.out.println(max(8, 2));

    }
}
