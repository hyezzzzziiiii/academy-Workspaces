package days04;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
    // Q. 입력한 점수가 100이상이거나 50 미만 이면 true, 아니면 false (이거나, 또는 or,||연산자 사용)
    // 입력받을 점수가 저장될 변수 : score
	// Score를 70 과 100을 이용해 비교한 결과를 저장할 변수 : boolValue 결과로 boolValue를 출력합니다.	
		Scanner sc = new Scanner(System.in);
		
		int score;
		boolean boolValue;
		
		System.out.printf("점수를 입력하세요.");
		score = sc.nextInt();
		
		boolValue =(score >= 100) || (score <=50);
		// b1 = score >= 100;
	    // b2 = score < 70;
		// boolValue = b1 || b2;
		System.out.printf("\"입력한 점수의 결과는 : 50미만이거나 100이상인 점수입니다.\" 의 진위값 : %b", score, boolValue);
		
	}

}
