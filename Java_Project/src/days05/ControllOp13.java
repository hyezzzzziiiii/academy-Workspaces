package days05;

import java.util.Scanner;

public class ControllOp13 {

	public static void main(String[] args) {
		// 기본급을 입력받아서 
		// 기본급이 100만원 이상이면 50% 상여금 합산 후 출력
		// 그렇지 않으면 60% 상여금 합산 후 출력
		// 원단위 절사 금액으로 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		int a;  // 입력 받을 기본급 저장 변수
		double b; // 상여금 합산한 지급액 저장 변수
		System.out.printf("기본급을 입력하세요 : ");
		a = sc.nextInt();
				
		if( a>= 1000000) 
			b = (int)((a + a*0.5)/10) * 10; // double형을 int형으로 출력할때
		else
			b = (int)((a + a*0.6)/10) * 10;
         System.out.println("총 지급액 : " +b );
	}

}
