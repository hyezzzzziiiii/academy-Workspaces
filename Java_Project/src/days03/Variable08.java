package days03;

import java.util.Scanner;

public class Variable08 {

	public static void main(String[] args) {
		// 사과의 갯수, 1상자에 들어갈 수 있는 사과의 갯수를 저장할 변수 선언
		// 사과가 꽉찬 상자의 갯수, 남은 사과의 갯수를 저장할 변수 선언
		int n1,n2,n3,n4;  

        // 입력 객체 import		
		Scanner sc = new Scanner (System.in);
		
		// 사과의 갯수 입력
		System.out.println("사과의 갯수를 입력하세요.");		
		n1 = sc.nextInt();
		
		// 1상자에 들어갈 수 있는 사과의 갯수 입력
		System.out.println("1상자에 들어갈 수 있는 사과의 갯수를 입력하세요.");
		n2 = sc.nextInt();
		
		// 꽉찬 상자의 갯수(몫)
		n3 = n1/n2;    //n3 = (int) n1/n2 로 써도 무방
		System.out.printf("꽉채워진 상자의 갯수 : %d\n", n3);  // 변수 선언(ex, int, double)과 %d, %.1f 맞춰야함.
		// System.out.println("포장된 사과박스의 갯수 : %d 개\n", n3);
		
		// 남은 사과 계산 (나머지)
		n4 = n1%n3;  // n4 = n1- (n3*n2)와 동일
	    System.out.printf("남은 사과의 갯수 :  %d\n" , n4); 
	    // System.out.printf("남은 사과의 갯수 : %d 개\n", n4);
	    
		//출력
	    
	}

}
