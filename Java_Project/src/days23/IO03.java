package days23;

import java.io.IOException;

public class IO03 {

	public static void main(String[] args) throws IOException {
		// System.in 객체를 사용하여 더하기 연산을 수행하는 프로그램을 작성하세요
		// 첫번째 정수 : 123, 두번째 쩡수 25, 결과 : 123+ 25 = 148
		
		byte [] firstNumber = new byte[10];
		byte [] secondNumber = new byte[10];
		
		System.out.print("첫번쨰 정수:");
		int size_1 = System.in.read(firstNumber);
		System.out.print("두번쨰 정수:");
		int size_2 = System.in.read(secondNumber);

		// 입력한 글자들 외에 데이터의 끝을 표시하는 글자와 입력한 엔터까지 저장되어서 
		// 배열에 저장된 데이터 갯수 +2 개의 size가 출력됩니다
		System.out.println(size_1 + " " + size_2);
		// 165입력했을 경우 firstNumber[0] ='1'  // firstNumber[1] = '6'//firstNumber[2] = '5'
		// ('1'-'0')*100 + ('6'-'0')*10 + ('5' - '0')*1  
		int i, m, n1 =0, n2 =0;
		for(i = size_1 -3, m = 1; i>=0; i--, m =m*10) {
			n1 +=(firstNumber[i] -'0') *m;
		}
		
		// i는 1의 자리 숫자가 있는 첨자부터 0번째 (가장 큰자리수 숫자가 있는 곳)까지 반복
		// 1234 입력시 size가 6이고, i변수는 6-3을 size-3변째부터 0까지 반복합니다.
		// 그처음이 '4'해당하는 글자 1의 자리 글자입니다.  
		// 그렇게 지목된 일의 자리의 글자부터 '0' 글자를 발생해서 아스키코드 값의 차로 해당 숫자를 얻고
		// 각 반복마다 10이 계속 곱해지는 (1, 10,100,1000...)  m값을 곱해서 각 자리수를 만듭니다.
		// 또한 그것을 n1 변수에 누적됩니다.
		
	   System.out.printf("%d +", n1);
	   for(i = size_2 -3, m = 1; i>=0; i--, m =m*10) {
			n2 +=(secondNumber[i] -'0') *m;
	}
	   System.out.printf("%d = ", n2);
	   System.out.println((n1 + n2));
}
}
