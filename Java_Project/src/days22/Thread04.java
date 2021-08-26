package days22;

// 2. Runnable 인터페이스를 구현하는 방법
// 2-1. Runnable 인터페이스를 구현하는 클래스 작성
// 2-2. public void run() 오버라이딩 구현
// 2-3. 해당클래스의 A객체 생성
// 2-4. A객체를 Thread클래스의 생성자로 전달하여 Thread객체 생성
// 2-5. 생성시킨 쓰레드의 start메소드 호출!

class Thread_D_1 implements Runnable {
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.printf("Thread_D_1: i -> %d\n", i);
			try { Thread.sleep(1000);  
			}catch (InterruptedException e ) { e.printStackTrace(); }
		}
	}
}
class Thread_D_2 implements Runnable {
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.printf("Thread_D_2: i -> %d\n", i);
			try { Thread.sleep(1000);  
			}catch (InterruptedException e ) { e.printStackTrace(); }
		}
	}
}
public class Thread04 {

	public static void main(String[] args) {
		// Runnable 인터페이스를 구현한 쓰레드 생성
		// 1. Runnable 인터페이스를 구현한 클래스의 객체 생성
		Thread_D_1 t1 = new Thread_D_1();
		// 2. 1에서 생성된 객체를 Thread 생성자에 전달인수로 전달하여 Thread 객체 생성
		Thread t  = new Thread(t1);
		//3. 2에서 생성괸 Thread 객체를 사용하여 start메서드 호출
		t.start();
		
		// 위의 과정을 한 라인으로 작성한코드
		new Thread(new Thread_D_2()).start();
		
		for(int i = 1; i<=10; i++) {
			System.out.printf("main : i -> %d\n", i);
			try { Thread.sleep(1000);  
			}catch (InterruptedException e ) { e.printStackTrace(); }
		}
	}
}
