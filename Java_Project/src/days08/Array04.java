package days08;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		// 세명의 학생 국영수 과목의 점수를 입력받아서 성적표 출력
		int[] kor = new int[3];  // 3명의 학생의 국어 점수 저장용
		int[] eng = new int[3];  // 영어 점수용
		int[] mat = new int[3];  // 수학 점수용
		int[] tot = new int[3];  // 총점 용
		double[] ave = new double[3];  // 평균 용
		
		// 각 학생의 국영수 점수를 입력받습니다.
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<=2; i++) {
			System.out.printf("%d번 학생의 국어점수 : ", i+1);
			kor[i] = sc.nextInt();
			System.out.printf("%d번 학생의 영어점수 : ", i+1);
			eng[i] = sc.nextInt();
			System.out.printf("%d번 학생의 수학점수 : ", i+1);
			mat[i] = sc.nextInt();
		}
		
		/* System.out.printf("1번학생의 국어점수: ");
		 kor[0] =sc.next.int();
        */
		
		for(int i=0; i<=2; i++) {
			tot[i]=kor[i]+eng[i]+mat[i];
			ave[i] = tot[i]/3.0;
		}
		System.out.printf("\t\t###성적표###\n");
		System.out.printf("------------------------------------------------\n");
		System.out.printf("번호\t국어\t영어\t수학\t총점\t평균\n");
		System.out.printf("------------------------------------------------\n");

		for(int i=0; i<3; i++) 
	    System.out.println((i+1) + "\t" + kor[i] +"\t" + eng[i]+"\t" + mat[i]+"\t" + tot[i]+"\t" +(int)(ave[i]*100)/100.0); 
        System.out.printf("------------------------------------------------");	
		

 }
}
