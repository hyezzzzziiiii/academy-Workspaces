package days21;

public class Exception04 {

	public static void main(String[] args) {
		try {
			ArithmeticException e = new ArithmeticException("ArithmeticException 고의 발생");
			throw e; // throw 라는 명령으로 예외를 강제 발생합니다.
		}catch (ArithmeticException e) { 
			System.out.println("ArithmeticException - ");
			System.out.println("예외메시지: "+ e.getMessage());
		} 
		catch (RuntimeException e) { 
			System.out.println("RuntimeException - ");
			System.out.println("예외메시지: "+ e.getMessage());
		}
		catch (Exception e) {  
			System.out.println("Exception - ");
			System.out.println("예외메시지: "+ e.getMessage());
		}
		
		try {
			ArithmeticException e = new ArithmeticException("RuntimeException 고의 발생");
			throw e; // throw 라는 명령으로 예외를 강제 발생합니다.
		}catch (ArithmeticException e) { 
			System.out.println("ArithmeticException - ");
			System.out.println("예외메시지: "+ e.getMessage());
		} 
		catch (RuntimeException e) { 
			System.out.println("RuntimeException - ");
			System.out.println("예외메시지: "+ e.getMessage());
		}
		catch (Exception e) {  
			System.out.println("Exception - ");
			System.out.println("예외메시지: "+ e.getMessage());
		}
		
		try {
			ArithmeticException e = new ArithmeticException("Exception 고의 발생");
			throw e; // throw 라는 명령으로 예외를 강제 발생합니다.
		}catch (ArithmeticException e) { 
			System.out.println("ArithmeticException - ");
			System.out.println("예외메시지: "+ e.getMessage());
		} 
		catch (RuntimeException e) { 
			System.out.println("RuntimeException - ");
			System.out.println("예외메시지: "+ e.getMessage());
		}
		catch (Exception e) {  
			System.out.println("Exception - ");
			System.out.println("예외메시지: "+ e.getMessage());
		}
		}

}


