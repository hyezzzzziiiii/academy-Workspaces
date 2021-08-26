package days14;

import java.util.Random;

// static 메소드
// static멤버 필드와 같이 프로그램의 구동 전에 메모리에 로딩되어 객체의 생성없이
// 클래스의 이름을 사용해 호출할 수 있는 메소드, 클래스 이름과 dot(.)으로 연결해서 사용
public class Class23 {

	public static void main(String[] args) {
		// static 메서드 실제 사용 예
		// 간단한 공용기능을 제공하기 위한 Math클래스
		// Math클래스에 public static int abs(int n){}와 같은 양식의 sqrt, random메서드가 있습니다.
		// abs: 절대값 계산 메서드, sqrt : 제곱근 계산 메서드, random :난수 발생 메서드
		// Math클래스의 random 메서드는 Random클래스의 nextInt() 메서드와 양식은 다르지만
		// 역할을 같은 메서드들입니다.
		// 다만 Math클래스의 random메서드는 static메서드이므로 Math.random();와 같이 사용하고
		// Random클래스의 nextInt()메서드는 동적멤버메서드이므로 객체 생성후 호출객체를 앞에 두고 사용합니다.
		// Random rd = new Random(); rd.nextInt();
		int num = -1;
		System.out.printf("num= %d, num 변수의 절대 값 %d\n",num, Math.abs(num));
		num = 7;
		System.out.printf("num변수의 제곱근 = %.2f\n",Math.sqrt(num));
		System.out.println("Math클래스 난수발생 스태틱메서드 값 : "+ (int)(Math.random()*100));
		System.out.println("Math클래스 난수발생 스태틱메서드 값 : "+ Math.random());
		
		// Integer클래스(int타입과 매핑되는 클래스)
		// Integer클래스의 parseInt메소드는 문자열로 되어있는 정수값을 int타입으로 변환
		String strNum1 = "100";
		String strNum2 = "50";
		//문자열 결합
		System.out.println("문자열 연산 strNum1 + strNum2: " + strNum1 + strNum2);
		//문자열의 값을 정수로 변환한 후 연산
		System.out.println("정수변환 후 연산 Integer.parseInt(strNum1) + Integer.parseInt(strNum2): "
				+ (Integer.parseInt(strNum1)+ Integer.parseInt(strNum2 )));
		
		String strNum3 = "365"; 
		int m1 = (strNum3.charAt(0) - '0')*100;
		int m2 = (strNum3.charAt(1) - '0')*10;
		int m3 = (strNum3.charAt(2) - '0');
		int m = m1 + m2 +m3;
		
		m = Integer.parseInt(strNum3);
		
		// Double 클래스(double 타입과 매핑되는 클래스
		// Double 클래스의 ParseDouble메소드는 문자열로 되어있는 실수값을 double 타입으로 반환
		strNum1 = "10.75";
		strNum2 = "5.2";
		//문자열 결합
		System.out.println("문자열 결합: " + strNum1 + strNum2);
        //문자열의 값을 실수로 변환한 후 연산
		System.out.printf("실수로 변환 후 연산: ");
		System.out.println(Double.parseDouble(strNum1) + Double.parseDouble(strNum2));
		//참고로 정수나 실수를 문자로 바꾸는 스태틱메서드는 String클래스 내에 있습니다.
		strNum1 = String.valueOf(1234);		
		strNum2 = String.valueOf(123.454);  //String.valueOf ->정수든 실수든 전부 문자열로 만들어줌
		System.out.println("실수 ->문자 변환후 결합연산: " + strNum1 + strNum2);
	}

}
