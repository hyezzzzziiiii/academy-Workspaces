package days05;

import java.util.Scanner;

public class ControllOp12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month, day, days=0, na;
		System.out.printf("월 입력 : ");
		month = sc.nextInt();
		System.out.printf("일 입력 : ");
		day = sc.nextInt();
		
		switch(month) {
		case 12: 
			days = days + 30;  
		case 11:
			days = days + 31;
		case 10:
			days = days + 30;
		case 9:
			days = days + 31;
		case 8:
			days = days + 31;
		case 7:
			days = days + 30;
		case 6:
			days = days + 31;
		case 5:
			days = days + 30;
		case 4:
			days = days + 31;
		case 3:
			days = days + 29;
		case 2:
			days = days + 31;
		case 1:
			days = days + 0;
		}		// break가 없으면 위 식들 모두 실행됨
       
        days = days + day;        
        na = days % 7;
        switch(na) {
        case 1: System.out.println("수요일입니다.");
        break;
        case 2: System.out.println("목요일입니다.");
        break;
        case 3: System.out.println("금요일입니다.");
        break;
        case 4: System.out.println("토요일입니다.");
        break;
        case 5: System.out.println("일요일입니다.");
        break;
        case 6: System.out.println("월요일입니다.");
        break;
        case 0: System.out.println("화요일입니다.");
        break;
        }

	}

}
