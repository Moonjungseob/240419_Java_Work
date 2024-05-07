package ex_240507;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import util.eventListener.MyActionListener;
import util.eventListener.MyActionListener2;

public class EcentTest2 extends JFrame{
	public EcentTest2() {
	setTitle("Action 이벤트 리스너 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	JButton btn2 = new JButton("mini");
	btn2.addActionListener(new MyActionListener2()); 
	c.add(btn2);
	
	JButton btn = new JButton("test");
	btn.addActionListener(new MyActionListener()); 
	c.add(btn);
	
	setSize(250, 120);
	setVisible(true);
	
	
	}
	public static void main(String [] args) {
		EcentTest2 eventTest1 = new EcentTest2();
	}


	}


