package days04;

import java.util.Scanner;

public class ControllOp01 {

	public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        a = sc.nextInt();      
        int result = a % 2;      
        
        // 실행하거나 실행하지 않거나의 예시)
        if(result == 0) {
        // 변수의 초기값 연수식 가능
        // int result
        // result = a % 2; 
		System.out.println("입력한 숫자는 짝수입니다");
        }
        
        // if :괄호안의 연산식의 결과 또는 진위값 (true/false)이 true 이면 {} 안의 명령을 실행
        // false 이면 실행하지 않고 실행순서를 뛰어넘어 다음 명령이 실행
        
        if(result == 1) {
		System.out.println("입력한 숫자는 홀수입니다");
        }
        
        if(result == 0) {
        	System.out.println("입력한 숫자는 짝수입니다");
        }else {
    		System.out.println("입력한 숫자는 홀수입니다");
    	

        }
	}

}
