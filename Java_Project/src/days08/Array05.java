package days08;

import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		// 5과목의 성적을 배열에 입력받아서
		// 각 과목 점수와 총점 배열을 출력하세요.
		// 평균은 소수점 둘째 자리까지만 표시하세요
		
		// 과목점수 : XX  XX  XX  XX  XX
        // 총점 : XXX
		// 평균 출력: XX.XX
		Scanner sc = new Scanner (System.in);
				int[] score = new int[5]; 
				int tot = 0;
				
				for( int i=0; i<5; i++) {
					System.out.printf("%d번째 점수를 입력하세요 : ", i+1);
					score[i] = sc.nextInt();
					tot = tot + score[i]; //**
				}  
			  System.out.printf("과목 점수: ");
			  
			  for( int i=0; i<5; i++)
				  System.out.printf("%d\t", score[i]);
			  double ave = tot/5.0;
			  System.out.printf("\n총점 : %d\n평균 %.2f\n", tot, ave);	           				
	}

}
