/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;

/**
 *
 * @author Enise Zengin
 */
public class Roomtype {
    private String roomtypeid;
    private String typename;
    private double price;
    
    public Roomtype(){
        
    }
    public Roomtype( String roomtypeid , String typename , double price){
        this.price = price;
        this.roomtypeid = roomtypeid;
        this.typename =typename;
    }
    public String getRoomtypeid() {
        return roomtypeid;
    }

    public void setRoomtypeid(String roomtypeid) {
        this.roomtypeid = roomtypeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  roomtypeid + " " + typename + " " + price ;
    }
    
    
    
    
}
