package days12;
class Circle{
	private int ban;  //반지름
	private double n;  //넓이
	private double d;  //둘레
	
	void initBan(int b) {
		ban = b;
	}
	void generate() {
		n = ban*ban* 3.14;
		d = ban*2*3.14;
	}
	double getN() {
		return n;
	}
	double getD() {
	    return d;
	}

}
public class Class08 {

	public static void main(String[] args) {
		Circle c  = new Circle();
		c.initBan(15);  //반지름을 초기화하는 메서드 호출 // 리턴값있지만 전달인수 있음
		c.generate();  // 넓이와 둘레를 계산하는 메서드 호출  // 리턴값있지만 전달인수 없음
		System.out.println("현재 원의 넓이 : " + c.getN());  //넓이를 얻어서 리턴해주는 메서드 호출
		System.out.println("현재 원의 둘레 : " + c.getD());  //둘레를 얻어서 리턴해주는 메서드 호출

	}
}
