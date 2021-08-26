package days16;
// 추상클래스
// 상속을 통한 다형성의 구현에 강제성을 부여하기 위한 클래스

// 상속의 문제점 : 강제성의 부재
// 상속을 통해 다형성(부모클래스를 상속받아 여러 형태의 지식클래스르 생성하고 활용함)을 구현하고자 하여도,
// 하위클래스에서 메소들 오버라이딩을 구현하지 않으면 다형성을 완벽히 구현할 수 없습니다.
// 이때, 오버라이딩을 구현하지 않는 것이 문법상 문제가 없다는 점을 강제성의 부재라고 합니다.

class Animal{
	public void crying() {
		System.out.println("소리를 냅니다.");
	}
}
class Dog extends Animal{
	public void crying() {
		System.out.println("멍멍!");
	}
}
class Cat extends Animal{  
	public void sound() {
		System.out.println("야옹!");
	}
}
public class Abstract01 {

	public static void main(String[] args) {
	    Animal d = new Dog();
	    Animal c = new Cat();
	    d.crying();
	    c.crying();
	    // c.sound(); 에러. sound()는 Animal이 상속해준 메서드가 아니기 때문에

	    // 부모클래스의 메소드를 오버라이딩하지 않아도, 컴파일 상 문제가 없기 때문에
	    // 이러한 문제는 프로그램의 구동후에 비로소 확인할 수 있습니다.
	}

}
