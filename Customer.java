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
public class Customer {
    private int customerid;
    private String name;
    private String phonenumber;
    private String contactaddress;
    
    
    public Customer(){
        
    }
    public Customer(int customerid ,String name , String phonenumber , String contactaddress){
        this.customerid = customerid;
        this.name=name;
        this.phonenumber=phonenumber;
        this.contactaddress=contactaddress;
        
        
                
        
    }
    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getContactaddress() {
        return contactaddress;
    }

    public void setContactaddress(String contactaddress) {
        this.contactaddress = contactaddress;
    }

    

   
    @Override
    public String toString() {
        return  String.format("%3d", customerid) + "  " + 
                String.format("%15s", name) + " " +
                String.format("%15s", phonenumber) + " " + 
                String.format("%20s", contactaddress) ;
    }
    
    
}
