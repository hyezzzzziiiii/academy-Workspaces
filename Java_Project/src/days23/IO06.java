package days23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		// BufferedReader 클래스의 객체를 사용하여 기본자료형의 타입을 읽어 온후 형변환을 시행합니다
		System.out.print("정수를 입력하세요: ");
		input = br.readLine();
		int num = Integer.parseInt(input); // 입력된 문자열을 정수로 변환
		System.out.printf("입력된 정수 : %d\n", num);
		
		System.out.print("실수를 입력하세요: ");
		input = br.readLine();
		double d = Double.parseDouble(input); // 입력된 문자열을 실수로 변환
		System.out.printf("입력된 실수 : %.2f\n", d);
		
		System.out.print("문자를 입력하세요: ");
		char ch = (char)br.read();
		System.out.printf("입력된 문자 : %c\n", ch);
		br.close();
		
		}

}
