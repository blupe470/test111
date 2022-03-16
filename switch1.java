package zz;

import java.util.Scanner;

public class switch1 {
	public static void main(String[] arg) {
		Scanner scan=new Scanner(System.in);
		int type=scan.nextInt();
		switch(type) {
		case 1:
		case 2:
			System.out.println("hello!");
		case 3:
			System.out.println("goodbye");
			break;
		default:
			System.out.println("?");
			break;
		}
	}
}
