package days03;

import java.util.Scanner;

public class Variable07 {

	public static void main(String[] args) {
		
		// 넓이 공식 : 반지름 * 반지름 *3.14
		// 둘레 공식 : 2* 반지름 * 3.14
		// 반지름을 저장할 변수 생성
		int n1;
		// 원의 넓이와 둘레를 저장할 변수 생성
		double n2, n3;
		
		// 화면 입력 객체 import
		Scanner sc = new Scanner(System.in);
		//반지름 입력
		System.out.println("원의 반지름을 입력하세요."); //printf도 동일
		n1 = sc.nextInt();
		
        // 넓이 계산
		n2 = n1*n1*3.14;
		System.out.printf("입력한 원의 넓이 : %.2f\n", n2);
		// 넓이 출력
		
		// 둘레 계산
		n3 = 2*n1*3.14;
		System.out.printf("입력한 원의 둘레 : %.2f\n", n3);
		// 둘레 출력
				
	}

}
