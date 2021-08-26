package days04;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// 입력받을 숫자가 저장될 변수 : number
        // number를 2로 나눈 나머지를 저장할 변수 : namuge
        // n 과 0을 비교한 결과를 저장할 변수 : boolValue , namuge==boolValue
        int number, namuge;
        boolean boolValue;
        System.out.println("숫자를 입력하세요.");
        number = sc.nextInt();   // 숫자입력
        
        namuge = number%2;  // 입력한 숫자를 2로 나눈 나머지 계산
        boolValue = namuge ==0;  // 나머지와 0과 같은지 비교 연산 후 결과를 boolValue에 저장
        System.out.printf("\'입력한 숫자는 %d는 짝수 입니다\' 의 결과 : %b", number, boolValue);
       
	}

}
