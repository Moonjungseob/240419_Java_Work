package ex_240508;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import util.eventListener.MyItemListener;

public class CheckBoxItemEventExTest extends JFrame {
	
	public CheckBoxItemEventExTest(JCheckBox[] JCeckbox, String[] string, JLabel sumLabel) {
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("냉라면 10000원, 초밥 9000원, 밀면 8000원"));
		sumLabel = new JLabel("현재 0 원 입니다.");
	
		MyItemListener listener = new MyItemListener(JCeckbox, string, sumLabel );
		for (int i = 0; i < JCeckbox.length; i++) {
			JCeckbox[i] = new JCheckBox(string[i]);
			JCeckbox[i].setBorderPainted(true);
			c.add(JCeckbox[i]);
			JCeckbox[i].addItemListener(listener);
		}
		c.add(sumLabel);
		setSize(250, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		JCheckBox[] fruits = new JCheckBox[3];
		String[] names = { "냉라면", "초밥", "밀면" };
		JLabel sumLabel = new JLabel();
		CheckBoxItemEventExTest checboxitemeventextest 
		= new CheckBoxItemEventExTest(fruits, names, sumLabel);
	}
}