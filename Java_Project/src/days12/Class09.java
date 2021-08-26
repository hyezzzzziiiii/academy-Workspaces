package days12;
// 멤버메서드의 주된 목적은 멤버 변수의 값을 세팅하거나 얻어오거나...들의 목적이 가장 큽니다.
// 때문에 멤버메서드를 별도의 사유가 없어도 멤버 변수에 따라 필요한 만큼 만들고 시작하는 경우가 많습니다.
// 메서드의 이름은 setters와 getters라는 이름을 사용하는 두개의 메서드입니다.
class GetSetTest{
	private int num;
	private double  dou;
	private String str;
	
	public int getNum() {
		return num;  
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getDou() {
		return dou;
	}
	public void setDou(double dou) {
		this.dou = dou;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	// 현재 위치에서 마우스 오른쪽 버튼 클릭 ->Source ->Generate getters and setters클릭
	/*public void initNum(int n) {
		num = n;
	}
	public int getNum() {
		return num;		
	}*/
	// 멤버 변수가 하나 만들어지면, 그 변수에 값을 세팅할 수 있는 메서드와 값을 얻어낼 수 있는 메서드를 
	// 생성해서 사용합니다.
	// getters메서드와 setters메서드는 멤버 변수에 값을 넣거나 얻기 위한 기본도구로 활용합니다.
	// 멤버 변수의 갯수가 많으면 getters메서드와 setters메서드도 많아 집니다.
	// 이를 위해 이클립스에서 getters와 setters메서드를 자동생성하는 명령을 제공합니다.
	
}
public class Class09 {

	public static void main(String[] args) {
        GetSetTest g = new GetSetTest();
        g.setNum(30); //g.initNum(30);
        int k = g.getNum();
        System.out.println(k);
        // System.out.println(g.getNum());

	}

}
