package days12;
// 클래스(class) -> 프로그램으로 처리하고자 하는 대상에 대한 정의(속성/기능)를 나타낸 자료
// 사용자가 필요에 의해 정의한 자료형입니다.
// public class와 별개로 별도의 공간에 정의 생성합니다.
// 클래스의 선언
class First{
	// 속성(멤버필드, 멤버변수, 필드) : 클래스의 정보
	// 속성은 변수로 선언하게 되면 클래스의 멤버 필드라고 호칭됨
	int n1;
	double n2;
}  //자료형(클래스): 정의영역이고 이 자료형의 변수(객체)가 선언되기 전까지는 '그냥 설계도'일 뿐입니다.
public class Class01 {
    int n1; 
    double b2; // 프로그램의 주를 이루는 클래스도 위와 같은 클래스이므로 멤버변수를 갖을 수 있습니다
	public static void main(String[] args) {
	    // 클래스의 변수 선언
		// 클래스는 사용자 정의 자료형으로 선언 이후 변수 자료형으로 사용될 수 있습니다.
		// 정의 된 class자료형 형태로 선언된 실제 변수
		First f;
		// 클래스 타입의 변수 f는 레퍼런스 변수입니다.(HEAP 메모리를 참조하는 변수)
		// 클래스 타입의 변수는 해당 클래스의 객체를 참조하는 변수
		// 객체 : 클래스가 실체화되어 메모리에 로딩된 상태
		// 클래스의 형태가 메모리에 로딩된 상태를 객체, 인스턴스
		// f가 진짜 객체로 불리우려면 아래와 같이 메모리에 새로운 인스턴스가 만들어지고 할당되어야 합니다.
		f = new First();
		// First f = new First();
		
		
		// 멤버 필드 n1과 n2도 위 명령 new First() 이 실행되는 순간에 실제로 생성
		// new First()명령에 의해 n1과n2 변수는 모두 0으로 모두 초기화됨
		First k = new First();
		// 클래스 내부의 요소에 접근하는 방법 - 접근연산자 dot.을 이용
		System.out.println(f.n1);
		System.out.println(f.n2);
		k.n1 = 30;
		k.n2 = 40.123;
		System.out.println(k.n1);
		System.out.println(k.n2);
				
	}

}
