package days16;


//추상클래스의 단점 : 추상메서드 구현의 강제성!!
//많은 수를 추상 메소드를 갖는 추상 클래스는 상속에 부담을 주게됩니다.
//자식 클래스에서 사용하지 않을 추상 메소드라도, 객체 생성을 위해 반드시 구현해야 하는 문제점이 있습니다.

abstract class Abstract_A{
	public abstract void test1();
	public abstract void test2();
	public abstract void test3();
	public abstract void test4();
	public abstract void test5();
	public abstract void test6();
	public abstract void test7();

	// Abstract_B 클래스를 상속받은 클래스는 필요없는 메서드가 있어도, 
	// 추상메서드를 모두 오버라이드(구현)해야 합니다.

	class Abstract_A_Sub1 extends Abstract_A{

		@Override
		public void test1() {
		}
		@Override
		public void test2() {			
		}
		@Override
		public void test3() {		
		}
		@Override
		public void test4() {		
		}
		@Override
		public void test5() {		
		}
		@Override
		public void test6() {			
		}
		@Override
		public void test7() {			
		}
		//모든 추상클래스가 구현(오버라이드)된 Abstract_B_Adapter 클래스를 상속받아 사용하면

		//필요없는 메서드를 강제로 구현(오버라이드)하지 않고 필요한것만 구현하여 사용할 수 있습니다.

		class Abstract_A_Sub2 extends Abstract_A_Adapter{

		public void test1() {

		System.out.println("test1 오버라이딩");

		}

		}
	}
}
		public class Abstract03 {

		public static void main(String[] args) {

		//어댑터 클래스를 상속받은 클래스도 추상클래스의 자식(손자)클래스가 됩니다.

		Abstract_A obj = new new Abstract_A_Sub2();
		obj.test1();
}


}
