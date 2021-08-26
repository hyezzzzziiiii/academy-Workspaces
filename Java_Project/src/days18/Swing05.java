package days18;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class JButtonEvent extends JFrame{
	//엑션리스너를 이용하지 않고 컨트롤 자체에 존재하는 이벤트 메서드를 사용
	JButtonEvent(){
		ImageIcon korea = new ImageIcon("Images/korea1.gif");
		ImageIcon usa = new ImageIcon("Images/usa.gif");
		ImageIcon germany = new ImageIcon("Images/germany.gif");
		JButton eventButton = new JButton(korea); // korea이미지 아이콘으로 버튼 생성
		
		eventButton.setRolloverIcon(usa); //마우스가 올라가면
		eventButton.setPressedIcon(germany);  //마우스가 눌러지면
		
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());  //FlowLayout일렬로 나열 (가로)
		con.add(eventButton);
		
		setTitle("버튼 자체 이벤트 처리 실습");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class Swing05 {

	public static void main(String[] args) {
	    new JButtonEvent();
	}

}
