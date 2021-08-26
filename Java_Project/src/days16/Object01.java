package days16;
// object 클래스
// 사용자 정의 클래스를 생성하면서, extends(상속)을 구현하지 않으면 자동적으로 java.lang.Object클래스를 
// 상속받습니다.
// Object클래스는 java에서 사용되는 모든 클래스들의 최상위 부모클래스입니다.
// Subclass extends Super라는 건 Subclass는 Object클래스를 상속하지 않지만
// Super클래스가 Object클래스를 상속하므로 Subclass 는 Object 클래스를
 // 상위의 상위로 상속한거나 마찬가지 입니다.

//http://docs.oracle.com/javase/8/docs/api/index.html (Method Summary)

class UserClass1{ }
class UserClass2{ }
public class Object01 {

	public static void main(String[] args) {
		Object ob1 = new UserClass1(); 
		ob1 = new UserClass1();
		Object ob2 = new UserClass2();
		// '모두의 부모인 Object 클래스의 레퍼런스 변수는 모든 클래스의 new 인스턴스 주소값을 저장할 수 있습니다.'
		
		UserClass1 obj = new UserClass1();
		System.out.println(obj.getClass());  // getClass메소드는 해당객체의 이름을 반환
		System.out.println(obj.hashCode()); // hashCode메소드는 해당객체의 해쉬코드값을 반환
		// (해당객체가 JVM에 의해서 관리되고 있는 번호)
		System.out.println(obj.toString());  // toString 메소드는 해당 객체의 정보를 문자열로 반환
		// 객체의 클래스 명 +'@"+ 해쉬코드값(16진수)
		System.out.println(obj); //System.out.println(obj.toString());와 같음
	}

}
