package days09;

import java.util.Random;
import java.util.Scanner;

public class Array13 {

	public static void main(String[] args) {
		// 야구게임 프로그램
		// 상대가 나에게 알려주지 않은 숫자를 질문과 답변을 통해 맞춰가는 게임
		// 나에게 알려주지 않은 숫자 : 5 6 7같은 한자리 숫자 세개 생성
		// 질문 : 3 6 7 (같은 한자리 숫자 세개 입력 받아서 저장된 숫자와 비교)
		// 답변 : 1S 1B(같은 숫자가 자리수가 같으면 S 숫자만 같으면 B로 갯수 출력
		// 숫자하나는 0~9까지 세개의 숫자 중 중복숫자 없음
		int [] com = new int[3];
		int [] user = new int[3];
		int s = 0, b=0;
		Random rd = new Random();
		// 컴퓨터가 나에게 알려주지 않은 숫자 세개를 결정해서 저장해둠(배열이동, Random객체 이용)
		for(int i= 0; i<com.length; i++) {
			int a = rd.nextInt(); // 랜덤 난수 발생
			if (a<0)a = a*-1;  // 음수 발생 시 양수로 전환
				com[i] = a%10;  // 10으로 나눈 나머지 0~9로 계산
			int j;
			for(j=0; j<i; j++) // 동일한 숫자 발생시 다시
				if(com[i] == com[j]) break;
			if(i !=j ) i--;  // 동일한 숫자 발생시 다시
		}
		// System.out.println(com[0] + " "+ com[1] + " " + com[2]); -> 주석처리해야 컴퓨터가 주는 문자 안보임
		
		Scanner sc = new Scanner(System.in); // 1. 사용자(나)에게 세개의 숫자 입력 받음
		
		while(s!=3) {
		System.out.print("입력(숫자 세자리) : ");
		
		//방법 1)
		/* System.out.print("입력(한자리 숫자) : ");
		user[0] = sc.nextInt();
		System.out.print("입력(한자리 숫자) : ");
		user[1] = sc.nextInt();
		System.out.print("입력(한자리 숫자) : ");
		user[2] = sc.nextInt(); */
		
		//방법 2)
		/* System.out.print("입력(숫자 세자리) : ");
		int input;		
		input = sc.nextInt();  // 365
		user[0] = (int)(input/100);  // 365 -> 3
		input = input%100; // 365 -> 65
		user[1] = (int)(input/10); // 65 -> 6
		input = input%10;  // 65 -> 5
		user[2] = input;  //5
		
		System.out.println(user[0] + " " + user[1] + " " + user[2]); */
		
		// 방법3)
		String userNurm;
		userNurm = sc.nextLine();
		// 세개의 아라비아 기호를 한번에 입력받아 하나씩 분리 -> 숫자로 변환
		// String의 charAt은 문자열의 내용중 ()안에 있는 숫자 번째의 한글자를 추출합니다.
		user[0] = userNurm.charAt(0) - '0';  // userNurm.charAt(0) :  "365"- >'3' 
		//'3' -'0' ->3 아라비아 기호들끼리의 뺄셈연산은 아스키 코드값들끼리 연산합니다.
		user[1] = userNurm.charAt(1) - '0'; // userNurm.charAt(1) :  "365"- >'6' 
		//'6' -'0' ->6
		user[2] = userNurm.charAt(2) - '0'; // userNurm.charAt(2) :  "365"- >'5' 
		//'5' -'0' ->5
		System.out.println(user[0] + " " + user[1] + " " + user[2]);
		
		s=0; b=0;
		for(int i = 0; i< com.length; i++) {
			for(int j=0 ; j<user.length; j++) {
				if(com[i] == user[j]) {
					if(i==j) s++;
					else b++;
					
				}
			}
		}
		System.out.println(s + "Strike  " + b + "Ball");
	 }
		System.out.println("모든 숫자를 맞췄습니다. 프로그램을 종료합니다.");
	}	

}
