package days20;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Calendars extends JFrame implements ActionListener{
	JTextField y;
	JComboBox <String>m;
	int year = 0;
	int month = 0;
	JTextField[] jt = new JTextField[42]; // 레퍼런스 변수 42개 생성	
	private char[] k;
	//배열 생성시 []기호 주의
	
	Calendars(){
		 Container con = getContentPane();
		 con.setLayout(new BorderLayout());
		 
		 JPanel jp1 = new JPanel();
		 JPanel jp2 = new JPanel();
		 JPanel jp3 = new JPanel();
		 Font f = new Font("굴림", Font.BOLD,20);
		 
		 // jp1 설정 ----------------------------------------------------------
		 jp1.setLayout(new GridLayout(1,7));
		 
		 jp1.add(new JButton("일")).setForeground(Color.RED);
		 jp1.add(new JButton("월"));
		 jp1.add(new JButton("화"));
		 jp1.add(new JButton("수"));
		 jp1.add(new JButton("목"));
		 jp1.add(new JButton("금"));
		 jp1.add(new JButton("토")).setForeground(Color.BLUE);
		 
		// jp2 설정 ----------------------------------------------------------
		 jp2.setLayout(new GridLayout(6,7));
		 for(int i = 0; i<jt.length; i++) {
		     jt[i] = new JTextField();
			 jt[i].setFont(f);
			 jt[i].setHorizontalAlignment(SwingConstants.RIGHT);//오른쪽정렬
			 jt[i].setEditable(false); // 임의 편집 금지
			 jt[i].setBackground(Color.white); // 배경색 흰샛
			 jp2.add(jt[i]); // 패널에 적재
			 if(i%7 == 6) jt[i].setForeground(Color.blue);  //토요일 파란색글자
			 else if (i%7 ==0) jt[i].setForeground(Color.red);  // 일요일 빨간색 글자
			 else jt[i].setForeground(Color.BLACK);  //평일 검은색 글자
		 }
		// jp3 설정 ----------------------------------------------------------
		 jp3.setLayout(new FlowLayout());
		 y = new JTextField(8);
		 y.setFont(f);
		 y.setHorizontalAlignment(SwingConstants.CENTER);  //텍스트 내용 가운데 정렬
		 
		 m = new JComboBox<String>();
		 // 반복실행문을 이용하여 콤보상자에 1월부터 12월까지의 항목을 i값으로 추가
		 for(int i = 1; i <= 12; i++ ) m.addItem(String.valueOf(i));
		 m.setFont(f);
		 
		 JButton b = new JButton("확인");
		 JButton b1 = new JButton("이전달");
		 JButton b2 = new JButton("다음달");
		 
		 jp3.add(b1);
		 jp3.add(y);
		 jp3.add(new JLabel("년 "));
		 jp3.add(m);
		 jp3.add(new JLabel("월 "));
		 jp3.add(b);
		 jp3.add(b2);		 
		 
		 Calendar today = Calendar.getInstance(); // 싱글턴
		 y.setText( String.valueOf(today.get(Calendar.YEAR) ) );
		 m.setSelectedIndex( today.get(Calendar.MONTH) );		 
		 
		 b.addActionListener(this);  //레퍼런스 변수. 메서드(); 형태
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 
		 // 컨테이너 패널 적재 -------------------------------------------------
		 con.add(jp1, BorderLayout.NORTH);
		 con.add(jp2, BorderLayout.CENTER);
		 con.add(jp3, BorderLayout.SOUTH);
		
		 //윈도우 화면 표시 ----------------------------------------------------
		 setTitle("스윙 캘린터");
		 setSize(500,500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
		 // 현재 오늘 달력 출력
		  year = Integer.parseInt(y.getText());
		  month = Integer.parseInt((String)m.getSelectedItem());
		  drawCalendar();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		Calendar temp = Calendar.getInstance();
		temp.set(year, month-1,1); //현재 년도와 월, 1일자로 날짜 세팅
		switch(s) {
		case "확인":  //y와 m에서 년월을 얻어서 year변수와 month변수를 세팅
			year = Integer.parseInt(y.getText());
			month = Integer.parseInt((String)m.getSelectedItem());
			break;
		case "이전달":  // 현재 년월의 이전달로 세팅
				temp.add(Calendar.MONTH, -1);  //-1개월 연산
				year = temp.get(Calendar.YEAR); // get 메서드로 년도와 월 추출
				month = temp.get(Calendar.MONTH) +1;	
				y.setText(String.valueOf(year));  //택스트 상자에 이전달 년도 세트
				m.setSelectedIndex(month -1);  //콤보상자에 이전달 월 세트
			break;
		case "다음달":  // 현재 년월의 다음달로 세팅
			temp.add(Calendar.MONTH, 1);  
			year = temp.get(Calendar.YEAR); // get 메서드로 년도와 월 추출
			month = temp.get(Calendar.MONTH) +1;		
			y.setText(String.valueOf(year)); 
			m.setSelectedIndex(month-1);
			break;
		}
		drawCalendar();
	}
	public void drawCalendar() {
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		sDay.set(year, month-1, 1);  //년, 월, 1일 날짜 세팅
		eDay.set(year, month,1);
		eDay.add(Calendar.DATE,-1);   //년, 월, 1일 날짜 세팅
		int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK); // 1일 날짜 요일 계산
		int i ; 
		
		for(i = 0; i<42; i++) jt[i].setText("");  //비우고 시작하기 위하여
		for( i = 1;  i < START_WEEK; i++) 
			jt[i-1].setText("");
		i--;
        for(int k = 1; k<= eDay.get(Calendar.DATE); k++);
            jt[i].setText(String.valueOf(k));
            i++;
	}
}
public class Swing_Calendar {

	public static void main(String[] args) {
	     new Calendars();

	}

}
