package days04;

import java.util.Scanner;

public class ControllOp03 {

	public static void main(String[] args) {
		// 출생년도를 이력받아서 나이를 계산한 후

		int year, age;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("출생년도를 입력하세요 : ");
        year = sc.nextInt(); 
        
        age = 2020 - year;
		// 나이가 20이상이면 성년
		// 20미만이면 미성년자 라고 출력합니다.
        if(++ age>=20) {
        	System.out.println("성인입니다.");
        }else{
        		System.out.println("미성년자입니다.");
        }
        }
	}


