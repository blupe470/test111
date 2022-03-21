package zz;

import java.util.Scanner;

public class 求平均数 {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		double sum=0;
		int count=0;
		System.out.println("输入一串数字并以“0”结束");
		for(double num=scan.nextDouble();num!=0;num=scan.nextDouble())
		{
			sum+=num;
			count++;
		}
		System.out.println((double)sum/count);
		
	}
}
