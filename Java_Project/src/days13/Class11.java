package days13;
//클래스 이름 : Complex
// 멤버변수 : image(int) - 허수부, real(int)- 실수부
// 멤버메소드 : getter, setter, add() - 두 복소수산의 합, init() - 복소수 값 초기화, prn() - 복소수 출력(3+7i) 형식
class Complex{
	int image;
	int real;
	
	public void add(Complex c) { //자료형이 Complex, 레퍼런스 값 c
	    this.real += c.real;
	    this.image += c.image;
	}
	public void prn() {
		System.out.println(real + "+" + image + "i");
	}	
	public void init(int i, int r) {		
	this.image = i;
	this.real = r;		
	}
	public int getImage() {
		return image;
	}
	public void setImage(int image) {
		this.image = image;
	}
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	
}
public class Class11 {

	public static void main(String[] args) {	
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		c1.init(3,6);
		c2.setReal(5);
		c2.setImage(4);	
		c1.prn();  
		c2.prn();
		c1.add(c2);
		c1.prn();  // 8 + 10i 출력
		c2.prn();  // 5 + 4i 출력
			}

}
