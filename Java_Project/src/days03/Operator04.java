package days03;

public class Operator04 {

	public static void main(String[] args) {
		// 논리 연산자 &&(AND), ||(OR), |(NOT)
		// 다수개의 관계연산식을 조합하여 하나의 boolean 갑을 결과로 얻는 연산자
		
		// AND 연산자(&&)
		// 좌항과 우항의 관계식 결과가 모두 true 인 경우 true가 결과값
		// 좌항과 우항 중 하나라도 false인 경우 false 결과값
		// 좌항의 결과가 false인 경우 우항의 식을 비교하지 않습니다.
		System.out.printf("F && F = %b\n", false && false);
		System.out.printf("T && F = %b\n", true && false);
		System.out.printf("F && T = %b\n", false && true);
		System.out.printf("T && T = %b\n", true && true);
		
		// OR연산자(||)
		// 좌항과 우항의 관계식 결과가 모두 true 인 경우 true가 결과값
		// 좌항과 우항 모두 false 인 경우 false 결과값
		// 좌항의 결과가 true인 경우 우항의 식을 비교하지 않습니다. 	
		System.out.printf("F || F = %b\n", false || false);
		System.out.printf("T || F = %b\n", true || false);
		System.out.printf("F || T = %b\n", false || true);
		System.out.printf("T || T = %b\n", true || true);
		
		// NOT연산자(!)
		// 단항연산자(피연산자가 1개임)
		// 관계식의 결과를 반대값으로 결과를 냄 true -> false,  false -> true
		System.out.printf("!%b = %b\n", false, !false);
		System.out.printf("!%b = %b\n", true, !true);
	}

}
