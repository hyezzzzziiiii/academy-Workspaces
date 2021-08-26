package days14;
class StaticC{
	private static int count;
	public StaticC() {  //private로 지정된 스태틱 멤버는 클래스의 내부에서만 사용이 가능한 멤버입니다.
		count++;
	}
	public static void setCount(int count) {
		StaticC.count = count;
	}
	public static int getCount() {  //스태틱 메서드에는 호출 객체가 없으므로 this도 존재하지 않습니다.
		return count;
	}
	//아래와 같이 static으로 선언되지 않은 메소드는 반드시 객체를 생성한 후 클래스 이름을 붙여서 사용할 수 있습니다.
	public void setCount1(int count) {
		StaticC.count = count;
	}
	public int getCount1() {
		return StaticC.count;
}
}
public class Class26 {

	public static void main(String[] args) {
		// private 으로 지정된 static멤버는 클래스의 외부에서 접근이 차단됩니다.
		// System.out.printf("StaticC.count = %d\n", StaticC.count); //에러
		// public접근지정자를 사용하는 static메소드로 private으로 지정된 static멤버의 값을 참조합니다.
		System.out.printf("StaticD.count = %d\n", StaticC.getCount());
        StaticC.setCount(15);
        System.out.printf("StaticD.count = %d\n", StaticC.getCount());
        StaticC d1 = new StaticC();
        System.out.printf("StaticD.count = %d\n", d1.getCount1());
        d1.setCount(15);
        System.out.printf("StaticD.count = %d\n", d1.getCount1());
	}

}
