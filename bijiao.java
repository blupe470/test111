package zz;

import java.util.Scanner;

public class bijiao {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		int amount = in.nextInt();
		System.out.println(amount);
		if(amount>=10)
		{
			System.out.println("Ʊ��10Ԫ");
			System.out.println("����:"+(amount-10));
		}
		
		if(amount<10)
		{
			System.out.println("��Ͷ��10Ԫ����������ֽ�");
		}
	}
}
