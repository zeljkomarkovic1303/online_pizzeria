/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zeljk
 */
public class OrderItem {
    
    private int id;
    private int orderId;
    private int pizzaId;
    private int quantity;
    private double price;
    
    public OrderItem() {}
    
    public OrderItem(int id, int orderId, int pizzaId, int quantity, double price){
        this.id=id;
        this.orderId=orderId;
        this.pizzaId=pizzaId;
        this.quantity=quantity;
        this.price=price;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getOrderId(){
        return orderId;
    }
    public void setOrderId(int orderId){
        this.orderId=orderId;
    }
    public int getPizzaId(){
        return pizzaId;
    }
    public void setPizzaId(int pizzaId){
        this.pizzaId=pizzaId;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    
    public double getSubtotal(){
        return quantity*price;
    }
}
