/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author zeljk
 */
public class DBConnection {
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/picerija",
            "picerija_user",
            "tajni123"
            );
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
