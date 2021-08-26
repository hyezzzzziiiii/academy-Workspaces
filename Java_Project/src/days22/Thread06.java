package days22;
class Thread_E extends Thread{
	  public void run() {
		  System.out.printf("현재 실행 중인 쓰레드의 이름은 '%s'입니다. \n", this.getName());
	  }
	}
public class Thread06 {

	public static void main(String[] args) {
		// 쓰레드 객체 이름을 확인 : Thread클래스의 getName메서드를 사용
		// 쓰레드의 이름을 지정하지 않으면 생성되는 순서로 Thread-0,1,2...같은 이름을 사용합니다.
				
				Thread_E e1 = new Thread_E();
				Thread_E e2 = new Thread_E();
				Thread_E e3 = new Thread_E();
				
		e1.run();         e2.run();         e3.run();  //메서드 호출
		e1.start();       e2.start();       e3.start();	 //동시실행이므로 순서달라질 수 도 있음
	}

}
