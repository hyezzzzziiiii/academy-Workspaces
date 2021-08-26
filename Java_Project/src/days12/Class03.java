package days12;
class Animal{
	String name; // 멤버변수
	int age; // 멤버변수
	// 멤버메서드: 클래스의 내부에는 해당클래스가 제공할 수 있는 기능을 정의하기 위해서 메서드 생성가능
	public void output() { //static 안쓰면 설계도일뿐 
		System.out.printf("이름은 %s, 나이는 %d 입니다. \n", name, age);
	} // Animal 객체 만들어지지 않으면  메서드는 동작하지 않음
	// 멤버메서드는 기본적으로 static 키워드를 쓰지 않습니다.
	// static을 쓰지 않은 멤버 변수와 멤버 메서드는 실제 객체가 만들어 져야지만 사용이 가능하다는 제약이 있습니다.
	// 클래스가 현재 프로그램내에서만 사용된다면 public도 쓰지않아도 됩니다.
	void input(String input_name, int input_age) {
		name = input_name; // 멤버변수
		age = input_age; // 멤버변수
	}
}

public class Class03 {

	public static void main(String[] args) {
		Animal a =new Animal(); // 객체 만들어짐
		a.name = "댕댕이";
		a.age =10;
		//System.out.println("이름은"+ a.name + "나이는" + a.age + "세입니다")
		a.output(); //(.)을 이용하여 멤버메서드를 호출합니다.
		
		Animal b = new Animal();
		b.input("야옹이", 8); // 12번째 줄(String input_name, int input_age)
		b.output();
		
	}

}
