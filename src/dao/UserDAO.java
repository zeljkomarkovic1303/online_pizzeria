/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import util.DBConnection;
import model.User;
import java.sql.*;
/**
 *
 * @author zeljk
 */
public class UserDAO {
    public static User login(String username, String password){
        User user = null;
        
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
            "SELECT * FROM users WHERE username=? AND password=?"
            );
            
            ps.setString(1, username);
            ps.setString(2, password);
            
            ResultSet rs= ps.executeQuery();
            
            if(rs.next()){
                user = new User(
                rs.getInt("id"), rs.getString("username"), rs.getString("password"), rs.getString("role")
                );
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
