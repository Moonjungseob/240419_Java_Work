package util.eventListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton testBtn2 = (JButton) event.getSource();
		if(testBtn2.getText().equals("mini")) {
			testBtn2.setText("미니");
		} else {
			testBtn2.setText("mini");
		}
	}

}