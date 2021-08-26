package days05;

import java.util.Scanner;

public class ControllOp14 {

	public static void main(String[] args) {
        // 국어 영어 수학 점수를 입력받아서 총점 평균을 계산하고
		// 평균 60 이상이면서 전과목 40미만이 없으면 합격
		// 그렇지 않으면 불합격
		int kor, eng, mat, tot;
		double ave;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("국어점수 : ");
		kor = sc.nextInt();
		System.out.printf("수학점수 : ");
		mat = sc.nextInt();
		System.out.printf("영어점수 : ");
		eng = sc.nextInt();
		
		tot = kor + eng + mat;
		ave = tot/3.0;

		System.out.printf("전과목 점수의 총합은 : %d\n", tot);
		System.out.printf("전과목 점수의 평균은 : %.1f\n", ave);
	    
		// System.out.println("입력한 점수의 총점 : " + tot); ->위 사항을 println으로 사용할 때
	    // ave = (int)(ave * 100) / 100.0; 
	    // System.out.println("입력한 점수의 평균 : " + ave);
		
		
		if((ave>=60) && (kor>=40) && (mat>=40) && (eng>=40))
			System.out.println("합격입니다.");
		else System.out.println("불합격입니다.");
		
		// 1)
		// if((ave < 0) || (kor <40) || (mat < 40) || (eng < 40))
		// System.out.println("불합격입니다.");
	    // else System.out.println("합격입니다.");
		
		// 2)
		// if( ave>=60){
		//  if (kor>=40 && mat>=40 && eng>=40)
		//	 System.out.println("합격입니다.");
		// else System.out.println("불합격입니다.");}
	    // else {
		// System.out.println("불합격입니다.");
	    // }
		
		// 3)
		// if(ave>=60) {
		//	 if (kor>=40) { 
		//	  if(mat>=40) {
		//		if (eng>=40) { System.out.println("합격입니다.");				
		//		}else {System.out.println("불합격입니다."); }
		//	   }else {System.out.println("불합격입니다."); }
		//   }else {System.out.println("불합격입니다."); }
		// }else {System.out.println("불합격입니다."); }	
	}

}
