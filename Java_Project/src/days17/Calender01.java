package days17;

import java.util.Calendar;

public class Calender01 {

	public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        // java.util. 에 있는 Calendar 클래스
        // 싱글턴 방식의 클래스
        // 생성자가 private로 접근 차단됨(외부에서 접근금지 -> 외부에서 new Calendar() 사용안됨)
        // 유일하게 실행된 new Calendar () 는 클래스 내부에서 실행되어
        // 클래스내부에 단하나만 존재하게끔 생성된 레퍼런스 변수에 주소를 저장합니다.
        // 그리고 그 레퍼런스 변수가 갖고 있는 주소를 리턴하는 public static 형태의 getInstance 메서드로 
        // 인스턴스의 주소를 리턴받아씁니다.
        // 이후 다시 getInstance ()메서드가 실행되도 현재 HEAP에 이미 있는 인스턴스의 주소가 리턴됩니다.
        
        // Calendar 에서 사용할 수 있는 유용한 메서드
        int y = today.get(Calendar.YEAR); // today.get(1);
        // get 메서드는 스태틱 파이널 변수의 값을 얻어주는 메서드입니다.
        System.out.println("년도 : "+y);
        
        int i = today.get(Calendar.MONTH);
        System.out.println("월  : (0~11) : " + (i+1) +"월");
        // MONTH 로 얻어낸 월의 값은 1월이 0, 2월이 1, ~12월이 11로 얻어짐
        
        i = today.get(Calendar.DAY_OF_MONTH);
        System.out.println("이달의 몇 일: "+i);
        
        i = today.get(Calendar.WEEK_OF_YEAR);
        System.out.println("금년의 몇째 주: "+i);
        
        i = today.get(Calendar.WEEK_OF_MONTH);
        System.out.println("이달의 몇 째 주: "+i);
         
        i = today.get(Calendar.DAY_OF_YEAR);
        System.out.println("이 해의 몇 일: " + i);
        
        i = today.get(Calendar.DAY_OF_WEEK);
        System.out.println("요일(1~7, 1 : 일요일) " + i);  //1.일요일, 2. 월요일, 3. 화요일.....
        
        i = today.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println("이 달의 몇 째 요일: " + i);
        System.out.println("이 달의 마지막 날: " + today.getActualMaximum(Calendar.DATE));
        
        System.out.println();
        
        System.out.println("오전_오후(0:오전, 1: 오후): " + today.get(Calendar.AM_PM));
        System.out.println("시간(0~11): " + today.get(Calendar.HOUR));
        System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("분(0~59): " + today.get(Calendar.MINUTE));
        System.out.println("초(0~59): " + today.get(Calendar.SECOND));
        System.out.println("1000분의 1초(0~999): " + today.get(Calendar.MILLISECOND));

        // 프로그램이 시작되어 Calendar인스턴스가 만들어진 시점
        // 시: 분: 초: 1/1000초
        
        
	}

}
