/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import util.DBConnection;
import model.Pizza;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zeljk
 */
public class PizzaDAO {
    public static List<Pizza> getAll(){
        List<Pizza> list = new ArrayList<>();
        try{
            Connection c = DBConnection.getConnection();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pizzas");
            
            while (rs.next()){
                Pizza p = new Pizza();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setPrice(rs.getDouble("price"));
                list.add(p);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
