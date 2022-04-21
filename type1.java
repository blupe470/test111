package yuanli;

public class type1 {
    public static void main(String[] args) {
        int a=1110;
        byte b= (byte) a;//alt+enter快捷键
        System.out.println(b);//输出86,大转小可以溢出
        double aa=100.12;
        int bb= (int) aa;
//        System.out.println(bb);输出100，浮点型转换整型后小数点后直接消失
        //两个整型做除法，结果为整数
        //    if(a>0^b>0) ^异或符号，必须一个为true一个为false才为真
        //&&和||如果左边不满足条件，则右边的不执行，如右边的a++不执行
        //&和|一定执行右边  if(左边&&右边)
    }
}
