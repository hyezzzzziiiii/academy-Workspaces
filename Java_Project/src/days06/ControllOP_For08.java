package days06;

import java.util.Scanner;

public class ControllOP_For08 {

	public static void main(String[] args) {
		// 정수를 입력받아
		// 입력된 정수에 해당하는 팩터리얼을 출력하세요.
		// 정수6입력시 출력 예: 6! = 720
      
		Scanner sc = new Scanner(System.in);
		int fact=1, i, k;  
		// 곱셈의 결과를 저장할 변수 fact는 0아닌 1로 초기화합니다.
		// fact = fact*변수 이외 같은 연산시 fact 값이 0이면 모든 곱셈의 결과가 0이 됩니다.
		System.out.printf("출력할 팩터리얼을 입력하세요 :  ");
		k= sc.nextInt();  //반복횟수 저장할 변수
		
		for(i=1; i<=k; i++) {
		fact = fact * i;			
		}
		System.out.printf("%d!=%d\n",k, fact);

		// 정수 6 입력시 출력 변경 예 : 6! = 1x2x3x4x5x6=720  
		
		System.out.printf("%d! =  ",k);
		for(i=1 ; i<k; i++) {
		System.out.printf("%d x  ",i);		 
		fact = fact * i;
		}
		System.out.printf("%d = %d\n", k,  fact*k);
		
	}

}
