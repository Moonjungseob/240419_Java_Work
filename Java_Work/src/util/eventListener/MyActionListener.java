package util.eventListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton testBtn = (JButton) event.getSource();
		if(testBtn.getText().equals("test")) {
			testBtn.setText("테스트");
		} else {
			testBtn.setText("test");
		}
		
		
	}

}
