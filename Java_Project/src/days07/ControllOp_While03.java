package days07;

import java.util.Scanner;

public class ControllOp_While03 {

	public static void main(String[] args) {
		// 사용자에게서 단을 입력받아 구구단을 출력
		// 사용자가 0을 입력할 때 까지 반복적으로 입력받고 구구단을 출력
		
		int i , g;   //g = 입력할 단
		Scanner sc = new Scanner(System.in);
		System.out.printf("출력할 구구단의 단 입력 (종료 : 0) :  ");
		g = sc.nextInt();
		
		while(g!=0) {
		for( i = 1; i<=9; i++)
			System.out.println(g+ "x" + i + "=" +(g*i));
			System.out.printf("출력할 구구단의 단 입력 (종료 : 0) :  ");
		    g = sc.nextInt();
		    }	
		System.out.printf("프로그램이 종료되었습니다.");
	    }

	}


