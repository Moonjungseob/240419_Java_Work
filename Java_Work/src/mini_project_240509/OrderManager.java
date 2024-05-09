package mini_project_240509;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderManager {
    public static void placeOrder(String itemName, double price) {
        try (Connection con = DBUtil.getConnection();
             PreparedStatement pstmt = con.prepareStatement("INSERT INTO orders (item_name, price) VALUES (?, ?)")) {
            pstmt.setString(1, itemName);
            pstmt.setDouble(2, price);
            pstmt.executeUpdate();
            System.out.println("주문이 완료되었습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void refundOrder(String itemName) {
        try (Connection con = DBUtil.getConnection();
             PreparedStatement pstmt = con.prepareStatement("DELETE FROM orders WHERE item_name = ?")) {
            pstmt.setString(1, itemName);
            pstmt.executeUpdate();
            System.out.println("환불이 완료되었습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}