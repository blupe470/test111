package com.taobao.hello;

public class Test {
    public static void main(String[] args) {
//        Car a=new Car();
//        a.run();
//        Car b=new Car("宝马",39.9);
//        b.bisai("兰博基尼");
//
//        People c=new People();
//        c.setAge(130);
//        System.out.println(c.getAge());
//        int a=c.setAge();
//        System.out.println(a);


        Movie[] film=new Movie[2];//创建Movie数组
        film[0]=new Movie("普罗米亚",10.0,"Galo");//这俩存的是地址
        film[1]=new Movie("环太平洋",10.0,"危险流浪者");
        for (int i = 0; i < film.length; i++) {
            System.out.println(film[i].getName());
            System.out.println(film[i].getScore());
            System.out.println(film[i].getActor());
        }
        for (int i = 0; i < film.length; i++) {
            System.out.println(film[i]);
        }
    }
}

