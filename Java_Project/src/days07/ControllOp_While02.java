package days07;

import java.util.Scanner;

public class ControllOp_While02 {

	public static void main(String[] args) {
		// 1부터 100사이의 짝수 출력
		int i = 2;
	    while (i<=100) {
	    	System.out.printf("%d ",i);
	    	i+=2;  //i는 2씩 증가
	    }
        //---------------------------------------------------------------------
	    int n, fact = 1;
	    Scanner sc = new Scanner(System.in);
	    System.out.printf("\n팩터리얼을 계산할 정수 입력 :  ");
	    n = sc.nextInt();
	    
	    System.out.printf("%d! = ", n);
	    
	    while (n>1) {
	    	System.out.printf("%dx", n);
	    	fact = fact*n;
	    	n--;  // n의 값이 줄어들며 계산식 생성 , 설정안할경우 무한으로 생성		
	    }
	    System.out.println("1=" + fact); //fact는 출력한 n의 값 저장소
	}

}
