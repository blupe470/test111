package zz;

import java.util.Scanner;

public class ��������ż�� {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int ji=0,ou=0;
		while(num!=-1)
		{
			if(num%2==1)
			{
				ji++;
			}
			else
			{
				ou++;
			}
			num=scan.nextInt();
		}
		System.out.println(ji+" "+ou);
		
	}
}
