package days18;

import java.util.Date;

public class String02 {

	public static void main(String[] args) {
		//11.
		 String s= "Hello";
		 System.out.println("\n11. " + s +" s.replace(\'H\', \'C\') ->" + s.replace('H','C'));
		 String s2 = s.replace('H','C');  // H를 C로 치환 /s = Hello , 변경된 것이 s2에 저장
		 System.out.println("11. " + s + " " +s2);
		 System.out.println("11. " + s +" s.replace(\'ll\', \'LL\') ->" + s.replace("ll","LL"));
		 s2 = s.replace("ll","LL");
		 System.out.println("11. " + s + " " +s2);
		 // String 클래스는 보관하고 있는 문자열을 이용하여  변화를 주는 메서드들에서
		 // 변화된내용이 업데이트 되듯 저장되는 것이 아니고 대부분 새로운 변화된 문자열 객체로 만들어 리턴합니다.
		 // 따라서 다양한 메서드들이 있지만 실행결과가 원본 s문자열을 변경시키지는 못합니다.
		 
		 System.out.println();
		 //12. 
		 String animal = "dog,cat,bear";
		 String [] a  = animal.split("," ); // "," 를 기준(다른 문자도 가능)으로 문자열을 분리 - 문자열 배열로 만듬
		 System.out.println("\n12. ");
		 for(int i = 0; i<a.length; i++)  System.out.printf("%s ", a[i]);
		 
		 System.out.println();	 
		 //13.
		 s= "java.lang.Object";
		 s2 = s.substring(5,9);  // 원본에서 다섯번째 글자(0부터시작)부터 8번째(9바로 전)까지 추출
		 System.out.println("\n\n13. " + s2);
		 s2 = s.substring(10);  // 원본에서 열번째 글자부터(0부터 시작하여 10적용) 끝까지 추출
		 System.out.println("13. " + s2);
		 
		 System.out.println();
		 
		 //14.
		 System.out.println("\n14. " + String.valueOf(true));
		 s = String.valueOf(100);
		 System.out.println("14. " + s);
		 s = String.valueOf(100.123);
		 System.out.println("14. " + s);
		 // java.util.Date dd = new java.util.Date();
		 Date dd = new Date(); // java.util.Date  Ctrl + Shift + O  <- import 단축키
		 s = String.valueOf(dd);  // valueOf 정수형, 실수형, 문자열 데이터 오버로드 되어있음
		 System.out.println("14. " + s);
		 
		 // s = "3217";
         // Interger.parseInt(s);
		 
		 // s = "321.123";
		 // Double.parseDouble(s);
		 // Boolean.paeseBoolean("true");
		 
	}

}
