/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;

public class Room {
    
    private int roomid;
    private Roomtype roomtype;
    private boolean airconditioned;
    private boolean empty;
 
    public Room(){
        
    }
    public Room (int roomid , Roomtype roomtype , boolean airconditioned , boolean empty){
        
    }
    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public Roomtype getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(Roomtype roomtype) {
        this.roomtype = roomtype;
    }

    public boolean isAirconditioned() {
        return airconditioned;
    }

    public void setAirconditioned(boolean airconditioned) {
        this.airconditioned = airconditioned;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
     
    
}
