package days04;

import java.util.Scanner;

public class ControllOp06 {

		// if () {}, else if() {}에서 
		// 괄호() 안에는 
	    // () 뒤로 나오는 {} 안의 명령을 실행할지 안할지를 결정할
		// *관계(비교) 연산식* 또는 *boolean값*이 들어갑니다.
		
		// if(a>10){}
		// 만약 if문의 구성이 if(true){}라고 한다면 {}안의 명령은 항상 실행됩니다.
		// 반대로 if (false) {} 라면 항상 실행되지 않습니다.
		// if ,else if, else 를 구성할 때는 각 구간들의 값들을 빠짐없이 챙겨서 구간을 구성하는것이 중요합니다.
	
	   public static void main(String[] args) {
		// 년도를 입력받아서 입력받은 연도가 윤년인지 평년인지를 판단하여 출력하시오
		// 윤년의 조건 : 입력한 년도가 4의 배수(4로 나눈 나머지가 0이면 4의 배수)이면서, 100의 배수가 아니거나 400의 배수인 해
		// 입력받은 년도를 저장할 변수와 그 년도를 4,100,400으로 각각 나눈 나머지를 저장할 변수

			
		Scanner sc = new Scanner(System.in);
		int year, a,b,c;
		System.out.println("년도를 입력하시오.");
		year = sc.nextInt();
		
		a = (year % 4);
		b = (year % 100);
		c = (year % 400);
				
	    if((a == 0) && ((b != 0) || (c ==0)))
	    	System.out.println("입력한 년도는 \"윤년\" 입니다.");
	    else
	    	System.out.println("입력한 년도는 \"평년\" 입니다.");
		 
	}

}
