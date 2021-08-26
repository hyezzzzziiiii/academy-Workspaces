package days08;

import java.util.Scanner;

public class MyCalender {

	public static void main(String[] args) {
		// 출력하고자 하는 달력의 년과 월을 입력받습니다.
		Scanner sc = new Scanner(System.in);
		int y, m, days=0, t,i;// 프로그램에 필요한 변수선언
		// t: 7로 나눈 나머지를 저장할 변수, i : 반복실행 구문에서 반복을 제어할 변수
		
		System.out.printf("년 입력 :  ");
		y= sc.nextInt();
		System.out.printf("월 입력 :  ");
		m= sc.nextInt();
		// System.out.printf("일 입력 :  ");
		// d= sc.nextInt();
		
		// 입력한 년도의 전년도까지 지나온 날짜 수 계산
		days = 365*(y-1); // 전년도까지 날짜 합 365*전년도
		for(i=1;i<y; i++)
			if((i%4==0) && (i%100==00) || (i%400==0))
	          days++;  // 서기 1년 부터 입력한 년도의 전년도 까지 지나오면서 있었던 윤년마다 1일을 더합니다.
		
		// 입력한 월의 전월까지 지나온 날짜수를 계산합니다.
		switch(m) {
		case 12: days = days +30;
		case 11: days = days +31;
		case 10: days = days +30;
		case 9: days = days +31;
		case 8: days = days +31;
		case 7: days = days +30;
		case 6: days = days +31;
		case 5: days = days +30;
		case 4: days = days +31;
		case 3: 
			if((y%4==0) && (y%100!=00) || (y%400==0)) days = days +29;
			else days = days +28;  //입력한 년도가 윤년이면 2월 29일, 아니면 28일(**주의해서 식 작성)
		case 2: days = days +31;
		case 1: days = days +0;		
		}
		
		days = days +1;  // 입력한 월의 1일자가 무슨 요일인지 판단하기 위해 1을 더합니다. 
		//지난 예제와 다르게 일을 입력받지 않음(1일만 지정해줌)
		t = days%7; // t는 일요일: 0, 월요일: 1, 화요일 : 2, 수요일: 3......토요일 : 6 
	    // t값보다 1작은 값까지 빈칸으로 채웁니다
		for(i = 0; i < t; i++) System.out.printf("\t"); 
		int end = 0;
		switch(m) {
		    case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
		    	end = 31; break;
		    case 4: case 6: case 9: case 11: 
		    	end = 30; break;
		    case 2 : 
		    	if((y%4==0) && (y%100!=00) || (y%400==0)) end = 29;
				else end = 28; 
		}//각 월에 대한 날짜 지정하였으므로 두번째for문 i<=31에서 i<=end로 변경
		
		// 달력출력의 시작
		System.out.println();
		System.out.println(y + "년 " + m + "월 ");
		System.out.println("-----------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("-----------------------------------------------");
		
		int cnt =0; //cnt는 빈칸까지 카운트한 값이 두번째 for문에 적용
		// t값보다 1작은 값까지 빈칸으로 채웁니다
		for(i = 0; i < t; i++) {
			cnt++;  
			System.out.printf("\t");  
		}
				
		for(i=1; i<=end; i++) { //1부터 다시시작 (날짜출력)
			cnt++; 
			System.out.printf("%2d\t", i);
			if(cnt%7==0)  System.out.println();
			
		}
		
	}

}
