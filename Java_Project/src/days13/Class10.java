package days13;
// 클래스 이름 : Triangle
// 멤버 변수 : a(밑변), b(높이),n(넓이)
// 멤버 메서드 : getter/setter, cal(넓이를 계산하는 메서드, prn(밑변 , 높이 넓이 한번에 출력)

// 클래스 생성
class Triangle {
	private int a;
	private int b;
	private double n;
	
public void cal() {
	n = a*b*0.5;
}
public void prn() {
	System.out.println("밑변 : " + a + "| 높이: " + b + "| 넓이: " + n );
}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public double getN() {
		return n;
	}
	public void setN(double n) {
		this.n = n;
	}
		
}
public class Class10 {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.setA(15);
		t.setB(13);
		t.cal();
		System.out.println("현재 삼각형의 밑변 : "+ t.getA());
		System.out.println("현재 삼각형의 높이 : "+ t.getB());
		System.out.println("현재 삼각형의 넓이 : "+ t.getN());
		System.out.println("한번에 출력");
		t.prn();
	}

}
