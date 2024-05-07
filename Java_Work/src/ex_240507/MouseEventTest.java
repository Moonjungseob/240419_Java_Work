package ex_240507;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JLabel;

import util.RandomSelectNumber;
import util.eventListener.MyActionListener;
import util.eventListener.MyMouseListener;
import util.eventListener.MyMouseListener2;

public class MouseEventTest extends JFrame {

	public static void setLocationArraylist(ArrayList<JLabel> intArrayList, Container c) {
		Iterator<JLabel> iterator = intArrayList.iterator();
		while (iterator.hasNext()) {
			JLabel integer = (JLabel) iterator.next();
			integer.setSize(50, 20);	
			
			// 랜덤한 정수 가지고 오기. 
			int randomNumber = RandomSelectNumber.selectInt(100);
			integer.setLocation(30 + randomNumber , 30 + randomNumber );
			c.add(integer);
		}
	}
	
	// 반복되는 메서드, hashMap에서 꺼내서 위치 잡는 부분을 
		public static void setLocationClickedArraylist(ArrayList<JLabel> intArrayList,int x, int y) {
			Iterator<JLabel> iterator = intArrayList.iterator();
			while (iterator.hasNext()) {
				// 1행의 요소를 가지고 온다.
				JLabel integer = (JLabel) iterator.next();
			
				// 랜덤한 정수 가지고 오기. 
				int randomNumber = RandomSelectNumber.selectInt(300);
//				jLabel.setLocation(30 + randomNumber , 30 + randomNumber );
				integer.setLocation(x + randomNumber , y + randomNumber );
			}
		
}
		public MouseEventTest(ArrayList<JLabel> intArrayList) {
			
			setTitle("Mouse 이벤트 예제2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent event) {
				int x = event.getX(); // 마우스의 클릭 좌표 x
				int y = event.getY(); // 마우스의 클릭 좌표 y
				setLocationClickedArraylist(intArrayList, x, y);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		
		}
				);
		
		setLocationArraylist(intArrayList, c);
			
		
		setSize(200, 200);
		setVisible(true);
	}


	public static void main(String[] args) {
		// 인스턴스 생성시, 라벨 여기서 추가할 예정. 
		// 인스턴스 멤버, 
	
		JLabel la = new JLabel("Hello"); // "Hello" 레이블
		JLabel la2 = new JLabel("햄버거"); // "Hello" 레이블
		JLabel la3 = new JLabel("치즈버거"); // "Hello" 레이블
		JLabel la4 = new JLabel("불고기버거"); // "Hello" 레이블
		JLabel la5 = new JLabel("더블버거"); // "Hello" 레이블
		ArrayList<JLabel> intArrayList = new ArrayList<JLabel>();
		intArrayList.add(la);
		intArrayList.add(la2);
		intArrayList.add(la3);
		intArrayList.add(la4);
		intArrayList.add(la5);

		
		MouseEventTest mouseEventTest = new MouseEventTest(intArrayList);
		
		

	}

}