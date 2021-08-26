package days15;

public class Card {
	  final static int spade = 4; // 값을 변경시킬 수 없게 만드는 변수 final
	    final static int diamond = 3;
	    final static int heart = 2;
	    final static int clover = 1;
		
		int kind; 
		int number;

		public Card(int kind, int number) {
			this.kind = kind;
			this.number = number;
		}
		public Card() {
			this(spade, 1);
			// this.kind = spade; this.number = 1;
		}
		public String toString() {
			String [] kinds = {"","Clover", "Heart", "Diamond", "Spade"};
			String [] numbers = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
			return "[" + kinds[this.kind]+":" + numbers[this.number]+"]";
			// kind이 4, number:13 이라면 만들어진고 리턴될 문자열'[Spade:k]'
			}
			// Card c = new Card(4,13);
			// Syste.out.println(c.toString());
			// 출력 :[Spade:K]
}
