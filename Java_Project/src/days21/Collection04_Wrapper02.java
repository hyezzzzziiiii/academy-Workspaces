package days21;

import java.math.BigInteger;
// 큰 값들을 수용하기 위한 과정
public class Collection04_Wrapper02 {

	public static void main(String[] args) throws InterruptedException {
		/* double fact  = 1;  //내가 만들 프로그램이 어떤 자료형이 적당한지
		for(int i= 1; i<=30; i++) {
			fact = fact*i;
			System.out.println(i + " "  + fact); 			
		}*/
		for(int i= 1; i<=40; i++) {
			System.out.printf("%d!=%s%n", i, calcFactorial(i));
			Thread.sleep(300); // 0.3초지연
		}
	}
public static String calcFactorial(int i) {
	String result  = null;
	BigInteger n = BigInteger.valueOf(i);  //전단된 int형의 i값을 BigInteger으로 변환
	// 1부터 n까지의 숫자를 모두 곱셈할 겁니다. 그떄 필요한 fact변수도 BigInteger로 생성합니다.
	// 초기값 1
	BigInteger fact = BigInteger.ONE; // fact변수 생성 -> 1초기화
	// for(int k= 1; k<=n; k++) fact = fact*k;
	// int k =1; => BigInteger k = BigInteger.ONE;
	// k <=n; -> k.compareTo(n) <= 9;
	// k ++ -> k = k.add(BigInteger.ONE)
	// fact = fact*k; -> fact = fact.multiply(k);
	for(BigInteger k = BigInteger.ONE; k.compareTo(n) <=0; k = k.add(BigInteger.ONE)) {
		fact = fact.multiply(k);
	}
	result = fact.toString(); // 결과 문자열로 전환
	return result; //정수형에 다 담을 수 없어 문자열을 이용해 리턴해줌
}
}
