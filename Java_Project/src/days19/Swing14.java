package days19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JCheckBoxTest extends JFrame implements ItemListener{
	
	JTextField jtf;   //오버라이드된 메소드에서도 변수 사용하기 위하여 생성자 밖에 선언
	JCheckBox jcb1;
	JCheckBox jcb2;
	JCheckBox jcb3;
	JCheckBox jcb4;
	
	JCheckBoxTest(){
		jcb1 = new JCheckBox("JSP");
		jcb2 = new JCheckBox("PHP");
		jcb3 = new JCheckBox("ASP");
		jcb4 = new JCheckBox("SEREVLET");
		jtf = new JTextField(30);  //큰 따옴표 붙이지 말것!!
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		jcb1.addItemListener(this);
		jcb2.addItemListener(this);
		jcb3.addItemListener(this);
		jcb4.addItemListener(this);
		

		con.add(jcb1);
		con.add(jcb2);
		con.add(jcb3);
		con.add(jcb4);
		con.add(jtf);
		
		setTitle("체크박스 실습");
		setSize(800,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String s = "";
		if(jcb1.isSelected()) s= s+ "JSP ";  //if문에 맞는 값만 setText에 나타날 것임
		if(jcb2.isSelected()) s= s + jcb2.getActionCommand() + " ";
		if(jcb3.isSelected()) s= s+"ASP"; 
		if(jcb4.isSelected()) s= s + jcb4.getActionCommand() + " ";
		jtf.setText("현재 선택항목 : " + s);
		
	}
}
public class Swing14 {

	public static void main(String[] args) {
		new JCheckBoxTest();

	}

}
