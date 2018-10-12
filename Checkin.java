/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;

import java.util.Date;

public class Checkin {
    private int checkinid;
   
    private Customer customer;
    private Date dateofarrival;
    private Date dateofdeparture;
    private Room room; 
    private Company company;
    private boolean checkedout;

    public Checkin() {
        
    }
    
    public Checkin(int checkinid, Customer customer,Date dateofarrival, Date dateofdeparture, Room room, Company company,boolean checkedout ) {
        this.checkinid = checkinid;
        this.customer = customer;
        this.dateofarrival = dateofarrival;
        this.dateofdeparture = dateofdeparture;
        this.room = room;
        this.company = company;
        this.checkedout = checkedout;
        
    }
    
        
    public int getCheckinid() {
        return checkinid;
    }

    public void setCheckinid(int checkinid) {
        this.checkinid = checkinid;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDateofarrival() {
        return dateofarrival;
    }

    public void setDateofarrival(Date dateofarrival) {
        this.dateofarrival = dateofarrival;
    }

    public Date getDateofdeparture() {
        return dateofdeparture;
    }

    public void setDateofdeparture(Date dateofdeparture) {
        this.dateofdeparture = dateofdeparture;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public boolean isCheckedout() {
        return checkedout;
    }

    public void setCheckedout(boolean checkedout) {
        this.checkedout = checkedout;
    }

    @Override
    public String toString() {
        String strcheckedout;
        
        if ( checkedout) {
            strcheckedout="Checkedout";
        }
        else {
            strcheckedout="stay in";
        }
        
        return checkinid + "  " + company.getName() + " " + customer.getName() + " " + dateofarrival + " " + dateofdeparture + " " + room.getRoomid() + " "+ room.getRoomtype().getTypename() + " " + strcheckedout;
    }
    
    
    
    
}
