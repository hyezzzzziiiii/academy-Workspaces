package days04;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Q. 점수를 입력받아서 점수가 70점 이상이면서 100점 이하이면 true,
		// 아니면 false 출력(이면서, 그리고, ~이고 : and (&&)연산자 사용)
		// 입력받을 점수가 저장될 변수 : score
		// Score를 70 과 100을 이용해 비교한 결과를 저장할 변수 : boolValue 결과로 boolValue를 출력합니다.
       Scanner sc = new Scanner(System.in);
       
       int score;
       boolean boolValue, b1, b2;
       
       System.out.printf("점수를 입력하세요.");
       score = sc.nextInt();
       
       b1 = score >= 70;
       b2 = score <= 100;
       boolValue = b1 && b2; 
       // && 둘다 true 여야 true, b1과 b2 조건 만족해야함
       // boolValue =  (score >= 70) && (score <= 100); 도 가능
       // boolValue =  70 <= score <= 100; 에러
       
       System.out.printf("\"입력한 점수의 결과는 : %d 는 70과 100사이의 점수입니다.\" 의 진위값 : %b", score, boolValue);
       
 
	}

}
