package days19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class JRadioButtonTest extends JFrame implements ActionListener{
	
	JTextField jtf;
	ButtonGroup bg; //그룹을 만드는 이유는 만들지 않으면 복수개 혀용되기 떄문
	JRadioButton jrb1;
	JRadioButton jrb2;
	JRadioButton jrb3;
	JRadioButton jrb4;

	
	JRadioButtonTest(){
		 jrb1 = new JRadioButton("승마");
		 jrb2 = new JRadioButton("골프");
		 jrb3 = new JRadioButton("글라이딩");
		 jrb4 = new JRadioButton("스쿠버");
		 
		 bg = new ButtonGroup();  //그룹안에 넣어줘야 이 중 하나가 선택되어 출력 
		 bg.add(jrb1);
		 bg.add(jrb2);
		 bg.add(jrb3);
		 bg.add(jrb4);
		 
		 jtf = new JTextField(30);
		 
		 Container con = getContentPane();
		 con.setLayout(new FlowLayout());
			
		 con.add(jrb1);
		 con.add(jrb2);
		 con.add(jrb3);
		 con.add(jrb4);
		 con.add(jtf);
			 
		 jrb1.addActionListener(this);
		 jrb2.addActionListener(this);
		 jrb3.addActionListener(this);
		 jrb4.addActionListener(this);
			 
		 setTitle("라디오 박스 실습");
		 setSize(700,100);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(jrb1.isSelected())  // else if를 통해 한가지만 안내함
			jtf.setText(jrb1.getActionCommand() + " 이(가) 선택되었습니다.");
		else if(jrb2.isSelected())
			jtf.setText(jrb2.getActionCommand() + " 이(가) 선택되었습니다.");
		else if(jrb3.isSelected())
			jtf.setText(jrb3.getActionCommand() + " 이(가) 선택되었습니다.");
		else
			jtf.setText(jrb4.getActionCommand() + " 이(가) 선택되었습니다.");
		
			
		
	}
}

public class Swing15 {

	public static void main(String[] args) {
		new JRadioButtonTest();  // 라디오버튼은 하나만선택되고 다른 것을 선택시 이전것이 지워지고 선택한 것이 선택됨

	}

}
