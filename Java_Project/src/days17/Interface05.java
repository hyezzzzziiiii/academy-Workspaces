package days17;
interface Repairable{  // 다수개 구현가능 특징
	
}
class Unit{
	int hp; // 현재 체력
	int max_hp; // 최대 체력
	
	Unit(int p) {  //생성자
		max_hp = p;
		hp = (int)(p*0.8);
	}
	public void prnHP() {
		System.out.println(" 최대 체력 : " + max_hp+ ",현재체력: " + hp);
	}
}
class GroundUnit extends Unit{
	GroundUnit(int p) {  super(p); }
}
class AirUnit extends Unit{
	AirUnit(int p) {  super(p);  }
}

class Tank extends GroundUnit implements Repairable{
		Tank() {  super(150);  }
	public String toString() {
		return "Tank";
	  }
}
class Dropship extends AirUnit implements Repairable{
		Dropship(){  super(150); 	}
		public String toString() {
			return "Dropship";
	}
}
class Marine extends GroundUnit{
		Marine() {  super(40);  } 
			public String toString() {
				return "Marine";
	}
}
class SCV extends GroundUnit implements Repairable{
		SCV() {  super(40);  } 
		public String toString() {
			return "SCV";
	}

	/*	public void repair(Tank t) {}
		public void repair(Dropship d) {}
		public void repair(Marine m) {}
		public void repair(SCV s) {}
		*/
		// public void repair(Unit u) {}
		public void repair(Repairable r) {
			if(r instanceof Unit) {
				Unit u = (Unit)r;  //인터페이스 레퍼런스 변수가 갖고 있는 주소가 Unit클래스의
				// 자식 인스턴스 라면 위와 같이 형변환이 가능합니다.

			if(u.hp != u.max_hp) System.out.println(u  + "의 수리를 시작합니다\n");
			else {System.out.println(u  + "의 hp는 만땅입니다.\n");
			return;
		}
		while (u.hp != u.max_hp) {
			u.hp += 2;
		System.out.println("현재체력 : " + u.hp);
		}
		System.out.println(u  + "의 수리가 끝났습니다.\n");
}

		}
}
public class Interface05 {

	public static void main(String[] args) {
        Tank tank = new Tank ();
        Dropship dropship = new Dropship();
        Marine marine = new Marine();
        SCV scv = new SCV();
        
        System.out.printf(tank.toString() + ":");  //toString은 캐릭터 이름만 리턴(생략가능)
        tank.prnHP();
        System.out.printf(dropship.toString() + ":");
        dropship.prnHP();
        System.out.printf(marine.toString() + ":");
        marine.prnHP();
        System.out.printf(scv.toString() + ":");
        scv.prnHP();
        
        scv.repair(tank);
        scv.repair(dropship);
        // scv.repair(marine); 에러
        scv.repair(scv);
        		
	}

}
