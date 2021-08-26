package days21;
// 예외처리와 메서드 호출간의 관계
// 예외처리 가능성이 있는 구문을 포함 메서드는 throw Exceptions's name을 표시하여
// 본 메서드를 호출할 구문에 예외처리 권한을 일임합니다.
// 또는 예외처리 가능성이 있는 구문을 try~catch로 처리하여 호출구문에 부담을 주지 않고 처리
// 할 수 있습니다.
// 아래 예제는 예외처리 메서드에게 예외처리 권한을 넘기고, 최초 호출 구문에 try~catch로 처리하는 예
public class Exception05 {

	public static void main(String[] args) {
		try {
			method1();
			} catch (Exception e) {
			e.printStackTrace();
			}
			}
			public static void method1() throws Exception {
			method2();
			}
			public static void method2() throws Exception {
			// throws Exception : 현재 메서드에 예외 발생 구문이 있으니 이 메서드를 호출하려면 그부분을
			// 감안해서 호출 하라는 표시
			System.out.println("Method2 실행");
			throw new Exception(); // 강제 예외 발생
	}

}
