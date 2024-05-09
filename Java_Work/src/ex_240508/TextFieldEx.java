package ex_240508;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {
	public TextFieldEx() {
		
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
		
		JLabel passwardcheck = new JLabel("패스워드 확인 ");
		JTextField passwardcheckField = new JTextField(21);
		c.add(passwardcheck);
		c.add(passwardcheckField);
			
		JButton btn = new JButton("회원가입");
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				JButton testBtn = (JButton) event.getSource();
				if (testBtn.getText().equals("회원가입")) {
					JLabel singup = new JLabel("회원가입 내역입니다. ");
					JLabel singupname = new JLabel("이름 : " +nameField.getText());
					JLabel singupemail = new JLabel("이메일 : " + emailField.getText());
					JLabel singuppassward = new JLabel("패스워드 : " +passwardField.getText());
					c.add(singup);
					c.add(singupname);
					c.add(singupemail);
					c.add(singuppassward);
				}
			}
		});
		
		
		setSize(370, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextFieldEx();
	}
}