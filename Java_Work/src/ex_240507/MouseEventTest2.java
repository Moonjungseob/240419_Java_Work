package ex_240507;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

import util.eventListener.MyActionListener;
import util.eventListener.MyMouseListener;
import util.eventListener.MyMouseListener2;

public class MouseEventTest2 extends JFrame {
//pdf19 정답 코드 복붙. 
	// 코드 확인.

	// 생성자, 
	public MouseEventTest2(JLabel jaJLabel,JLabel jaJLabel2  ) {

		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.addMouseListener(new MyMouseListener(jaJLabel));
		c.addMouseListener(new MyMouseListener2(jaJLabel2));
		c.setLayout(null);
		jaJLabel.setSize(50, 20); // 레이블의 크기 50x20 설정
		jaJLabel.setLocation(30, 30); // 레이블의 위치 (30,30)으로 설정
		jaJLabel2.setSize(50, 20); // 레이블의 크기 50x20 설정
		jaJLabel2.setLocation(130, 130); // 레이블의 위치 (30,30)으로 설정
		c.add(jaJLabel);
		c.add(jaJLabel2);
		
		setSize(200, 200);
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		// 인스턴스 생성시, 라벨 여기서 추가할 예정. 
		// 인스턴스 멤버, 
		JLabel la = new JLabel("Hello"); // "Hello" 레이블
		JLabel la2 = new JLabel("햄버거"); // "Hello" 레이블
		MouseEventTest2 mouseEventTest = new MouseEventTest2(la, la2);
		
		

	}

}