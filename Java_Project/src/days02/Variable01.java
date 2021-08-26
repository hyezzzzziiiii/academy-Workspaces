package days02;

public class Variable01 {

	public static void main(String[] args) {
		System.out.println(35 +"+" +38 + "=" +(35+38));
		System.out.println(35 +"-" +38 + "=" +(35-38));
		System.out.println(35 +"x" +38 + "=" +(35*38));
		System.out.println(35 +"/" +38 + "=" +(35/38.0));
		System.out.println(35 +"%" +38 + "=" +(35%38));
		// 위와 같은 연산은 개발자가 결정한 숫자로 일관된 결과가 출력됩니다.
		// 프로그램이 실용성을 갖기 위한다면, 개발자가 결정한 데이터가 아닌 사용자가 입력한 데이터로 계산되는 것이
		// 계산되는 것이 좋습니다.
		// 사용자가 입력한 데이터로서의 계산하려면 일단 입력받을 수 있는 명령이 있어야 하며,
		// 입력된 데이터를 저장할 장소가 필요합니다.
		// 이를 위해 " 변수(Variable)" 라는 저장소를 사용합니다.
		
		// 변수는 명령에 의해 생성되고 프로그램이 종료되면 소멸됩니다.
		// 프로그램이 실행되는 동안 변수에게는 별칭(이름)이  부여되고 실행 중 그 이름으로
		// 불러지며, 제어됩니다.
		
		// 변수의 이름생성 규칙
		// 1. 인터넷 사이트의 회원가입시 만드는 규칙과 비슷합니다.
		// 2. 영문과 숫자, 그리고 일부 특수 문자(_)를 섞어서 사용가능하지만
		// 3. 첫글자는 반드시 영문으로 사용합니다.
		// 4. 중간에 공백이 있을 수 없습니다.
		// 5. 너무 짧지 않게 약간의 의미를 부여해서 이름 생성하는 편입니다.
		// 6. 변수의 이름이 너무 짧으면, 변수의 갯수가 많아졌을 때 서로의 용도를 구분하기 힘듭니다
		// 7. 변수의 이름이 너무 길면, 사용할때마다 그 긴 이름을 타이핑해야하는 불편함이 있습니다. 
		// 8. 두가지 의미의 단어가 조합되어 변수이름이 만들어 진다면 첫단어는 모두 소문자로, 
		//     두번째 단어첫글자는 대문자로 생성합니다.
		// ex) 덧셈의 결과를 저장할 때 변수 이름 : plusResult
		
		//자료형을 나타내는 이름이면서 변수를 만드는 명령
		//boolean - '참/거짓' 진위형 변수
		//int - 정수형 자료형1 4Byte 형 정수
		//long - 정수형 자료형2 8Byte형 정수
		//float - 실수형 자료형1 4Byte형 실수
		//double - 실수형 자료형3  8Byte형 실수
		//char - 문자형 자료형 -1 글자형 자료 'a', 'b'   2Byte
		//String - 문자열 자료형 : 현재는 자료형이라고 부르지만 엄밀히 자료형은 아니며 이후 객체단원에서 설명함
		// 문자열 : "a" , "Abc", "aBCD", ""
		
		//1바이트 - 8비트(256개)
		//비트 - 이진수 0 또는 1 중 하나를 저장할 공간  
		//1bit - 0or1/ 2bit - 00, 01, 10, 11/ 3bit - 000,001,010 (8개)/ 4bit (16개)/ 5 - 32/ 6- 64/ 7- 128/8- 256
		
		
		// 변수의 선언(생성)
		int a;  //a라는 이름의 변수를 생성(정수를 저장할 변수)
		int b;  //b라는 이름의 변수를 생성
		
	    int plusResult, minusResult, multiplyResult; //한번에 여러변수를 생성 (같은 자료형)
	    double divideResult; //divideResult 라는 이름의 변수생성(실수를 저장할 변수)
	    
	    // 변수의 사용(대입 및 연산)
	    a = 15;              // =의 의미는 a에 옆의 값을 넣는다
	    b = 11;
	    plusResult = a + b;
	    minusResult = a - b;
	    multiplyResult = a * b;
	    divideResult = a / 3.0;
	    divideResult = a / (double)b; //캐스트 연산 : 현재 명령에서만 잠시 형 변환
	    
	    // 변수의 출력
	    System.out.printf("%d + %d = %d\n", a, b, plusResult);  //ctrl + space bar 이름 입력가능
	    System.out.printf("%d - %d = %d\n", a, b, minusResult); 
	    System.out.printf("%d x %d = %d\n", a, b, multiplyResult); 
	    System.out.printf("%d ÷ %d = %.2f\n", a, b, divideResult); 	    
	   
	}

}
