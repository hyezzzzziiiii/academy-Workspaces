package days16;
// toString 메소드의 사용
// toString 메소드는 클래스 객체 정보를 문자열로 반환: 객체의 클래스명 +'@" +해시코드의 값(16진수)
// 사용자 정의 클래스 (직접개발 클래스_)toString 메소드를 오버라이딩하여
// 클래스의 정보를 문자열로 제공하도록 할 수 있습니다.
class UserClass_B{ }  // 오버라이딩 되지 않음

	class Point{
		private int x;
		private int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	 public String toString() {  //Object 클래스 오버라이딩
		 String strInfo = "x = " + this.x + ",y=" + this.y;
		 return strInfo; // "x  = 값, y = 값" 리턴
	 }
	}
public class Object02 {

	public static void main(String[] args) {
		UserClass_B obj = new UserClass_B();
		System.out.println("오버라이딩 되지 않은 toString() =>" + obj.toString());
		
		Point p = new Point(30,20);	
		System.out.println("오버라이딩 된 toString() =>" + p.toString());
		
		Point ob = new Point(50,60);	
		System.out.println("오버라이딩 된 toString()를 Object 레퍼런스로 출력 =>" + ob.toString());
		
        String msg = "Point => " +p; // .toString()생략 /Point => x = 30,y=20 출력
        System.out.println(msg);
        // .toString ()은 print 에서 사용되거나 다른 문자열과 '+' 연산될때 생략가능합니다
	}

}
