package days12;
class Account{
	double  balance; //계좌 잔액 정보를 저장할 멤버필드
	// private을 사용하면 같은 클래스 내에서만 사용가능 
	public void display() {
		System.out.printf("현재 잔액은 %.2f원 입니다.\n", balance);
	}  // 잔고 확인 가능

	public void initBanance(int money){
		balance = money;
	}  // 잔액초기화
	public void withdraw(int money){
		balance -= money;
	}  // 출금가능
	public void deposit(int money){
		balance += money;
	}  // 입금가능
}
public class Class05 {

	public static void main(String[] args) {
        Account a = new Account();
        a.initBanance(10000);  //잔액초기화 메서드
        a.display();  // 현재 잔액을 화면에 출력하는 메서드
        
        a.withdraw(5000);  // 출금
        a.display();
        
        a.deposit(20000);  // 예금
        a.display();
        // 클래스의 멤버필드/메소드는 접근지정자(private, protected, public)에 의해서 외부에서의 접근을 제어
        // 접근지정자를 사용하지 않는 경우 기본지정으로 public이 설정되며 아래와 같이 임의의 값으로 
        // 멤버필드의 값이 임의로 수정될 수 있습니다.
        a.balance +=5000;
        // private 은 자기자신 class의 멤버메서드만 접근 가능합니다.
        // 따라서 만약 balance가 private으로 지정이 되면 아래 명령들은 모두 에러입니다.
        // a.balance +=5000; //에러
        // System.out.printf("현재 잔액은 %.2f원 입니다.\n", a.balance); // 에러
        
        // 결국 private으로 지정된 멤버필드는 같은 클래스내의 멤버 메서드를 이용해야지만 값을 변경하거나
        // 얻어 올 수 있습니다.
	}
	
}
