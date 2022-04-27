package com.blupe470.d1_static;

public class StaticDemo1 {
    public static void main(String[] args) {
        System.out.println(User.onlinePeople);
        User c= new User();
        //引用static修饰的onlinePeople时推荐使用User.onlinePeople
        //                  不推荐使用c。onlinePeople
        // 即推荐使用类名.静态成员变量
    }
}
