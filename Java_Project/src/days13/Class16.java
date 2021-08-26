package days13;
// int형 데이터 하나를 매개변수로 하는 생성자와 디폴트 생성자가 오버로딩된 생성자를 갖는 클래스 제작
// 멤버 필드 int dan;
// 멤버 메서드 : dan 값이 0이면 1~9단의 구구단 모두 출력, 0이 아니면 해당 구구단만 출력하는 메서드 제작
// 디폴트 생성자 dan변수를 0으로 저장, 전달인수가 있는 생성자는 dan변수를 전달인수 값으로 저장
// 메서드 이름 : print()
// 클래스 이름 : Gugudan()

class Gugudan{
	private int dan;
	Gugudan() {
		this.dan = 0;
	}
	Gugudan(int n) {
	   dan = n;	
	}
	public void print() {
		if(dan!=0)
			gugudanprn(dan);
		// 멤버메서드들 간에는 그 메서드(gugudanprn)를 호출하는 호출 객체 없이도 서로 호출 가능합니다.
		else  for(int j =2; j<=9; j++) 
			gugudanprn(j);
	}
	public void gugudanprn(int n) {
	    for(int i =1; i<=9; i++) 
	    	System.out.printf("%dx%d=%d ", i, n, i*n);
	    System.out.println(); // 줄바꿈
	} 
}
public class Class16 {

	public static void main(String[] args) {
        Gugudan g1 = new Gugudan(8);
        Gugudan g2 = new Gugudan();
        g1.print();
        g2.print();
	}

}
