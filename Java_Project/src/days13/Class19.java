package days13;
// this 의 용도 1
// 멤버 메서드내에 존재하면서, 메서드를 호출하는 호출객체의 레처런스값을 저장하는 숨어있는 레퍼런스 변수
// this 의 용도 2
// 오버로딩 된 형제 생성자를 재호출하기 위한 호출이름, 반드시 호출하는 형태(매개변수형태)데로
// 생성자가 오버로딩 되어 있어야함
class ThisB{
  private int num1;
  private int num2;
  private int num3;
  ThisB(int n1) { 
	  this.num1 = n1;
  }
  ThisB(int n1, int n2){
	  this(n1);
	  this.num2 = n2;
  }
  ThisB(int n1, int n2, int n3){
	  this(n1, n2);
	  this.num3 = n3;
  }
}
public class Class19 {

	public static void main(String[] args) {
		ThisB b1 = new ThisB(10);
		ThisB b2 = new ThisB(10,20);
		ThisB b3 = new ThisB(10,20,30);
	}

}
