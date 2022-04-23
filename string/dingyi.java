package string;

public class dingyi {
    public static void main(String[] args) {
        String name="传智";
        name +="教育中心";
        System.out.println(name);

        char[] c={'a','b','c'};
        String s=new String(c);
        System.out.println(s);

        byte[] c2={97,98,65,66};
        String s2=new String(c2);
        System.out.println(s2);

        String ss1="abc";
        String ss2="abc";//“”出来的字符串地址相同
        if (ss1==ss2){
            System.out.println("ss1等于ss2");
        }else System.out.println("ss1不等于ss2");

        char[] ccc={'a','b','c'};
        String ss3=new String(ccc);
        String ss4=new String(ccc);//new出来的字符串地址不同
        if (ss3==ss4){
            System.out.println("ss3等于ss4");
        }else System.out.println("ss3不等于ss4");
    }
}
