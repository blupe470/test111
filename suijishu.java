package liuchengkonzhi;
import java.util.Random;
public class suijishu {
    public static void main(String[] args) {
        Random scan=new Random();
                                    //前面的bound不用打，直接输入数字即可
                                    //10表示随机生成0到9之间的数
        for(int a=0;a<10;a++)
        {
            a=scan.nextInt(10);
            System.out.println(a);
        }
        int b=scan.nextInt(10)+3;//生成3到12的随机数 （0~9）+3=3~12
        System.out.println(b);

    }
}
