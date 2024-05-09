package ex_240509;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextFieldExtest extends JFrame {
	private JTextArea ta = new JTextArea(7, 25);

	public TextFieldExtest() {
		setTitle("회원가입 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel name = new JLabel("이름 ");
		JTextField nameField = new JTextField(25);
		c.add(name);
		c.add(nameField);
		JLabel email = new JLabel("이메일 ");
		JTextField emailField = new JTextField(24);
		c.add(email);
		c.add(emailField);
		JLabel passward = new JLabel("패스워드 ");
		JTextField passwardField = new JTextField(23);
		c.add(passward);
		c.add(passwardField);
		JLabel passwardcheck = new JLabel("패스워드  확인 ");
		JTextField passwardcheckField = new JTextField(20);
		c.add(passwardcheck);
		c.add(passwardcheckField);
		JButton btn = new JButton("회원가입");
		JButton btn2 = new JButton("클리어");
		c.add(btn);
		c.add(btn2);
		c.add(new JScrollPane(ta));
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				JButton testBtn = (JButton) event.getSource();
				if (testBtn.getText().equals("회원가입")) {
					ta.append("회원가입 내역입니다. " + "\n");
					ta.append("이름 : " + nameField.getText() + "\n");
					nameField.setText("");
					ta.append("이메일 : " + emailField.getText() + "\n");
					emailField.setText("");
					ta.append("패스워드 : " + passwardField.getText() + "\n");
					passwardField.setText("");
					passwardcheckField.setText("");
				}
			}
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JButton testBtn = (JButton) event.getSource();
				if (testBtn.getText().equals("클리어")) {
					nameField.setText("");
					emailField.setText("");
					passwardField.setText("");
					passwardcheckField.setText("");
					ta.setText("");
				}
			}
		});
		setSize(370, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextFieldExtest();
	}
}