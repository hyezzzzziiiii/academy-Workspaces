package days06;

import java.util.Scanner;

public class ControllOp_For07 {

	public static void main(String[] args) {
		// 정수 10개를 입력받아 
		// 10개의 합계를 계산하여 출력하세요.
		// 결과는 합계만 한번 출력합니다.
		
		int i, sum=0, num;
		Scanner sc= new Scanner(System.in);
				
		for(i = 1; i <=10; i++)	{  //i를 10번반복
		System.out.printf("정수를 입력하세요. ");
	    num= sc.nextInt();
	    sum = sum+ num;  
		}

		System.out.println("입력된 정수의 합계 : " + sum);
				

	}

}
