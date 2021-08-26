package days24;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

// 사칙연산의 결과를 저장할 수 있는 CalculatorResult 클래스를 작성하세요
// CalculatorResult 클래스 연산에 사용된 좌항, 우항의 정보, 연산자 부호, 연산의결과를 저장할 수 있습니다.
// CalculatorResult 클래스는 toString 메서드를 통해서 연산식과 결과를 출력할 수 있습니다.

class CalculatorResult implements Serializable{
	// 2*36 = 72 : 2는 좌항, 36은 우항, *는 operator, 72는 result
	private int leftValue;
	private int rightValue;
	private String operator;
	private double result;
	
	public CalculatorResult(int leftValue, int rightValue, String operator, double result) {
		//super(); 존재의미 무관
		this.leftValue = leftValue;
		this.rightValue = rightValue;
		this.operator = operator;
		this.result = result;
	}
	@Override
	public String toString() {
		DecimalFormat df  = new DecimalFormat("#,##0.00");
	    return this.leftValue + this.operator + this.rightValue + "=" + df.format(this.result);
	}


}
public class IO19 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 사용자에게 정수 2개와 계산식에 사용될 부호를 입력받아 결과를 출력합니다.
		// 결과는 해당클래스 객체를 생성하여 저장하고, toString으로 출력합니다
		// 반복문을 활용하여 사용자가 종료를 원할 때까지 계산을 수행하고 history리스트에 저장합니다.

		ArrayList<CalculatorResult> history = new ArrayList<CalculatorResult>();
		
		// 화면입력을 위한 입력스트림 생성
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// 필요변수선언
		int leftValue, rightValue;
		String operator;
		double result = 0;
		
		while(true) {
				// 좌항입력
			    System.out.print("좌항을 입력하세요");
			    leftValue  = Integer.parseInt(in.readLine());
			    
			    // 연산부호 입력
			    System.out.print("연산부호를 입력하세요");
			    operator = in.readLine();
			    // trim메서드는 문자열 앞뒤에 있는 공백을 제거(문자열 사이의 공백은 제거되지않음)
			    operator = operator.trim();
			    
			    // 우항입력
			    System.out.print("우항을 입력하세요");
			    rightValue  = Integer.parseInt(in.readLine());
			    
			    // 연산부호에 따른 연산
			    if(operator.equals( "+" )) result = leftValue + rightValue;
			    else if(operator.equals( "-" )) result = leftValue - rightValue;
			    else if(operator.equals( "*" )) result = leftValue * rightValue;
			    else if(operator.equals( "/" )) result = leftValue / (double)rightValue;
			    else if(operator.equals( "%" )) result = leftValue % rightValue;
			    
			    // 생성자에 각 요소를 전달하여 객체 생성
			    CalculatorResult temp
			     = new CalculatorResult(leftValue, rightValue, operator, result);
			    // 화면 출력
			    System.out.println(temp);
			    // 리스트에 저장
			    history.add(temp);
			    
			    System.out.print("종료? (y/n) : ");
			    char isExit = in.readLine().trim().charAt(0);
			    if(isExit == 'y' || isExit == 'Y') break;
		} 
		// history를 파일에 저장 파일 이름은 오늘 날짜 2020_11_26_10_17.dat
		File dir = new File("D:\\변혜지\\workspaces\\Java_Project\\temp");
		if (!dir.exists()) dir.mkdirs();
		
		Calendar c = Calendar.getInstance();
		Date now = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm");
		String fileName = sdf.format(now) + ".dat";
		// 문자열과 다른 자료형의 '+'연산의 결과는 이어붗이기 후 최종 문자열이 됩니다.
		
		File file = new File(dir, fileName);
		ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(file)));
		oos.writeObject(history);
		oos.close();
		    
	}

}
