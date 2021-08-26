package days19;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Calculator extends JFrame implements ActionListener{
	JTextField jt;  // 클래스 입장 - 멤버변수/ 전역변수라고도 불림
	
	int num1 = 0, num2 = 0, result1 = 0;
	double result2 = 0.0;
	int op = 0;
	
	Calculator(){
		// 컨테이너의 레이아웃 : 5행의 1일의 GridLayout
		// 1행: JPanel p1 배치 -> p1에는 FlowLayout으로 textField 한개 배치(가로크기 적당히)
		// 2행: JPanel p2 배치 -> p2에는 GridLayout으로 버튼 네게(7,8,9,+)
		// 3행: JPanel p3 배치 -> p3에는 GridLayout으로 버튼 네게(4,5,6,-)
		// 4행: JPanel p4 배치 -> p4에는 GridLayout으로 버튼 네게(1,2,3,x)
		// 5행: JPanel p5 배치 -> p5에는 GridLayout으로 버튼 네게(C,0,=,÷)
		Container con = getContentPane();
		con.setLayout(new GridLayout(6,1));
		
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1,1));  
		
		jt = new JTextField(16);  //텍스트 입력칸 크기 -> 값을 넣으려면 setText이용
		
		Font f = new Font("굴림", Font.BOLD, 20); //폰트 객체 생성
		jt.setFont(f);  // 생성된 폰트 적용
		jt.setText("0");  
		jt.setHorizontalAlignment(SwingConstants.RIGHT);
		jt.setEditable(false); // 마우스 키보드로 편집할 수 없게 설정
		
		
		p1.add(jt);
		con.add(p1);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1,4));
		
		JButton b7 = new JButton("7");
		b7.setFont(f);  
		b7.addActionListener(this);
		p2.add(b7);
		
		JButton b8 = new JButton("8");
		b8.setFont(f);  
		b8.addActionListener(this);
		p2.add(b8);
		
		JButton b9 = new JButton("9");
		b9.setFont(f);  
		b9.addActionListener(this);
		p2.add(b9);
		
		JButton b11 = new JButton("+");
		b11.setFont(f);  
		b11.addActionListener(this);
		p2.add(b11);
		
		con.add(p2);
		
		
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(1,4));
		
		JButton b4 = new JButton("4");
		b4.setFont(f);  
		b4.addActionListener(this);
		p3.add(b4);
		
		JButton b5 = new JButton("5");
		b5.setFont(f);  
		b5.addActionListener(this);
		p3.add(b5);
		
		JButton b6 = new JButton("6");
		b6.setFont(f);  
		b6.addActionListener(this);
		p3.add(b6);
		
		JButton b12 = new JButton("-");
		b12.setFont(f);  
		b12.addActionListener(this);
		p3.add(b12);
		
		con.add(p3);
		
		JPanel p4 = new JPanel();
		p4.setLayout(new GridLayout(1,4));
		
		JButton b1 = new JButton("1");
		b1.setFont(f);  
		b1.addActionListener(this);
		p4.add(b1);
		
		JButton b2 = new JButton("2");
		b2.setFont(f);  
		b2.addActionListener(this);
		p4.add(b2);
		
		JButton b3 = new JButton("3");
		b3.setFont(f);  
		b3.addActionListener(this);
		p4.add(b3);
		
		JButton b13 = new JButton("x");
		b13.setFont(f);  
		b13.addActionListener(this);
		p4.add(b13);
		
		con.add(p4);
		
		JPanel p5  = new JPanel();
		p5.setLayout(new GridLayout(1,4));
		
		JButton b15 = new JButton("C");
		b15.setFont(f);  
		b15.addActionListener(this);
		p5.add(b15);
		
		JButton b10 = new JButton("0");
		b10.setFont(f);  
		b10.addActionListener(this);
		p5.add(b10);
		
		JButton b16 = new JButton("=");
		b16.setFont(f);  
		b16.addActionListener(this);
		p5.add(b16);
		
		JButton b14 = new JButton("÷");
		b14.setFont(f);  
		b14.addActionListener(this);
		p5.add(b14);
		
		con.add(p5);
		
		JPanel p6  = new JPanel();
		p6.setLayout(new GridLayout(1,4));
		
		JButton b17 = new JButton("◀");  //백스페이스
		b17.setFont(f);  
		b17.addActionListener(this);
		p6.add(b17);
		
		JButton b18 = new JButton("1/x");  //x분의 1
		b18.setFont(f);  
		b18.addActionListener(this);
		p6.add(b18);
		
		JButton b19 = new JButton("Sqr");  //제곱근
		b19.setFont(f);  
		b19.addActionListener(this);
		p6.add(b19);
		
		JButton b20 = new JButton("%");  //나머지
		b20.setFont(f);  
		b20.addActionListener(this);
		p6.add(b20);
		
		con.add(p6);
				
		setTitle("계산기 실습");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String s= e.getActionCommand();
		switch(s) {  // 누른 숫자를 누적시키기 위해
		case "0" :
		case "1" :
		case "2" :
		case "3" :
		case "4" :
		case "5" :
		case "6" :
		case "7" :
		case "8" :
		case "9" :
			if(jt.getText().equals("0"))  jt.setText("");  //숫자를 입력하면 0이 지워지고 숫자 입력됨
			jt.setText(jt.getText() + s ); //텍스트 필드에서 값을 얻어옴 - getText() , 그후 setText를 통해 다시 값리턴
			break;
		case "C":
			jt.setText("0");
			break;
		case "+" : 
			num1 =Integer.parseInt( jt.getText());  // 문자를 숫자로 바꿔주는 메소드
			op =1; //op는 문자를 정수로 기억해주는 변수
			jt.setText("0");
			break;
			
		case "-" : 
			num1 =Integer.parseInt( jt.getText());  // 문자를 숫자로 바꿔주는 메소드
			op =2; //op는 문자를 정수로 기억해주는 변수
			jt.setText("0");
			break;
		case "x" : 
			num1 =Integer.parseInt( jt.getText());  // 문자를 숫자로 바꿔주는 메소드
			op =3;
			jt.setText("0");
			break;
		case "÷" : 
			num1 = Integer.parseInt( jt.getText());  // 문자를 숫자로 바꿔주는 메소드
			op =4;
			jt.setText("0");
			break;
			
		case "%" : 
			num1 = Integer.parseInt( jt.getText());  // 문자를 숫자로 바꿔주는 메소드
			op =5;
			jt.setText("0");
			break;
			
		case "=" : 
			num2 =Integer.parseInt( jt.getText());  // 문자를 숫자로 바꿔주는 메소드
			switch(op) { //op는 문자를 정수로 기억해주는 변수
			case 1 :
				result1 = num1 + num2;
				jt.setText(String.valueOf(result1));
				break;
			case 2 :
				result1 = num1 - num2;
				jt.setText(String.valueOf(result1));
				break;
			case 3 :
				result1 = num1 * num2;
				jt.setText(String.valueOf(result1));
				break;
			case 4:
				result2 = num1 /(double) num2;
				jt.setText(String.valueOf(result2));
				break;
			case 5:
				result1 = num1 % num2;
				System.out.println(num1 + " " + op + num2  + result1);
				jt.setText(String.valueOf(result1));
				break;
	      }
			break;
		case "◀" :
			// jt.getText().length() : 텍스트 필드에 있는 글자의 총갯수
			// jt.setText(jt.getText().substring(0,jt.getText().length()-1)));
			// 98765가 있다면 총 글자 갯수 5, 인덱스는 0부터 4번까지 입니다.
			// 이중 9876만 취하고 싶다면, substring에 0,4라고 써야 0번부터 3번글자까지 추출됩니다
			// 그 말은 곧 length() 메서드를 사용했다면 .substring(0, 문자열.length() -1);
			// jt.setText(jt.getText().substring(0,jt.getText().length()-1));
			if(jt.getText().length() ==1) jt.setText("0");
			else {
			String t = jt.getText();
			int n = t.length();
			String str = t.substring(0, n-1);
			jt.setText(str);
			break;
			}
		case "1/x":
			result2 = 1/(double)Integer.parseInt(jt.getText());
			jt.setText(String.valueOf(result2));
			break;

		case "sqr":
			result2 = Math.sqrt(Integer.parseInt(jt.getText()));
			jt.setText(String.valueOf(result2));
			break;
			}
     
		
	}
}
public class Swing19 {

	public static void main(String[] args) {
		new Calculator();

	}

}
