package days04;

import java.util.Scanner;

public class ControllOp05 {

	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요. ");
		score = sc.nextInt();
		// 입력받은 점수가 90~100이면 A학점, 80~89이면 B학점, 70~79이면 C학점,
		// 60~69이면 D학점, 나머지는 F학점을 출력하세요.
		
		if(score>=90 && score<=100) 
		    System.out.println("\"A학점\"");
		else if(score>=80 && score<=89) 
		    System.out.println("\"B학점\"");
		else if(score>=70 && score<=79)
		    System.out.println("\"C학점\"");
		else if(score>=60 && score<=69)
		    System.out.println("\"D학점\"");
		if(score<60)
			System.out.println("\"F학점\"");
		
		
		//if(score>=90) System.out.println("\"A학점\"");
		//else if(score>=80) System.out.println("\"B학점\"");
		//else if(score>=70) System.out.println("\"C학점\"");
		//else if(score>=60) System.out.println("\"D학점\"");
		//if(score<60) System.out.println("\"F학점\"");   //간략하게
		

		//if(score<60) System.out.println("\"F학점\"");
		//else if(score>=60) System.out.println("\"D학점\"");
		//else if(score>=70) System.out.println("\"C학점\"");
		//else if(score>=80) System.out.println("\"B학점\"");
		//else System.out.println("\"A학점\"");  // 비정상실행 -> 85점 입력시 셋다 맞기 때문에 위에 것부터 실행되기 때문에 D학점 받을 수 있음
		
		//if(score<60) System.out.println("\"F학점\"");
		//else if(score<70) System.out.println("\"D학점\"");
		//else if(score<80) System.out.println("\"C학점\"");
		//else if(score<90) System.out.println("\"B학점\"");
		//else System.out.println("\"A학점\"");                      // 정상실행
		
		
	}

}
