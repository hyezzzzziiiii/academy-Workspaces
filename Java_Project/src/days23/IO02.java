package days23; //* 확인

import java.io.IOException;

public class IO02 {

	public static void main(String[] args) throws IOException {
		// InputStream 클래스의 read메서드
		// read() : 입력 스트림으로부터 가장 앞에 위치한 1바이트를 읽어옵니다.
		// read(byte []): 입력 스트림의 가장 앞부터 매개변수로 전달된 배열의 크기까지의 바이트를 읽어옴
		// read(byte [], int startIndex, int size) : 입력 스트림의 가장 앞부터 size 크기만큼 데이터를
		// 읽어옵니다
		//  저장은 매개변수로 전달된 배열의 startIndex위치부터 저장
		byte [] input = new byte [20];  //20개짜리 배열 만들고 배열에 입력 받게끔
		System.out.print("\n키보드 입력을 실행하세요 : ");
		int size = System.in.read(input);
		System.out.printf("읽어온 바이트의 크기는 %d입니다.\n", size);
		for(int i =0; i <input.length; i++)  System.out.printf("%c", (char)input[i]);
		// length로  출력하여 20개의 크기가 출력이되어 숫자사이에 빈칸이 나옴
		//(char)input[i]의 배열을 그대로 넣어줌

	}

}
