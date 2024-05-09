package ex_240508;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame {
	public MenuEx() {
		setTitle("Menu 만들기 예제");
		createMenu(); // 메뉴 생성, 프레임에 삽입
		setSize(250, 200);
		setVisible(true);
	}

	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("Exit"));
		mb.add(screenMenu);
		
		JMenu screenMenu2 = new JMenu("Edit");
		screenMenu2.add(new JMenuItem("중국집"));
		screenMenu2.add(new JMenuItem("고기집"));
		mb.add(screenMenu2);
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new MenuEx();
	}
}
