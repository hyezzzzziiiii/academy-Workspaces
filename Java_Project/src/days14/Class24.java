package days14;
//static변수, static메서드, 인스턴스(멤버)변수, 인스턴스(멤버)메서드
// static 미리 만들어진 변수, 인스턴스는 객체만들어진 시점
class Mymath{
	int a, b; // 인스턴스(멤버)변수
	static int c = 0; // static변수
	Mymath(){ 
		c++; // 생성자에 1씩 증가시키는 식 추가
		} 
	//인스턴스 메서드에서는 스태틱변수를 자유롭게 사용할 수 있습니다.
	public void init() {
		a = c*100; b = c*200;
		}
	public int add() {
		return a+b;
	}
	public int substract() {
		return a-b;
	}
	public int multiply() {
		return a*b;
	}
	public double divide() {
		return a/(double)b;
		//인스턴스 메서드들은 인스턴스 변수들도 자유롭게 사용가능합니다.
	}	
		// 반면에 스태틱 메서드는 인스턴스 변수를 사용할 수 없습니다. 스태틱 변수와 매개변수만 사용가능합니다.
	public static int add(int e, int d) {
			return e+d+c;
		} //e,d는 매개변수, c는 스태틱변수
	public static int substract(int e, int d) {
			return e-d+c;
		}
	public static int multiply(int e, int d) {
			return e*d+c;
		}
	public static double divide(double e, double d) {
			return e/d+c;
		}
	
}
public class Class24 {

	public static void main(String[] args) {
		Mymath mm = new Mymath();
		mm.init();
		System.out.println(mm.add()); //mm.add()->인스턴스(멤버)메서드
		System.out.println( mm.substract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		System.out.println(Mymath.add(10,30));
		System.out.println(Mymath.substract(10,30));
		System.out.println(Mymath.multiply(10,30));
		System.out.println(Mymath.divide(10,30));
	}

}
