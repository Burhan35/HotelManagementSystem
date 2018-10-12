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
public class Company {
    private int companyid;
    private String name;
    private String address;
    private String phonenumber;

    public Company(){
        //kurucu metod.nesne ılk yaratılırken calışır
    }
  
    public Company(int companyid , String name , String address , String phonenumber){
        this.companyid=companyid;
        this.name =name;
        this.address = address;
        this.phonenumber =phonenumber;
        
        
    }
    
    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return companyid + " " + name + " " + address + " " + phonenumber ;
    }
    
    
    
}
