package days17;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar06 {

	public static void main(String[] args) {

				Calendar sDay = Calendar.getInstance();
				Calendar eDay = Calendar.getInstance();
				int year;
				int month;
				System.out.println("년도 입력 : ");
				Scanner sc = new Scanner(System.in);
				year = sc.nextInt();
				System.out.println("월 입력 : ");
				month = sc.nextInt();
				
				while(true) {
				sDay.set(year, month-1, 1);
				eDay.set(year, month, 1);  
				eDay.add(Calendar.DATE, -1);  
				int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
				System.out.println("\n" + year + "년 " + month + "월 ");
				System.out.println("일\t월\t화\t수\t목\t금\t토");
				System.out.println("-----------------------------------------------------------");
				for (int i = 1; i<START_WEEK; i++) System.out.printf("\t");
				for (int i = 1; i<= eDay.get(Calendar.DATE); i++) {
					System.out.printf("%2d\t",i);  
					if(START_WEEK % 7==0) System.out.println();  
					START_WEEK++;
				}
				System.out.printf("\n[이전달(1)]|[다음달(2)]|[종료(3)] ");				
				int input = sc.nextInt();
				Calendar temp= Calendar.getInstance();
				if(input ==3) break;
				else if(input ==1) {  // 이전달
					temp.set(year, month-1,1);   //현재 년도와 월, 1일자로 날짜 세팅
					temp.add(Calendar.MONTH, -1);  //-1개월 연산
					year = temp.get(Calendar.YEAR); // get 메서드로 년도와 월 추출
					month = temp.get(Calendar.MONTH) +1;
				}else {  // 다음달
					temp.set(year, month-1,1);   //현재 년도와 월, 1일자로 날짜 세팅
					temp.add(Calendar.MONTH, 1);  //-1개월 연산
					year = temp.get(Calendar.YEAR); // get 메서드로 년도와 월 추출
					month = temp.get(Calendar.MONTH) +1;			
				}
	          }
				System.out.printf("프로그램이 종료되었습니다.");
}
}
