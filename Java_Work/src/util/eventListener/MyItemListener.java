package util.eventListener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class MyItemListener implements ItemListener {
	private JCheckBox[] JCeckbox;
	private String[] string;
	private JLabel Label;

	private int sum = 0; // 가격의 합

public MyItemListener (JCheckBox[] JCeckbox, String [] string, JLabel Label) {
	this.JCeckbox = JCeckbox;
	this.string = string;
	this.Label = Label;
}
	public void itemStateChanged(ItemEvent event) {

		if (event.getStateChange() == ItemEvent.SELECTED) {
			if (event.getItem() == JCeckbox[0])
				sum += 10000;
			else if (event.getItem() == JCeckbox[1])
				sum += 9000;
			else
				sum += 8000;
		} else {
			if (event.getItem() == JCeckbox[0])
				sum -= 10000;
			else if (event.getItem() == JCeckbox[1])
				sum -= 9000;
			else
				sum -= 8000;
		}
		Label.setText("현재 " + sum + "원 입니다.");

	}
}
