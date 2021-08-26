package days05;

import java.util.Scanner;

public class ControllOp_For05 {

	public static void main(String[] args) {
		// 두 개의 정수 (a,b)를 입력받아서 a부터 b까지의 정수를 출력
		// 입력받은 숫자 중에서 작은 숫자부터 큰 숫자까지 출력하세요.
		int i, a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요.");
		a = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		b = sc.nextInt();
		if(a<b) {
		   for(i=a; i<=b; i++)
			   System.out.printf("%d\t", i);
		}else {
			for(i=b; i<=a; i++)
				   System.out.printf("%d\t", i);	
	}

  }
}
