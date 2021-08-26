package days15;
class Deck{
	Card [] cards = new Card[52];  // 52개 짜리 레퍼런스 값들을 저장할 배열/같은 패키지 안 Card클래스 가져옴
	
	public Deck() {  //생성자호출
		int k = 0;
		for(int i= 1; i<=4; i++) {
			for(int j=1; j<=13; j++) {
				cards[k] = new Card(i,j);  // 4회,13회가 중복 설정된 반복문에 의해 52번 객체 생성
				// 생성된 객체의 주소는 52개의 레퍼런스 값들을 저장할 배열에 한칸씩 주소 전달
				k++;
			}
		}
	}
	public void shuffle() {
		Card temp;
		for(int i = 0; i<52; i++) {
			int r = (int)(Math.random()*52);  //0~51사이의 랜덤한 정수 생성
			temp = cards[i];  //랜덤 정수와 일반카드와 섞음
			cards[i] = cards[r];
			cards[r] = temp;
		}
	}
}
public class PlayCard {

	public static void main(String[] args) {
		Deck d = new Deck();  //객체 생성     
		d.shuffle();  //shuffle 메서드 호출
	   /* System.out.printf("%s", d.cards[0]);
	    System.out.printf("%s", d.cards[1]);
	    System.out.printf("%s", d.cards[2]);
	    System.out.printf("%s", d.cards[3]);
	    System.out.printf("%s", d.cards[4]); */
		Card [] p1 = new Card[5];
		Card [] p2 = new Card[5];
		Card [] p3 = new Card[5];
		Card [] p4 = new Card[5];
		
		/* int k = 0;
		for(int i = 0; i<5; i++) { //카드 다섯장을 
			for(int j = 0; j<4; j++) { // 4명에게 분배
				p1[i]  = d.cards[k++];
			}
		}*/
		int k = 0;
		for(int i = 0; i<5; i++) {
			p1[i]  = d.cards[k++];
			p2[i]  = d.cards[k++];
			p3[i]  = d.cards[k++];
			p4[i]  = d.cards[k++];			
		}
		for(int i = 0; i<5; i++) 
			System.out.printf("%s\t ", p1[i].toString());
		System.out.println();
		for(int i = 0; i<5; i++) 
			System.out.printf("%s\t ", p2[i].toString());
		System.out.println();
		for(int i = 0; i<5; i++) 
			System.out.printf("%s\t ", p3[i].toString());
		System.out.println();
		for(int i = 0; i<5; i++) 
			System.out.printf("%s\t ", p4[i].toString());
		System.out.println();
		
	
	}

}
