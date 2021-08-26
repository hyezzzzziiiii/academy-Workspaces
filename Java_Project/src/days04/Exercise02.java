package days04;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Q. 국어 영어 수학 점수를 입력받아 총점 평균을 계산하고 총점 평균을 출력하세요.
    // (변수이름 : kor, eng, mat, total, average) 
    // println을 이용하여 출력하되 소수점 둘째 자리까지 표시하세요.
    
    // 국어, 영어, 수학, 총점, 평균 변수 생성
    int kor, eng, mat, tot;
    double average;
    //국어, 영어, 수학 점수 입력
    System.out.printf("국어 점수를 입력하세요.");
    kor = sc.nextInt();
    System.out.printf("영어 점수를 입력하세요.");
    eng = sc.nextInt();
    System.out.printf("수학 점수를 입력하세요.");
    mat = sc.nextInt();
    // 총점, 평균 계산
    tot = kor + eng + mat;
    average = tot/3.0;
    // System.out.printf("국어, 영어, 수학의 총점은 \"%d\"\n", tot);
    // System.out.printf("국어, 영어, 수학의 평균은 \"%.2f\"", average);
    System.out.println("입력한 점수의 총점 : " + tot);
    average = (int)(average * 100) / 100.0; // 연산식의 변수와 값이 같다는 것은 이전까지 값 사라지고 새로운 값 저장됨
    System.out.println("입력한 점수의 평균 : " + average);
    // 적당한 형식으로 출력
    
	}

}
