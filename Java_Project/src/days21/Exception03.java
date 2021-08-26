package days21;

public class Exception03 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); // 실행되지 않는다.
		}catch (ArithmeticException e) { // 종류별 예외 처리1
			e.printStackTrace();   //java.lang.ArithmeticException: /by zero
			System.out.println("예외메시지: "+ e.getMessage());
			// 예외 메시지 : /by zero
		} 
		catch (Exception e) {  // 종류별 예외 처리2
			System.out.println("Exception");
		}
		System.out.println(5);
	}

}
