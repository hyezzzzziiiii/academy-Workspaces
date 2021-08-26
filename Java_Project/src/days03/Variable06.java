package days03;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {
        
		// 밑변과 높이를 입력받을 변수 선언
		int num1, num2;
		// 삼각형의 넓이를 저장할 변수 선언
		double num4;
		
		// 화면 입력을 위한 Scanner import
		Scanner sc = new Scanner(System.in);
		// 밑변 입력
		System.out.println("밑변의 길이를 입력하세요");
		num1 = sc.nextInt();
		// 높이 입력
		System.out.println("높이를 입력하세요.");
        num2 =	 sc.nextInt();
     
        // 넓이 계산
        num4 = num1 *num2* 0.5;    // n1*n2/2.0  
        System.out.printf("입력한 삼각형의 넓이는 %.1f\n", num4); 
        // System.out.printf("입력한 삼각형의 넓이는 %.1f\n", num1 *num2* 0.5); ->위와 동일
        // 출력
 	}

}
