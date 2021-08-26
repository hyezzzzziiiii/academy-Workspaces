package days05;

import java.util.Scanner;

public class ControllOp_For03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int dan ;
		System.out.printf("출력할 단을 입력하세요 :  ");
		dan = sc.nextInt();
		// 반복실행문을 이용해서 입력한 단의 구구단을 출력하세요.
		// ex) 5x1=5
		//      5x2=10
		//      5x3=15...
		//      5x9=45
		
		for(int i=1 ; i<=9 ; i++)
		  System.out.printf("%d x %d = %d\n ", dan, i, dan*i);
		
	}

}
