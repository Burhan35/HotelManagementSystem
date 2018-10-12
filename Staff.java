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
public class Staff {
    private int staffid;
    private String name;
    private String surname;
    private Stafftype stafftype;

    public Staff(){
        
    }
    public Staff( int staffid , String name , String surname , Stafftype stafftype){
        this.name = name;
        this.staffid =staffid;
        this.stafftype = stafftype;
        this.surname =surname;
       
                
    }
    
    
    public int getStaffid() {
        return staffid;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Stafftype getStafftype() {
        return stafftype;
    }

    public void setStafftype(Stafftype stafftype) {
        this.stafftype = stafftype;
    }

    @Override
    public String toString() {
        return  staffid + " " + name + " " + surname + " " + stafftype.getStafftypename() ;
    }
    
    
    
    
}
