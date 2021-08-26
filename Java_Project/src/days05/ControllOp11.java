package days05;

import java.util.Scanner;

public class ControllOp11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month, day, days=0, na;
		System.out.printf("월 입력 : ");
		month = sc.nextInt();
		System.out.printf("일 입력 : ");
		day = sc.nextInt();
		
		switch(month) {
		case 1 :
			days= 0;
			break;
		case 2 :
			days= 31;
			break;
		case 3 :
			days= 31+29;
			break;
		case 4 :
			days= 31+29+31;
			break;
		case 5 :
			days= 31+29+31+30;
			break;
		case 6 :
			days= 31+29+31+30+31;
			break;
		case 7 :
			days= 31+29+31+30+31+30;
			break;
		case 8 :
			days= 31+29+31+30+31+30+31;
			break;
		case 9 :
			days= 31+29+31+30+31+30+31+31;
			break;
		case 10 :
			days= 31+29+31+30+31+30+31+31+30;
			break;
		case 11 :
			days= 31+29+31+30+31+30+31+31+30+31;
			break;
		case 12 :
			days= 31+29+31+30+31+30+31+31+30+31+30;
			break;
		}
       
        days = days + day;      
        // 1월에 0을 저장함으로서 만약 13일을 사용자가 입력할 경우, 
        // 총일수 + 13일을 7로 나눠 일수와 요일이 나오게 된다.
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

