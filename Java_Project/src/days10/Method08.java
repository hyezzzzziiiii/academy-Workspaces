package days10;
// 리턴값이 존재하는 메소드의 선언
// 메서드 호출 후 메서드에서 계산되어 진 결과를 호출한 지점에서 사용하고자 할 때
// return명령으로 호출된 지점으로 전달할 수 있습니다.
public class Method08 {

	public static void main(String[] args) {
		int num = 77;
		int k;
		int max_result;
		k = squar(num);  //리턴값의 타입이 선언된 메소드는 실행의 결과를 호출한 지점으로 반환할 수 있습니다.
		System.out.printf("%d의 제곱은 %d입니다\n", num, k);
		max_result = max(10,5,17);  //리턴값은 메러드 호출 명령을 지우고 그 자리에 대입됩니다.
		System.out.printf("가장 큰 숫자는? -> %d\n", max_result);		
	}
    // 리턴값이 있는 메소드 생성 시 void를 썼던 자리에 리턴값의 자료형을 써줍니다.
	public static int squar(int num) {  //void는 리턴값이 없을때
		int result = num*num;
		return result;
	// 메소드의 실행 결과를 호출한 지점으로 반환하기 위해서 사용되는 return키워드를 사용합니다.
	// return 키워드의 우항에 값 또는 변수 또는 수식이 존재하는 경우
	// 우항의 값 또는 우항의 수식 실행 결과를 메소드 호출한 지점으로 반환(리턴)합니다
	}
	public static int max(int n1, int n2, int n3) {
		int mv;
		if(n1>n2)mv =n1;
		else mv = n2;
		if(mv<n3)mv = n3;
		
		return mv;
		
	}
	// 메서드 사용에 따른 메서드 형태
	// abc() - 전달인수 없고 리턴값도 없는 형태
	// abc(10,20) - 전달인수 2개, 리턴값 없음
	// k = abc() - 전달인수 없고, 리턴값있는 형태
	// k = abc(10,20) 전달인수 2개, 리턴값 있음
}
