package yuanli;

import java.util.Scanner;

public class sanyuanyunsuanfu {
    public static void main(String[] args) {
//        x=条件 ？ a：b   条件为真将a赋值给x，为假将b赋值给x
        double score = 98;
        String rs=score>=60? "及格":"挂科";
        System.out.println(rs);
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        String c=scan.next();
    }
}
