package days23;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IO11 {

	public static void main(String[] args) throws IOException {
		// D:\\학원\\변혜지  파일의 내용을 읽어다가 
		// 콘솔창에 출력하세요
		
		File dir = new File("D:\\학원\\변혜지");
		if( ! dir.exists() ) dir.mkdirs();
		
		File file_text = new File(dir, "abc.txt");
		FileReader fr_text = new FileReader(file_text); 
		// FileWriter는 파일에 문자데이터를 출력할 수 있는 객체를 만들고 FileReader는 읽어와 콘솔창에 출력
		int data_text;
		while((data_text = fr_text.read()) != -1)
			System.out.print((char)data_text);
		// 스트림 종료
		fr_text.close();

	}

}
