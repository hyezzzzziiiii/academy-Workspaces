package days17;

import java.util.Calendar;

public class Calendar02 {

	public static void main(String[] args) {
		String[] weekday = {"", "일", "월", "화", "수", "목", "금", "토"};
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2015, 7, 15); // 원하는 특정날짜로 객체를 재설정, date2는 아직 오늘 날짜
		// 월은 0~11로 사용, 7입력은 8월을 의미
		// set 메서드에 위와 같이 항목 차례로 나열하면 해당 날짜로 기억합니다
		// set 메서드에 필드명과 값을 넣어주면 해당 필드값만 변경합니다
		// date1.set.(Calendar.MONTH,6)->월만 7월로 바뀜
		
		System.out.println(date1.get(Calendar.YEAR) + "년 "
		+(date1.get(Calendar.MONTH) +1) + "월 "
		+ date1.get(Calendar.DATE)+ "일 "
		+ weekday[date1.get(Calendar.DAY_OF_WEEK)] +"요일 ");
		// 요일 이름이 차례로 들어 잇는 배열에서 DAY_OF_WEEK가 얻어주는 요일
		// 숫자로 배열의 해당 요일을 첨자로 선택

		System.out.println(date2.get(Calendar.YEAR) + "년 "
		+(date2.get(Calendar.MONTH) +1) + "월 "
		+ date2.get(Calendar.DATE)+ "일 "
		+ weekday[date2.get(Calendar.DAY_OF_WEEK)] +"요일 ");
			printDate(date1);
			printDate(date2);
		}	
	
	public static void printDate(Calendar c) {
		String[] weekday = {"", "일", "월", "화", "수", "목", "금", "토"};
           System.out.println(c.get(Calendar.YEAR) + "년 "
		+(c.get(Calendar.MONTH) +1) + "월 "
		+ c.get(Calendar.DATE) + "일 "
		+ weekday[c.get(Calendar.DAY_OF_WEEK)] +"요일 ");
	}
	}


