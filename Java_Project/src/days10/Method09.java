package days10;

import java.util.Scanner;

public class Method09 {
	
	public static void main(String[] args) {

		int ban;
		double n, d;
		Scanner sc =new Scanner(System.in);
		System.out.print("반지름을 입력하세요");
		ban = sc.nextInt();
		n = calculate1(ban);   // n = ban*ban*3.14;
	    d = calculate2(ban);   // d = 2*ban*3.14;	     
	    prn(n, d);
	    // System.out.printf("입력한 원의 넓이 : %1.f\n",n);
	    // System.out.printf("입력한 원의 둘레 : %1.f\n",d); 
	}
	public static void prn ( double n, double d) {
		System.out.printf("입력한 원의 넓이 : %1.f\n", n);
		System.out.printf("입력한 원의 둘레 : %1.f\n", d); 
	}
	public static double calculate1( int ban) {
		double n = 0.0;
		n = ban*ban*3.141492;
		return n;
		
	}
	public static double calculate2( int ban) {
		double d = 0.0;
		d = 2*ban*3.141492;
		return d;
		
	}


}
