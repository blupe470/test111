package zz;

import java.util.Scanner;

public class shengao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ss");
		//(5+7%12)*0.3.48
		double chi,chun;
		Scanner in =new Scanner(System.in);
		chi=in.nextDouble();
		chun=in.nextDouble();
		System.out.println("chi="+chi+", chun="+chun);
		System.out.println((int)((chi+chun/12)*0.3048*100)+"cm");
	}

}
