package days08;

import java.util.Scanner;

public class ControllOp_DoWhile01 {

	public static void main(String[] args) {
		// 
		int i;
		for(i=11; i<=10; i++) {
			System.out.printf("%d", i);
		} //출력안함
		System.out.println("\tfor 반복 종료 후 값 : "+ i);
		
		i=11;
		while(i<=10) {
			System.out.printf("%d", i);
			i++;
		} //출력안함
        System.out.println("\twhile반복 종료 후 값 : "+i);
       
        i=11;
        do {
        	System.out.printf("%d ", i);
        	i++;
        }while(i<=10); //do-while ;여부 확인
			System.out.println("\tdo-while반복 종료 후 값 : " + i);
        //한번 실행함
        	
			Scanner sc = new Scanner(System.in);
			int input;
			do {
	        	System.out.printf("정수를 입력 : ");
	        	input = sc.nextInt();
	        }while(input!=100); //do-while ;여부 확인
				System.out.println("프로그램 종료");
	}

}
