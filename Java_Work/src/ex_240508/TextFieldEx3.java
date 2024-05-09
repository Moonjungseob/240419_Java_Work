package ex_240508;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextFieldEx3 extends JFrame {
	private JTextArea ta = new JTextArea(7, 25);
	String driver = "oracle.jdbc.driver.OracleDriver"; // 12행 ~ 15행 데이터베이스 접속을 위한 4가지 정보를 String 변수에 저장.
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String passwd = "tiger";
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public TextFieldEx3() {
		setTitle("회원가입 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel idLabel = new JLabel("ID ");
		JTextField idField = new JTextField(23);
		c.add(idLabel);
		c.add(idField);
		JButton searchButton = new JButton("검색");
		c.add(searchButton);
		
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
		JButton btn2 = new JButton("조회");
		JButton btn3 = new JButton("수정");
		JButton btn4 = new JButton("삭제");
		c.add(btn);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(new JScrollPane(ta));
		
		searchButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		        // 검색 버튼을 눌렀을 때 실행되는 코드
		        try {
		            Class.forName(driver);
		            con = DriverManager.getConnection(url, userid, passwd);
		            String query = "SELECT name, email, password FROM member501 WHERE id = ?";
		            pstmt = con.prepareStatement(query);
		            pstmt.setString(1, idField.getText());
		            rs = pstmt.executeQuery();
		            if (rs.next()) {
		                // 해당 ID에 대한 데이터가 있을 경우 텍스트 필드에 출력
		                nameField.setText(rs.getString("name"));
		                emailField.setText(rs.getString("email"));
		                passwardField.setText(rs.getString("password"));
		            } else {
		                // 해당 ID에 대한 데이터가 없을 경우 메시지 출력
		                JOptionPane.showMessageDialog(null, "해당 ID에 대한 데이터를 찾을 수 없습니다.");
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            try {
		                if (rs != null)
		                    rs.close();
		                if (pstmt != null)
		                    pstmt.close();
		                if (con != null)
		                    con.close();
		            } catch (SQLException e) {
		                e.printStackTrace();
		            }
		        }
		    }
		});
		
		
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				JButton testBtn = (JButton) event.getSource();
				if (testBtn.getText().equals("회원가입")) {
					try {
						Class.forName(driver);
						con = DriverManager.getConnection(url, userid, passwd);
						String sql = "INSERT INTO member501(id, name,email,password)"
								+ "VALUES(sequence501.nextval,?,?,?)";
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1, nameField.getText());
						pstmt.setString(2, emailField.getText());
						pstmt.setString(3, passwardField.getText());
						int n = pstmt.executeUpdate();
						System.out.println("회원가입이 되었습니다.");
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						try {
							if (pstmt != null)
								pstmt.close();
							if (con != null)
								con.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					nameField.setText("");
					emailField.setText("");
					passwardField.setText("");
					passwardcheckField.setText("");
				}
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				JButton testBtn = (JButton) event.getSource();
				if (testBtn.getText().equals("조회")) {
					ta.setText("");
					try {
						Class.forName(driver);
						con = DriverManager.getConnection(url, userid, passwd);
						String query = "SELECT id,name, email, password FROM member501";
						pstmt = con.prepareStatement(query);
						rs = pstmt.executeQuery();
						while (rs.next()) {
							int id = rs.getInt("id");
							String name1 = rs.getString("name");
							String email1 = rs.getString("email");
							String password1 = rs.getString("password");
							ta.append("회원을 조회합니다." + "\n");
							ta.append("id : " + id + "\n");
							ta.append("이름 : " + name1 + "\n");
							ta.append("이메일 : " + email1 + "\n");
							ta.append("패스워드 : " + password1 + "\n");
						}
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						try {
							if (pstmt != null)
								pstmt.close();
							if (con != null)
								con.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				JButton testBtn = (JButton) event.getSource();
				if (testBtn.getText().equals("수정")) {
					try {
						Class.forName(driver);
						con = DriverManager.getConnection(url, userid, passwd);
						String query = "UpDATE member501 SET name =?, email=?, password=? WHERE id =? ";
						pstmt = con.prepareStatement(query);
						pstmt.setString(1, nameField.getText());
						pstmt.setString(2, emailField.getText());
						pstmt.setString(3, passwardField.getText());
						pstmt.setString(4, idField.getText());
						int n = pstmt.executeUpdate();
						System.out.println(idField.getText() + "회원이 수정되었습니다.");

					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						try {
							if (pstmt != null)
								pstmt.close();
							if (con != null)
								con.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				JButton testBtn = (JButton) event.getSource();
				if (testBtn.getText().equals("삭제")) {
					try {
						Class.forName(driver);
						con = DriverManager.getConnection(url, userid, passwd);
						String sql = "DELETE  FROM member501 WHERE id = ?";
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1,  idField.getText());
						int n = pstmt.executeUpdate();
						System.out.println(idField.getText() + "회원이 삭제되었습니다.");

					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						try {
							if (pstmt != null)
								pstmt.close();
							if (con != null)
								con.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}

				}

			}
		});

	

	

	setSize(370,350);setVisible(true);}

	public static void main(String[] args) {
		new TextFieldEx3();

	}

}
