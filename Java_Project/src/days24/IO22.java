package days24;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class IO22 {

	public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
		// 특정 날짜를 입력받아서 그날짜 파일만 출력하세요
		// 날짜 입력양식을 정해서 잘못된 입력은 다시 입력받게 설정해주세요	
	    System.out.print("출력할 날짜를 입력하세요. (2020-01-01)");
	    String inputDate;   	    
	    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	    BufferedReader in = new BufferedReader( new InputStreamReader(System.in));   
	        
	    while(true) {
	    	try {
	    		inputDate = in.readLine(); // 날짜 입력
	    		// 입력형식이 2020-01-01형식에 맞지 않으면 예외 발생
	    		Date iDate = sdf1.parse(inputDate);
	    		break;
	    	}catch (ParseException e ) {
	    		System.out.print("입력형식이 잘못되었습니다. 2020-01-01 형식으로 다시 입력하세요.");
	    	}
	    }
	
	    // 읽어올 파일 경로 설정
		File dir = new File("D:\\변혜지\\workspaces\\Java_Project\\temp");
		// 폴더에서 모든 파일 목록 불러옴
		String [] f = dir.list(); // 설정 폴더안의 모든 파일의 이름을 문자열 배열로 반환
		// 파일 명들을 이용한 반복실행 문을 실행하여 입력한 파일만 대상으로 내용을 읽은 후 화면 출력
		 for(int i =0; i< f.length; i++) {
			 if(f[i].length()>10) {
				 // 현재 반복실행 중인 파일이름의 날짜에 해당하는 앞 10글자 추출
				 String s1 = f[i].substring(0,10);
				 String s2 = "";
				 SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy_MM_dd");
			try {
					Date d1 = sdf2.parse(s1);  //파일 이름에서 추출한 10글자를 날짜로 변경
					s2 = sdf1.format(d1); // 변경된 날짜의 포맷을 0000-00-00으로 변경후 문자로 저장
			 } catch(ParseException e) {}
				
				if( s2.equals(inputDate)) {  //입력한 날짜와 현재 파일에서 얻어낸 날짜를 비교
					File file = new File(dir, f[i]);
					ObjectInputStream ois = new ObjectInputStream(
							new BufferedInputStream(new FileInputStream(file)));
					
					 ArrayList<CalculatorResult> list 
					 = (ArrayList<CalculatorResult>) ois.readObject();
					 
					 System.out.println(inputDate + " 기록내역: ");
					 for(int j =0; j< list.size(); j++)
							System.out.printf("%d. %s\n", j+1, list.get(j)); 
						
						ois.close();
				}
		     }
          }
       }
    }
