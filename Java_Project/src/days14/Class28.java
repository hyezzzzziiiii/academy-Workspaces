package days14;
// 싱글턴 패턴
// 특정 클래스의 객체를 반드시 한개만 생성할 수 있도록 강제하는 패턴
// 멤버필드 값이 객체들간 스태틱 변수가 아니면서 일관된 값을 가져야하고, 객체도 둘이상 더 만들 필요가 
// 없다면, '하나의 객체(인스턴스)를 공유'하여 사용하는 싱글턴 방식이 사용됩니다.

//(private은 클래스 내부에서만 사용가능)

// 싱글턴 패턴을 구현하는 단계 1 : 생성자(Constructor)메서드를 private으로 보호합니다
// 싱글턴 패턴을 구현하는 단계 2 : 클래스 내부에서 생성자를 호출해서 생성한 객체 하나를 생성합니다.
// 이 객체도 private으로 보호합니다. 그리고 static으로 선언합니다
// 이 객체는 클래스 내부에서 생성하는 것이기 때문에 생성자의 private과 상관없이 생성이 (생성자 호출)가능합니다.
// 싱글턴 패턴을 구현하는 단계 3 : 생성해놓은 객체의 참조변수값을 리턴하는 public형의 메서드를 생성합니다.
// 메서드이름 getInstance() - static으로 생성합니다. 

class SingletonEx{
	int n1;  //멤버변수
	int n2; //멤버변수
	private SingletonEx(){  //1)
	}
	private	static SingletonEx ist = new SingletonEx();  //2)  s1,s2,s3가 new SingletonEx();객체 공유
	public static SingletonEx getInstance() { //3)
		return ist;  //리턴값이 위 객체의 주소
	}
	// 생성자가 private로 보호되어 main메서드 안에서 new SingletonEx()로 새로운 객체 생성이 
	// 되지않습니다. SingletonEx s1 = new SinlgetomEx(); 에러
	// 싱글톤 방식은 클래스내부에 유일한 객체를 생성해두고 (private static 으로 생성)
	// public static 으로 만들어진 getInstance()메서드를 호출하고 ist를 리턴받아 객체를 사용합니다.
	// 생성자 메서드는 static 인스턴스 ist만들 때 최초 실행된 떄 말고는 실행되지않습니다.
}
public class Class28 {

	public static void main(String[] args) {
		//SingletonEx s1 = new SingletonEx(); /에러 - 생성자가 private 보호되었습니다.
		SingletonEx s1 = SingletonEx.getInstance();
		SingletonEx s2 = SingletonEx.getInstance();
		SingletonEx s3 = SingletonEx.getInstance();
		s1.n1 = 150;
		System.out.println(s2.n1);
		System.out.println(s1);  // 객체의 참조변수를 print하면 '클래스 이름@해쉬코드'가 출력됨
		System.out.println(s2);
		System.out.println(s3);
		// 싱글턴 패턴이 구현된 클래스의 활용
		// 날짜, 시간에 관련된 정보를 제공하는 Calender;
		// 클래스 싱글턴 패턴이 구현되어 new인스터스를 사용하여 객체를 생성할 수 없습니다.
		// 반드시 getInstance 메소드를 사용하여 객체를 반환받아야합니다.
	}

}
