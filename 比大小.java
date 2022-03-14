package zz;

import java.util.Scanner;

public class ±È´óÐ¡ {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int x=a.nextInt();
		int y=a.nextInt();
		int z=a.nextInt();
		int max;
		if(x>y)
		{
			if(x>z)
			{
				max=x;
			}
			else 
			{
				max=z;
			}
		}
		else 
		{
			if(y>z)
				max=y;
			else
				max=z;
		}
		System.out.println("max="+max);
	}
}
