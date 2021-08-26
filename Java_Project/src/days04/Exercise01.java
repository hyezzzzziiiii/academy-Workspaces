package days04;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// 출생년도를 입력받아 나이를 계산하고 계산된 나이를 출력하세요. (변수이름 : year, age)
		// 현재년도에서 출생년도를 뺀 나이 한살 더 많은 한국식 나이 계산
		Scanner sc = new Scanner(System.in); //윗줄에 있어야 출력 가능
		// 출생년도와 나이를 저장할 변수 생성
		int year, age;
		// 출생년도의 입력
		System.out.printf("출생년도를 입력하세요.");
		year = sc.nextInt();
        
	    // 나이계산
		age = 2020- year;		
	    System.out.println("입력하신 출생년도에 해당하는 한국식 나이는 " + ++age + "입니다.");
	    // age++를 할 경우 20으로 결과 나오고 아직 21이 안나온 것임
	    System.out.println("입력하신 출생년도에 해당하는 미국식 나이는 " + age + "입니다.");
		// 계산된 나이와 한국식 나이 출력
		// System.out.println("입력하신 출생년도에 해당하는 미국식 나이는 " + age++ + "입니다.");
        // System.out.println("입력하신 출생년도에 해당하는 한국식 나이는 " + age + "입니다."); 위와 동일
	}

}
