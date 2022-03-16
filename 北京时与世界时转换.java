package zz;

import java.util.Scanner;

public class 北京时与世界时转换 {
	public static void main(String[] args) {
//		UTC==BJT-8;
//		1121,11.24
//		905,9.05
//		36,0.36
//		7,0.7
		Scanner scan=new Scanner(System.in);
		int UTC=scan.nextInt();
		int BJT = 0;
		if(UTC>=800)
		{
			BJT=UTC-800;
		}
		if(UTC<800)
		{
			BJT=UTC+1600;
		}
		System.out.println(BJT);
	}
}
