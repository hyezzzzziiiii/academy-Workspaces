package days07;

import java.util.Scanner;

public class ControllOp_Loop01 {

	public static void main(String[] args) {
		int std, k, tot, i, j, num;
		
		double ave;
		// 1. 학생 수를 입력받습니다.   s1
		Scanner sc = new Scanner(System.in);
		System.out.printf("학생 수를 입력하세요.");
		std = sc.nextInt();
		// 2. 과목 수를 입력받습니다.   s2
		System.out.printf("과목 수를 입력하세요.");
		k = sc.nextInt();
		// 3. 과목수와 학생수에 따른 반복실행문을 실행하여 
		//     각 학생별 총점(tot)과 평균(ave)을 출력하세요.  ave = tot/s2
		for(i=0; i<std; i++) {
			System.out.println((i+1) +" 번 학생 -----------------------------------");
			tot=0;
			for(j=0;j<k; j++) {
				System.out.printf("%d 과목점수 : ", j+1);
				num = sc.nextInt();
				tot= tot+num;
			}
			ave = tot/(double)k;
			System.out.printf("총점 : %d, 평균 : %.2f\n ", tot, ave);
		}
		// 4. 출력 양식
		// 총과목수 : X과목, 총인원수 : X명
		// 1번 학생 : 1과목 점수 : XX(입력) 
		//            : 2과목 점수 : XX
        //            : 3과목 점수 : XX
		// 과목점수 : XX XX XX  총점 : XXX  평균 : XXX
		// 2번 학생 : 2과목 점수 : XX(입력) .....
		// 과목점수 : XX XX XX  총점 : XXX  평균 : XXX
		//...
		// 변수 이름은 각자 식별이 쉬운 이름으로 정해서 사용하세요.
		//----------------------------------------------------------------------
		
		/* int i=1, s1=0, s2, tot=0, num=0;    // num = 과목 점수
		
		double ave=0.0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("학생 수를 입력하세요.");
		s1 = sc.nextInt();
		System.out.printf("과목 수를 입력하세요.");
		s2 = sc.nextInt();
		
		System.out.printf("총과목수 : %d과목, 총인원수 : %d명\n", s2, s1);
		
		
		while (i <=s1) {
		for(i = 1; i <=s2; i++)	{  
		System.out.printf("\n점수를 입력하세요. ");
		num= sc.nextInt();
		ave = tot/s2;
	    tot = tot+ num;  
		}
		System.out.println(" 총점 : " + tot + "평균 : "+ ave);
		}
		*/
		
		
		}
	

}
