package string;

import java.util.Scanner;

public class StringApi {
    public static void main(String[] args) {
        String name="chon";
        String password="1234";
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入账号");
        String sname=sc.next();
        System.out.println("请输入密码");
        String spassword=sc.next();
        if(name.equals(sname)&&password.equals(spassword)){//字符串.equals() 判断字符串是否相同
            System.out.println("登陆成功！");
        }
       else{
            System.out.println("账号与密码不匹配!");
        }

       String c1="234abc";
       String c2="234ABC";
       if(c1.equalsIgnoreCase(c2)){ ////字符串.equalsIgnoreCase() 判断字符串是否相同
           System.out.println("c1等于c2");

//           String c3="我爱你zzz";
//           System.out.println(c3.length());            //1.字符串长度  c3.length()

//           System.out.println(c3.charAt(2));           //2.获得字符串中 [2] 的字符 c3.charAt(int index)

//           for (int i = 0; i < c3.length(); i++) {
//               System.out.println(c3.charAt(i));       //3.遍历字符串
//           }

//           char[] chars = c3.toCharArray();            //4.生成一个字符数组 c3.toCharArray()

//           System.out.println(c3.substring(0, 3));     //5.截取字符串 （包前不包后）

//           String c4="***，c**,***";
//           c4=c4.replace("***","小可爱");
//           System.out.println(c4.replace("c**", "我爱你")); //6.字符串替换

//           System.out.println(c4.contains("小可爱"));       //7.判断字符串是否包含"小可爱"

//           System.out.println(c4.startsWith("小可爱"));     //8.判断字符串是否以”小可爱“开始

//           String c5="aaa,bbb,ccc";
//           String[] cs = c5.split(",");                    //9.按照某个内容把字符串分割成字符串数组返回
//           for (int i = 0; i < cs.length; i++) {
//               System.out.println("选择了：" + cs[i]);
//           }
       }
    }
}
