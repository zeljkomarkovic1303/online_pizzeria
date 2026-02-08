/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;

import dao.UserDAO;
import model.User;

import javax.swing.*;

/**
 *
 * @author zeljk
 */
public class LoginForm extends JFrame{
    
    JTextField txtUser = new JTextField();
    JPasswordField txtPass = new JPasswordField();
    JButton btnLogin = new JButton("Login");
    
    public static User loggedUser;
    
    public LoginForm(){
        setTitle("Login");
        setSize(300,200);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new java.awt.Color(242,235,216));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(new JLabel("Username")).setBounds(20,30,80,25);
        add(txtUser).setBounds(110,30,150,25);
        
        add(new JLabel("Password")).setBounds(20,70,80,25);
        add(txtPass).setBounds(110,70,150,25);
        
        add(btnLogin).setBounds(90,120,100,30);
        
        btnLogin.addActionListener(e -> login());
     
    }
    
    void login(){
        String u = txtUser.getText();
        String p = new String(txtPass.getPassword());
        
        User user = UserDAO.login(u, p);
        
        if (user == null) {
            JOptionPane.showMessageDialog(this, "Pogrijesan login!");
            return;
        }
        
        loggedUser=user;
        
        if(user.getRole().equals("ADMIN")){
            new MainForm(user.getRole()).setVisible(true);
        } else{
            new OrderForm().setVisible(true);
        }
        
        dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new LoginForm().setVisible(true);
    }
    
}
