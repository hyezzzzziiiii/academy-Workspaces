package days04;

import java.util.Scanner;

public class ControllOp04 {

	public static void main(String[] args) {
		// 출생년도를 입력받고 나이를 계산해서
		// 12세 미만 어린이, 12~18세 청소년, 19세 이상(나머지)성년으로 출력하세요.
		Scanner sc = new Scanner(System.in);

		int year, age;
		System.out.println("출생년도를 입력하세요 : ");
		year = sc.nextInt();		
		age = 2020 - year;
		
		if(age<12) 
			System.out.println("어린이 입니다.");
		else if(age >=12 && age <=18) 
			System.out.println("청소년입니다.");
		else if(age >=19 && age <=24) 
			System.out.println("청년입니다.");
		else System.out.println("성년입니다.");
		
	}

}
