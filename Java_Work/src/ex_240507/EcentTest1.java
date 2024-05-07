package ex_240507;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import util.eventListener.MyActionListener;
import util.eventListener.MyActionListener2;

public class EcentTest1 extends JFrame {
	public EcentTest1() {
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

		JButton btn3 = new JButton("new test");
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {

				JButton testBtn = (JButton) event.getSource();

				if (testBtn.getText().equals("new test")) {
					testBtn.setText("새 테스트");
				} else if (testBtn.getText().equals("새 테스트")) {
					testBtn.setText("new test");
				}
			}

		});

		c.add(btn3);

		setSize(250, 120);
		setVisible(true);
	}

	public static void main(String[] args) {
		EcentTest1 eventTest1 = new EcentTest1();
	}
}
