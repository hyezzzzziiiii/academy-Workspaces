package days14;
class StaticD{
	private static int num =1; 
	private int number;
	// 초기화 블럭 : 객체 생성시 실행(생성자와 셩격이 비슷)
	// 단순 값으로 초기화하는 경우 대입연산자를 통해서 처리 할 수 있지만, 
	// 실행문이 포함된 초기화를 진행하는 경우 아래와 같이 초기화 과정을 정의할 수 있습니다.
	{ // 초기화 블럭 
		number =100;
		System.out.println("인스턴스 변수 초기화 용 초기화 블럭");
	}
	// static 블럭 : static멤버를 초기화하기 위한 영역 -> 생성자에서 해도되지만 객체 생성시에만 쓸수있으므로
	// 단순 값으로 초기화하는 경우 대입연산자를 통해서 처리할 수있지만, 
	// 실행문이 포함된 초기화를 진행하는 경우 아래와 같이 초기화 과정을 정의할 수 있음
	static {   //1)
		System.out.println("StaticF의 static블럭 실행");
		num =55;
	}
	public static void setNum(int num) {
		StaticD.num = num;
	}
	public static int getNum() {
		return StaticD.num;
	}
}
public class Class27 {

	public static void main(String[] args) {
		System.out.println(StaticD.getNum());  //1)
		StaticD.setNum(500);
		System.out.println(StaticD.getNum());
		StaticD d = new StaticD();
	}

}
