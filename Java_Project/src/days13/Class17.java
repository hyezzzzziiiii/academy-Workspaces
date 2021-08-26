package days13;
class Sum{
	private int a;
	private int b;
	
	Sum(int a, int b){  //생성자
		this.a = a;
		this.b = b;
	}
	/*public int add() {
		return a + b;
	}
	public int add(int c) {
		return a + b + c;
	}
	public int add(int c, int d) {
		return a + b + c + d;
	}
	public int add(int c, int d, int e) {
		return a + b + c + d + e;
	} */
	public int add(int... c) {
		int tot = 0;
		System.out.println("매개변수 4");
		for(int i =0; i <c.length; i++)
			tot += c[i];
		return a + b + tot;
	}
}
public class Class17 {

	public static void main(String[] args) {
		Sum s = new Sum(25,36);
		System.out.println("s.add()의 결과 : " + s.add());  //a+b
		System.out.println("s.add(23)의 결과 : " + s.add(23));  //23+a+b
		System.out.println("s.add(59,65)의 결과 : " + s.add(59,65));  //59+65+a+b
		System.out.println("s.add(59,65,85)의 결과 : " + s.add(59,65,85));  //59+65+85+a+b

	}

}
