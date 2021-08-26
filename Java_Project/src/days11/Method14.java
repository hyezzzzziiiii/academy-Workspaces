package days11;

import java.util.Scanner;

public class Method14 {

	public static void main(String[] args) {
		// 정수를입력받아 1부터 입력받은 정수까지의 합(sum) 계산출력
		// 1부터 입력받은 정수까지의 곱(factorial)출력
		int n;
		int tot, fact;
		n = myInput();
		tot = sum(n);
		fact = factorial(n);
		prn(tot, fact, n);

	}
	public static int myInput() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요");
		//	int a = sc.nextInt();
		// return a;
		return sc.nextInt();
	}
    public static int sum(int n) {
	int total = 0;
	for(int i = 1; i<=n; i++) 
		total = total + i;
	return total;
}
    public static int factorial(int n) {
    	int fact = 1;
    	for(int i = 1; i<=n; i++) 
    		fact = fact * i;
    	return fact;
    }
	public static void prn(int tot, int fact, int n) {
		System.out.printf("1부터 %d까지의 합: %d\n", n, tot);
	    System.out.printf("1부터 %d까지의 곱: %d\n", n, fact);
	}
}
