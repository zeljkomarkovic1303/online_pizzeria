/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zeljk
 */
public class OrderDAO {
    
    public static int createOrder(int userId, double total){
        int orderId = 0;
        try{
            Connection c = DBConnection.getConnection();
            PreparedStatement ps = c.prepareStatement("INSERT INTO orders(user_id, date, total) VALUES (?, NOW(), ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, userId);
            ps.setDouble(2, total);
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) orderId = rs.getInt(1);
        } catch (Exception e){
        e.printStackTrace();
    }
        return orderId;
    }
    
    public static void addItem(int orderId, int pizzaId, int qty, double price){
        try{
            Connection c = DBConnection.getConnection();
            PreparedStatement ps = c.prepareStatement("INSERT INTO order_items(order_id, pizza_id, quantity, price) VALUES(?,?,?,?)");
            ps.setInt(1, orderId);
            ps.setInt(2, pizzaId);
            ps.setInt(3, qty);
            ps.setDouble(4, price);
            ps.executeUpdate();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
   public static List<List<Object>> getAllOrders(){
       List<List<Object>> data = new ArrayList<>();
        
        try{
            Connection c = DBConnection.getConnection();
            String sql = 
                    "SELECT o.id, o.date, o.total, u.username "+
                    "FROM orders o "+
                    "JOIN users u ON o.user_id = u.id "+
                    "ORDER BY o.date DESC";
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                List<Object> row = new ArrayList<>();
                row.add(rs.getInt("id"));
                row.add(rs.getTimestamp("date"));
                row.add(rs.getDouble("total"));
                row.add(rs.getString("username"));
                data.add(row);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return data;
    }
    
    public static ResultSet getOrderItems(int orderId){
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
            "SELECT p.name, oi.quantity, oi.price, (oi.quantity * oi.price) total "+
                    "FROM order_items oi "+
                    "JOIN pizzas p ON oi.pizza_id = p.id "+
                    "WHERE oi.order_id = ?"
            );
            ps.setInt(1, orderId);
            return ps.executeQuery();
            
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
