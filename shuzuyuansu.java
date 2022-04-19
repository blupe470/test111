package shuzu;

public class shuzuyuansu {
    public static void main(String[] args) {
        int[] arr=new int[]{5,2,7,4};
        int sum=0;
        for (int i = 0; i < arr.length; i++) { //直接敲 数组名.fori
            sum+=arr[i];
        }
        System.out.println((sum) +" "+sum/arr.length);//输出元素和及平均数
        }
}
