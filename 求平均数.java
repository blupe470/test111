package zz;

import java.util.Scanner;

public class ��ƽ���� {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		double sum=0;
		int count=0;
		System.out.println("����һ�����ֲ��ԡ�0������");
		for(double num=scan.nextDouble();num!=0;num=scan.nextDouble())
		{
			sum+=num;
			count++;
		}
		System.out.println((double)sum/count);
		
	}
}
