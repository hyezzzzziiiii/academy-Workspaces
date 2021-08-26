package days22;

// 쓰레드 객체의 이름을 지정하는 방법 : setName 메서드를 사용하여 이름을 지정할 수 있음
// 하지만 일반적으로 Thread클래스의 문자열을 매개변수로 받는 생성자를 사용

class Thread_F extends Thread{
	public Thread_F(String name) {
		// 부모클래스 Thread클래스의 생성자를 사용하여 이름을 지정하는 예제
		super(name);
	}
	public void run() {
		System.out.printf("현재 실행 중인 쓰레드의 이름은 '%s' 입니다.\n", this.getName());
	}
}
public class Thread07 {

	public static void main(String[] args) {
		Thread_F f1 = new Thread_F("One");
		Thread_F f2 = new Thread_F("Two");
		Thread_F f3 = new Thread_F("Three");
		f2.setName("TEN");
		f1.start();      f2.start();      f3.start();
		

	}

}
