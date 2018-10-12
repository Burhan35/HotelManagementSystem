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
public class Stafftype {
    private int stafftypeid;
    private String stafftypename;
    
    public Stafftype(){
        
    }
    public Stafftype( int stafftypeid , String stafftypename){
        this.stafftypeid = stafftypeid;
        this.stafftypename = stafftypename;
        
    } 

    public int getStafftypeid() {
        return stafftypeid;
    }

    public void setStafftypeid(int stafftypeid) {
        this.stafftypeid = stafftypeid;
    }

    public String getStafftypename() {
        return stafftypename;
    }

    public void setStafftypename(String stafftypename) {
        this.stafftypename = stafftypename;
    }

    @Override
    public String toString() {
        return  stafftypeid + " " + stafftypename ;
    }
    
    
    
}
