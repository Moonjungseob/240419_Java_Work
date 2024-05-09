package mini_project_240509;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class RestaurantGUI extends JFrame {
    private JLabel totalPriceLabel;
    private double totalPrice = 0;
    private JPanel selectedFoodPanel;
    private JPanel menuPanel;
    private Map<String, Integer> countMap = new HashMap<>();
    private String driver = "oracle.jdbc.driver.OracleDriver"; 
    private String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private String userid = "scott";
    private String passwd = "tiger";
    private Connection con = null;

    public RestaurantGUI() {
        setTitle("Java PC방 음식 메뉴 리스트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuPanel = new JPanel(new GridLayout(3, 3));
        addMenuButton(menuPanel, "삼겹살", 10000);
        addMenuButton(menuPanel, "떡볶이", 3000);
        addMenuButton(menuPanel, "햄버거", 5000);
        addMenuButton(menuPanel, "타코야키", 3500);
        addMenuButton(menuPanel, "라면", 4000);
        addMenuButton(menuPanel, "김밥", 3000);
        addMenuButton(menuPanel, "탕수육", 12000);
        addMenuButton(menuPanel, "짬뽕", 9000);
        addMenuButton(menuPanel, "초밥세트", 11000);
        
        totalPriceLabel = new JLabel("총 가격: " + totalPrice);
        JButton paymentButton = new JButton("결제");
        paymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName(driver);
                    con = DriverManager.getConnection(url, userid, passwd);
                    String query = "INSERT INTO menu (id, samcount, dduccount, hamcount, tacocount, ramecount, kimcount, tangcount, jjamcount, chocount, totalPrice) VALUES (menu_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement pstmt = con.prepareStatement(query);
                    
                    pstmt.setInt(1, countMap.getOrDefault("삼겹살", 0));
                    pstmt.setInt(2, countMap.getOrDefault("떡볶이", 0));
                    pstmt.setInt(3, countMap.getOrDefault("햄버거", 0));
                    pstmt.setInt(4, countMap.getOrDefault("타코야키", 0));
                    pstmt.setInt(5, countMap.getOrDefault("라면", 0));
                    pstmt.setInt(6, countMap.getOrDefault("김밥", 0));
                    pstmt.setInt(7, countMap.getOrDefault("탕수육", 0));
                    pstmt.setInt(8, countMap.getOrDefault("짬뽕", 0));
                    pstmt.setInt(9, countMap.getOrDefault("초밥세트", 0));
                    pstmt.setDouble(10, totalPrice);
                    
                    pstmt.executeUpdate();
                    pstmt.close();
                    con.close();
                    JOptionPane.showMessageDialog(null, "결제가 완료되었습니다.");
                    // 결제 후 선택된 음식 목록 초기화
                    selectedFoodPanel.removeAll();
                    selectedFoodPanel.revalidate();
                    selectedFoodPanel.repaint();
                    // 카운트 맵 초기화
                    countMap.clear();
                    // 총 가격 초기화
                    totalPrice = 0;
                    totalPriceLabel.setText("총 가격: " + totalPrice);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "결제에 실패했습니다.");
                }
            }
        });
        
        JButton refundButton = new JButton("환불");
        refundButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(null, "환불할 ID를 입력하세요.");
                if (input != null && !input.isEmpty()) {
                    try {
                        Class.forName(driver);
                        con = DriverManager.getConnection(url, userid, passwd);
                        String query = "DELETE FROM menu WHERE id = ?";
                        PreparedStatement pstmt = con.prepareStatement(query);
                        pstmt.setInt(1, Integer.parseInt(input));
                        int deletedRows = pstmt.executeUpdate();
                        pstmt.close();
                        con.close();
                        if (deletedRows > 0) {
                            JOptionPane.showMessageDialog(null, "환불이 완료되었습니다.");
                        } else {
                            JOptionPane.showMessageDialog(null, "해당 ID에 대한 데이터를 찾을 수 없습니다.");
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "환불에 실패했습니다.");
                    }
                }
            }
        });
        
        JButton salesHistoryButton = new JButton("판매내역 조회");
        salesHistoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	try {
                    Class.forName(driver);
                    con = DriverManager.getConnection(url, userid, passwd);
                    String query = "SELECT id, samcount, dduccount, hamcount, tacocount, ramecount, kimcount, tangcount, jjamcount, chocount, totalPrice FROM menu";
                    PreparedStatement pstmt = con.prepareStatement(query);
                    ResultSet rs = pstmt.executeQuery();

                    StringBuilder history = new StringBuilder();
                    history.append("판매내역:\n");
                    while (rs.next()) {
                        history.append("ID: ").append(rs.getInt("id")).append(", ");
                        history.append("삼겹살: ").append(rs.getInt("samcount")).append(", ");
                        history.append("떡볶이: ").append(rs.getInt("dduccount")).append(", ");
                        history.append("햄버거: ").append(rs.getInt("hamcount")).append(", ");
                        history.append("타코야키: ").append(rs.getInt("tacocount")).append(", ");
                        history.append("라면: ").append(rs.getInt("ramecount")).append(", ");
                        history.append("김밥: ").append(rs.getInt("kimcount")).append(", ");
                        history.append("탕수육: ").append(rs.getInt("tangcount")).append(", ");
                        history.append("짬뽕: ").append(rs.getInt("jjamcount")).append(", ");
                        history.append("초밥세트: ").append(rs.getInt("chocount")).append(", ");
                        history.append("총 가격: ").append(rs.getInt("totalPrice")).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, history.toString());

                    rs.close();
                    pstmt.close();
                    con.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "판매내역 조회에 실패했습니다.");
                }
            }});
        
        JPanel northPanel = new JPanel(new GridLayout(1, 3)); // 1행 2열의 그리드 패널 생성
        northPanel.add(paymentButton);
        northPanel.add(refundButton);
        northPanel.add(salesHistoryButton);
        

        selectedFoodPanel = new JPanel(new GridLayout(0, 1));
        JScrollPane scrollPane = new JScrollPane(selectedFoodPanel);

        JPanel southPanel = new JPanel(new BorderLayout());
        southPanel.add(totalPriceLabel, BorderLayout.NORTH);
        southPanel.add(scrollPane, BorderLayout.CENTER);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(menuPanel, BorderLayout.CENTER);
        container.add(northPanel, BorderLayout.NORTH);
        container.add(southPanel, BorderLayout.SOUTH);

        setSize(600, 600);
        setVisible(true);
    }

    private void addMenuButton(JPanel menuPanel, String name, int price) {
        JButton button = new JButton(name + " (" + price + "원)");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean found = false;
                Component[] components = selectedFoodPanel.getComponents();
                for (Component component : components) {
                    if (component instanceof JLabel) {
                        String labelText = ((JLabel) component).getText();
                        if (labelText.startsWith(name)) {
                            int quantity = Integer.parseInt(labelText.substring(labelText.indexOf(":") + 2));
                            quantity++;
                            ((JLabel) component).setText(name + ": " + quantity);
                            totalPrice += price;
                            totalPriceLabel.setText("총 가격: " + totalPrice);
                            found = true;
                            break;
                        }
                    }
                }
                if (!found) {
                    JLabel selectedFoodLabel = new JLabel(name + ": 1");
                    selectedFoodPanel.add(selectedFoodLabel);
                    totalPrice += price;
                    totalPriceLabel.setText("총 가격: " + totalPrice);
                }
                countMap.put(name, countMap.getOrDefault(name, 0) + 1);
                revalidate();
            }
        });
        menuPanel.add(button);
    }

    public static void main(String[] args) {
        new RestaurantGUI();
    }
}
