package days21;

import java.util.ArrayList;

class Point{
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {			
	    return "x:" + x + " y:" + y;
	}
	public boolean equals(Object obj) {
		if(!(obj instanceof Point)) return false;
		Point target = (Point)obj;
		boolean flag = this.x == target.x && this.y == target.y;
		return flag;
	}
}
public class Collection14 {

	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<Point> ();
		Point p1 = new Point (10,10);
		list.add(p1);
		list.add( new Point(20,20));
		list.add( new Point(30,30));
		for(Point p : list)  System.out.println(p.toString());
		System.out.printf("(30,30)의 위치 : %d\n", list.indexOf(new Point(30,30)));
		System.out.printf("(30,30)의 저장유무 : %b\n", list.contains(new Point(30,30)));
	
	    // 사용자 정의 클래스에 equals 메서드가 오버라이딩 되지 않은 경우
		// 컬렉션 내부에서 동일한 형태의 객체를 검색 및 비교할 수 없습니다.
		System.out.println("(30,30)삭제 전 갯수 " + list.size()); //3
		list.remove(new Point(30,30));  // 내용으로 비교 검색하여 삭제
		System.out.println("(30,30)삭제 후 갯수 " + list.size()); //2
		
	}

}
