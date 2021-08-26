package days12;
class Gugudan{
	private int dan; 
	// dan변수에 값을 전달받아 dan변수에 저장하는 메서드 정의(메서드 이름 initDan)
	void initDan(int n) {
	    dan = n;
	}
	// 현재 dan 변수에 있는 값으로 구구단 한개의 단을 출력하는 메서드 정의(메서드 이름 prnGugudan)
	void prnGugudan() {
		for(int i = 1; i<=9; i++) {
		System.out.println(dan + "x" + i + "=" + (dan*i));
	 }
   }	  		
}
public class Class07 {

	public static void main(String[] args) {
		// Gugudan 객체 생성
		Gugudan g = new Gugudan();
		// dan값을 전달인수로 초기화하는 메서드 호출 //단을 입력받을 수도 있음
		g.initDan(8);
		// 현재 저장된 dan값으로 한개의 단을 출력하는 메서드 호출
        g.prnGugudan();
	}

}
