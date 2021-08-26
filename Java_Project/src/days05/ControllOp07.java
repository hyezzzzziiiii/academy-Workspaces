package days05;

import java.util.Scanner;

public class ControllOp07 {

	public static void main(String[] args) {
		// 월(month) 를 입력받아서
		// 입력받은 월의 계절이 무엇인지 출력합니다.
		// 3~5 봄, 6~8월 여름, 9~11월 가을, 12~2월 겨울
		Scanner sc = new Scanner(System.in);
		int month;
		
		System.out.println("\"월\"을 입력하세요");
		month = sc.nextInt();
		
		if((month >=3) && (month <=5)) 
			System.out.println("봄 입니다.");
		else if((month >=6) && (month <=8)) 
			System.out.println("여름 입니다.");
		else if((month >=9) && (month <=11)) 
			System.out.println("가을 입니다.");
		else if ((month ==12) || (month<3)) 
			System.out.println("겨울 입니다.");
		
		// int month;
		// boolean a,b,c,d;
		//System.out.println("\"월\"을 입력하세요");
		// month = sc.nextInt();
		// a = (month >= 3)&&(month <=5);
        // b = (month >=6) && (month <=8);
		// c = (month >= 9) && (month <=11);
		// d = (month == 12) || ((month>=1)&&(month <=2));
		
		// if(a) 
		// System.out.println("봄 입니다.");		
	    // else if(b) System.out.println("여름 입니다.");
	    // else if(c) System.out.println("가을 입니다.");
	    // else if(d) System.out.println("겨울 입니다.");
		// else System.out.println("잘못 입력하셨습니다.");
	}

}
