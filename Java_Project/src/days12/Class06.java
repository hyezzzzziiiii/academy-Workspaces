package days12;

import java.util.Scanner;
// 접근지정자
// 모든 클래스의 멤버는 현실에 존재하는 대상의 정보로서, 
// 직접적인 접근이 허용되는 것과 허용 안되는 정보가 있습니다.
// 접근지정자는 클래스의 멤버들에 대한 접근을 제어하는 키워드입니다.
// private : 클래스의 내부에서만 사용가능한 멤버를 정의하는 키워드
// public : 접근에 제한이 없는 멤버를 정의하는 키워드
// protected : child class 에서만 자유롭게 접근이 가능. "상속"단원에서 자세히 학습합니다.
// default : 접근지정자를 지정하지 않으면 자동으로 갖게되는 접근지정자이며, 같은 패키지 내에서 자유롭게 
//              접근가능합니다.
class AccountWithPermission{
	// 정보은닉
	// 클래스 내부에 선언된 멤버필드들은 현실에 존재하는 대상의 정보를 저장합니다.
	// 일반적으로 이러한 정보들은 직접적으로 접근 및 수정해서는 안됩니다.
	// 이러한 이유로 모든 멤버필드들은 private으로 선언하고, 멤버필드들을 제어할 수 있는 메소드들을 
	// public으로 선언합니다
	
	// 클래스 외부에서의 접근을 차단한 잔액 정보
	private double balance;
	public void initBanance(int money) {balance = money;}
	
	public void withdraw(int money) {
		if(money >balance) {
			System.out.println("잔액이 부족합니다.");
			return;
			// void메서드의 return은 반환될 값없이 사용되며, 메서드를 현위치에서 종료하는 명령입니다.
		}
		balance -= money;
	} //출금
	public void deposit(int money) {
		if(money <= 0) {
			System.out.println("입금 금액에 문제가 발생되었습니다. 관리자에게 문의하세요");
			return;
		}
		balance += money;
	}//입금
	public void display() {
		System.out.printf("현재 잔액은 %.2f원 입니다.\n", balance);
	}
}
public class Class06 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int money, selectMenu;
	  AccountWithPermission a = new AccountWithPermission(); // 객체생성
	  a.initBanance(50000); //잔액초기화
	  System.out.printf("메뉴선택 : 1. 입금  2. 출금  3. 잔액확인  4. 종료");
	  selectMenu = sc.nextInt();
	  
	  while(selectMenu != 4) {
		  switch(selectMenu) {
		  case 1 :
			  System.out.printf("입금할 금액을 입력하세요");
			  money = sc.nextInt();
			  a.deposit(money);
			  a.display();
			  break;
		  case 2 :
			  System.out.printf("출금할 금액을 입력하세요");
			  money = sc.nextInt();
			  a.withdraw(money);
			  a.display();
			  break;
		  case 3 :			 
			  a.display();
			  break;
		  }
		  System.out.printf("메뉴선택 : 1. 입금  2. 출금  3. 잔액확인  4. 종료");
		  selectMenu = sc.nextInt();
	  }
          System.out.printf("프로그램 종료");
	}

}
