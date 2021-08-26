package days06;

import java.util.Scanner;

public class ControllOp_For11 {

	public static void main(String[] args) {
		// 두 개의 정수를 입력받아서 두 정수의 공약수를 출력합니다.
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		int i, small, k=0; //변수 값 초기화되야 사용가능
		 System.out.printf("첫번째 정수 입력 : ");
		 num1 = sc.nextInt();
		 System.out.printf("두번째 정수 입력 : ");
		 num2 = sc.nextInt();
		 
		 if(num1<num2) small = num1;
		 else small = num2;
		 // 최대 공약수 : 두 개의 숫자의 공통 약수 중에 가장 큰 숫자
         // 10의 약수 :  1,2,5,10 / 8의 약수 : 1,2,4, 8  공약수 : 1,2  최대공약수 : 2
		 System.out.printf("%d의 약수 : " , num1);
		 for(i = 1; i<= num1; i++) {
		 if(num1 % i == 0) System.out.printf("%d ",i);
		 }
		 
		 System.out.printf("\n%d의 약수 : " , num2);
		 for(i = 1; i<= num2; i++) {
		 if(num2 % i == 0) System.out.printf("%d ",i);
		 }
	     
	     System.out.printf("\n\'%d\'과 \'%d\'의 공약수 : " , num1, num2);
	     for(i = 1; i<= small; i++) {
	     if(num1 % i == 0 && num2 % i == 0) {
	    	 System.out.printf("%d ",i);
	         k=i;  
	     }
	     }
	     System.out.println("\n최대 공약수 : "+ k);
	}

}
