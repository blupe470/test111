package zz;

import java.util.Scanner;

public class 求正整数位数 {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int num,flag=1;
		for(num=n;num>=10;num=num/10)
		{
			flag++;
		}
		System.out.println(n+"共有"+flag+"位");
	}
}
