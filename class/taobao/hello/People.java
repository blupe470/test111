package com.taobao.hello;

public class People {
    private int age;//成员变量使用private修饰，只能在本类中访问
        public void setAge(int age){
            if(age>0&&age<150)//一般数据判断不在这里
            {
                this.age=age;
            }
            else
            {
                System.out.println("年龄数据异常");
            }
        }
        public int getAge(){
            return age;
        }

    public int setAge() {
            return age;
    }
}
