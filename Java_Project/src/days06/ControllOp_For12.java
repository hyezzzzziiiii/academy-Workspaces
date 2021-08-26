package days06;

import java.util.Scanner;

public class ControllOp_For12 {

	public static void main(String[] args) {
		//  두개의 숫자를 입력받아서 두 숫자의 최소공배수를 출력
	
		int num1, num2;
		int i, k=0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("첫번째 숫자 입력 : ");
		num1 = sc.nextInt();
		System.out.printf("두번째 숫자 입력 : ");
		num2 = sc.nextInt();
		
		// 1. 첫번째 숫자의 배수를 출력(최대 100까지만)
		System.out.printf("%d의 배수 : " , num1);
		for(i = 1; i*num1<= 100; i++) {
		System.out.printf("%d ",i*num1);
		}
		
		// 2. 두번째 숫자의 배수를 출력 (최대 100까지만)
		System.out.printf("\n%d의 배수 : " , num2);
		for(i = 1; i*num2<= 100; i++) {
		 System.out.printf("%d ",i*num2);
		}
		
		// 3. 두 숫자의 공배수 출력
		/*int start;
		if(num1 > num2) start = num1;
		else start = num2; */
		boolean first = true;
		System.out.printf("\n%d 와(과) %d의 공배수 : ", num1, num2);
		for(i=1; i <=num1*num2; i++) {
			if(i%num1 == 0 && i %num2 ==0) {
				System.out.printf("%d  ", i);
				if(first) { //첫번째는 무조건 true  ** 이해 필요
					k=i;
					first = false;
				}
			}
		}
		// 4. 최소 공배수 출력
		System.out.println("\n최소 공배수 : "+ k);
	}

}
