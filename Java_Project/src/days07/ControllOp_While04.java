package days07;

import java.util.Random;
import java.util.Scanner;

public class ControllOp_While04 {

	public static void main(String[] args) {
        Random rd = new Random();   // 난수 발생을 위한 위부도구 import
        Scanner sc = new Scanner(System.in);
        System.out.print("가위(1), 바위(2), 보(3) 중 선택, 종료(0) :  ");
        int b = sc.nextInt();
               
        while(b!=0) {
        int k = rd.nextInt();  // 난수 발생
        //System.out.println(k);
        
        if(k<0) k = k*(-1); //음수라면 -1을 곱해 양수만든다.
        k = k%3+1; 
        //k는 컴퓨터가 랜덤으로 만들어 내는 수, 1,2,3 만을 만들어내기 위해 if조건문으로 실행
     
        /* while 문 이자리에 써도 실행됨 - 확인필요
        Scanner sc = new Scanner(System.in);
        System.out.print("가위(1), 바위(2), 보(3) 중 선택, 종료(0) :  ");
        int b = sc.nextInt();*/
        
        if(b==1) System.out.printf("나 : 가위\n");
        else if(b==2) System.out.printf("나 : 바위\n");
        else  System.out.printf("나 : 보\n");
        
        if(k==1) System.out.printf("컴퓨터 : 가위\n");
        else if(k==2) System.out.printf("컴퓨터 : 바위\n");
        else System.out.printf("컴퓨터 : 보\n");
        
        if(b==1 && k==1) System.out.println("비겼습니다");
        else if(b==1 && k==2) System.out.println("졌습니다");
        else if(b==1 && k==3) System.out.println("이겼습니다");
        else if(b==2 && k==1) System.out.println("이겼습니다");
        else if(b==2 && k==2) System.out.println("비겼습니다");
        else if(b==2 && k==3) System.out.println("졌겼습니다");
        else if(b==3 && k==1) System.out.println("졌겼습니다");
        else if(b==3 && k==2) System.out.println("이겼습니다");
        else if(b==3 && k==3) System.out.println("비겼습니다");
        
        System.out.print("가위(1), 바위(2), 보(3) 중 선택, 종료(0):  ");
        b = sc.nextInt(); 
        // 옆의 식을 쓰지 않으면 while특성상 무제한으로 반복됨.
        }
        System.out.printf("프로그램이 종료되었습니다.");
	}

}
