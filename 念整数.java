package zz;

import java.util.Scanner;

public class ÄîÕûÊý {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		if(num<0)
		{
			System.out.print("fu ");
			num=num*-1;
		}
		int i=0,n;
		int f=1;
		for(n=num;n>=10;n=n/10)
		{
			f++;
		}
		int j=f;
		for(n=num;f>0;f--)
		{
			i=f;
			n=num;
			while(i>1)
			{
				n=n/10;
				i--;
			}
			n=n%10;
			if(f==j)
			{
				switch(n) 
				{
					case 0:
						System.out.print("ling");
						break;
					case 1:
						System.out.print("yi");
						break;
					case 2:
						System.out.print("er");
						break;
					case 3:
						System.out.print("san");
						break;
					case 4:
						System.out.print("si");
						break;
					case 5:
						System.out.print("wu");
						break;
					case 6:
						System.out.print("liu");
						break;
					case 7:
						System.out.print("qi");
						break;
					case 8:
						System.out.print("ba");
						break;
					case 9:
						System.out.print("jiu");
						break;
				}
			}
				else 
				{
			switch(n) {
			case 0:
				System.out.print(" ling");
				break;
			case 1:
				System.out.print(" yi");
				break;
			case 2:
				System.out.print(" er");
				break;
			case 3:
				System.out.print(" san");
				break;
			case 4:
				System.out.print(" si");
				break;
			case 5:
				System.out.print(" wu");
				break;
			case 6:
				System.out.print(" liu");
				break;
			case 7:
				System.out.print(" qi");
				break;
			case 8:
				System.out.print(" ba");
				break;
			case 9:
				System.out.print(" jiu");
				break;
			}
				}
		}
	}
}
