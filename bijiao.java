package zz;

import java.util.Scanner;

public class bijiao {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		int amount = in.nextInt();
		System.out.println(amount);
		if(amount>=10)
		{
			System.out.println("票价10元");
			System.out.println("找零:"+(amount-10));
		}
		
		if(amount<10)
		{
			System.out.println("请投入10元及以上面额现金");
		}
	}
}
