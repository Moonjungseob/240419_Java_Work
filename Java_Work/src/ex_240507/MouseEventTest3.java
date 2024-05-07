package ex_240507;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JLabel;

import util.RandomSelectNumber;
import util.eventListener.MyActionListener;
import util.eventListener.MyMouseListener;
import util.eventListener.MyMouseListener2;

public class MouseEventTest3 extends JFrame {

	public static void setLocationHashMap(HashMap<String, JLabel> hashMap, Container c) {
		Set<String> keys = hashMap.keySet(); // 모든 키를 Set 컬렉션에 받아옴
		Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
		
		while (it.hasNext()) {
			String key = it.next(); // 키
			JLabel jLabel = hashMap.get(key); // 값
			jLabel.setSize(50, 20);
			
			// 랜덤한 정수 가지고 오기. 
			int randomNumber = RandomSelectNumber.selectInt(100);
			jLabel.setLocation(30 + randomNumber , 30 + randomNumber );
			c.add(jLabel);
		}
	}
	
	// 반복되는 메서드, hashMap에서 꺼내서 위치 잡는 부분을 
		public static void setLocationClickedHashMap(HashMap<String, JLabel> hashMap,int x, int y) {
			Set<String> keys = hashMap.keySet(); // 모든 키를 Set 컬렉션에 받아옴
			Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
			
			while (it.hasNext()) {
				String key = it.next(); // 키
				JLabel jLabel = hashMap.get(key); // 값
			
				// 랜덤한 정수 가지고 오기. 
				int randomNumber = RandomSelectNumber.selectInt(300);
//				jLabel.setLocation(30 + randomNumber , 30 + randomNumber );
				jLabel.setLocation(x + randomNumber , y + randomNumber );
			}
		}
	
	public MouseEventTest3(HashMap<String, JLabel> hashMap) {

		setTitle("Mouse 이벤트 예제3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.addMouseListener(
				// 익명 클래스, 슈퍼클래스(부모클래스, 부모 타입의 인터페이스)
				new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent event) {
				int radomNumber = RandomSelectNumber.selectInt(200);
				int radomNumber2 = RandomSelectNumber.selectInt(200);
				int x = event.getX(); // 마우스의 클릭 좌표 x
				int y = event.getY(); // 마우스의 클릭 좌표 y
				setLocationClickedHashMap(hashMap, x, y);
				
				
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
		
		
		setLocationHashMap(hashMap, c);
		
	
		
		
		
		setSize(500, 400);
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
		
		HashMap<String, JLabel> hashMap = new HashMap<String, JLabel>();
		hashMap.put("label1", la );
		hashMap.put("label2", la2);
		hashMap.put("label3", la3);
		hashMap.put("label4", la4);
		hashMap.put("label5", la5);
		
	
		
		MouseEventTest3 mouseEventTest = new MouseEventTest3(hashMap);
		
		

	}

}