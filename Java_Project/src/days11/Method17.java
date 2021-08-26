package days11;

public class Method17 {

	public static void main(String[] args) {
		// 메서드의 오버로딩
		// 메서드의 이름은 같고, 매개변수의 타입, 개수, 순서가 다르면 서로 다른 메소드로 인지하는 문법
		// 일관된 메소드 이름을 사용하여 사용자에게 직관적인 이름을 사용하게 됩니다.
		// 전달인수(매개변수)의 자료형, 순서 등이 서로 달라도 가능
		int a = max(11, 33);
        System.out.println("두 개의 정수 중 큰 값 " + a);
        a = max(11, 33, 77);
        System.out.println("세 개의 정수 중 큰 값 " + a);
        a = max(11, 33, 77, 99);
        System.out.println("네 개의 정수 중 큰 값 " + a);
        
        // 메소드 오버로딩의 예
        System.out.println(10);
        System.out.println(1.1);
        System.out.println("Hello");
	}
	public static int max(int n1, int n2, int n3, int n4) {
		int temp1 = n1> n2? n1: n2;
		int temp2 = n3> n4? n3: n4;
		return temp1>temp2 ? temp1 : temp2;
	}
	public static int max(int n1, int n2, int n3) {
		int temp;
		temp = n1> n2? n1: n2;
		return temp>n3 ? temp : n3;
	}
	public static int max(int n1, int n2) {
		int maxValue;
		// if(n1>n2) maxValue = n1;
		// else maxValue =n2;
		maxValue = n1> n2? n1: n2; // 부가의문문 
		// n1>n2이 비교연사의 결과가 true이면 n1:n2중 왼쪽 n1이,
		// false이면 오른쪽 n2이 선택되어 maxValue에 대입
		return maxValue;
		// return n1>n2? n1:n2;
}
}
