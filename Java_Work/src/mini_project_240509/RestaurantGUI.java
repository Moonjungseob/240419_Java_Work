package mini_project_240509;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RestaurantGUI extends JFrame {
    private JLabel totalPriceLabel;
    private double totalPrice = 0;
    private JPanel selectedFoodPanel;
    private JPanel menuPanel;

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
                totalPrice = 0;
                totalPriceLabel.setText("총 가격: " + totalPrice);
                JOptionPane.showMessageDialog(null, "결제가 완료되었습니다.");
            }
        });

        selectedFoodPanel = new JPanel(new GridLayout(0, 1));
        JScrollPane scrollPane = new JScrollPane(selectedFoodPanel);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(menuPanel, BorderLayout.CENTER);
        container.add(totalPriceLabel, BorderLayout.SOUTH);
        container.add(paymentButton, BorderLayout.NORTH);
        container.add(scrollPane, BorderLayout.SOUTH);

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
                revalidate();
            }
        });
        menuPanel.add(button);
    }

    public static void main(String[] args) {
        new RestaurantGUI();
    }
}
