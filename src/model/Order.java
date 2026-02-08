/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author zeljk
 */
public class Order {
    private int id;
    private Date date;
    private double total;
    private int userId;
    
    public Order(){}
    
    public Order(int id, Date date, double total, int userId){
        this.id=id;
        this.date=date;
        this.total=total;
        this.userId=userId;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date=date;
    }
    public double getTotal(){
        return total;
    }
    public void setTotal(double total){
        this.total=total;
    }
    public int getUserId(){
        return userId;
    }
    public void setUserId(int userId){
        this.userId=userId;
    }
}
