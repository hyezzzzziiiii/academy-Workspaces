package days07;

import java.util.Scanner;

public class ControllOp_Loop02 {

	public static void main(String[] args) {
		// Loop예제 연장(while문으로 변경)
		int std, k, tot, i, j, num;
		double ave;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("학생 수를 입력하세요.");
		std = sc.nextInt();
		System.out.printf("과목 수를 입력하세요.");
		k = sc.nextInt();
		
		i=0;
		while( i<std ) {
			System.out.println((i+1) + " 번 학생 -----------------------------------");
			tot = 0;
			j=0;
			while(j<k) {
				System.out.printf("%d 과목점수 : ", j+1);
				num = sc.nextInt();
				tot= tot+num;
				j++;
			}
			ave = tot/(double)k;
			System.out.println("---------------------------------------");
			System.out.printf("총점 : %d, 평균 : %.2f\n ", tot, ave);
			System.out.println("---------------------------------------");
			i++;
		    }
	}

}
