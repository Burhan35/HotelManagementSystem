/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enise Zengin
 */
public class Hotel {

    private Roomtype[] roomtypes = new Roomtype[3];
    private Room[] rooms = new Room[8];
    private Stafftype[] stafftypes = new Stafftype[4];
    private Staff[] staffs = new Staff[7];
    private Company[] companies = new Company[3];
    private ArrayList<Customer> customers = new ArrayList<>();//herbir elemanı customer olan bir liste
    private ArrayList<Checkin> checkins = new ArrayList<>();//herbir elemanı Checkin olan bir liste
    private int lastcustomerid = 0;
    private int lastcheckinid = 0;

    public Hotel() {
        initialData(); //cağırıyorsun

    }

    public void initialData() {
        //roomtypes defined
        roomtypes[0] = new Roomtype("reg", "regular", 90);
        roomtypes[1] = new Roomtype("delx", "deluxe", 120);
        roomtypes[2] = new Roomtype("suit", "suite", 120);
        //rooms defined
        rooms[0] = new Room(1, roomtypes[0], true, true);
        rooms[1] = new Room(2, roomtypes[1], true, true);
        rooms[2] = new Room(3, roomtypes[2], false, true);
        rooms[3] = new Room(4, roomtypes[0], true, true);
        rooms[4] = new Room(5, roomtypes[1], false, true);
        rooms[5] = new Room(6, roomtypes[2], true, true);
        rooms[6] = new Room(7, roomtypes[0], false, true);
        rooms[7] = new Room(8, roomtypes[1], true, true);

        stafftypes[0] = new Stafftype(1, "receptionist");
        stafftypes[1] = new Stafftype(1, "housekeeper");
        stafftypes[2] = new Stafftype(1, "chef");
        stafftypes[3] = new Stafftype(1, "employee");

        staffs[0] = new Staff(1, "ali", "Zengin", stafftypes[0]);
        staffs[1] = new Staff(2, "deniz", "tunc", stafftypes[0]);
        staffs[2] = new Staff(3, "berat", "kızıl", stafftypes[1]);
        staffs[3] = new Staff(4, "hasan", "aslan", stafftypes[1]);
        staffs[4] = new Staff(5, "ahmet", "Zengin", stafftypes[2]);
        staffs[5] = new Staff(6, "özge", "aslan", stafftypes[3]);
        staffs[6] = new Staff(7, "merve", "arslan", stafftypes[3]);

        companies[0] = new Company(1, "Turkcell", "Ankara", "5373243592");
        companies[1] = new Company(2, "Avea", "İzmir", "5553643551");
        companies[2] = new Company(3, "Bimcell", "Konya", "5477843550");
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        String c;
        while (true) {
            System.out.println("       MENU");
            System.out.println("1. Add a Customer and List");
            System.out.println("2. Check in and List");
            System.out.println("3. Check out and List");
            System.out.println("9.Çıkış");

            System.out.print("Choice: ");
            c = sc.next(); //klavyenın buffer ı boş ise veri girişi için bekler.
            if (c.equals("1")) {
                //add customer
                addCustomer();

            } else if (c.equals("2")) {
                //checkin
                checkin();
            } else if (c.equals("3")) {
                //checkout
                checkout();
            } else if (c.equals("9")) {
                //exit
                break;
            } else {
                System.out.println("Invalid choice!");
            }

        }

    }

    public void addCustomer() {

        String name;
        String address;
        String phonenumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("name: ");
        name = sc.nextLine();
        System.out.print("address: ");
        address = sc.nextLine();
        System.out.print("phone number: ");
        phonenumber = sc.nextLine();

        lastcustomerid++;
        Customer customer = new Customer(lastcustomerid, name, phonenumber, address);
        customers.add(customer);

        listCustomers();

    }

    public void listCustomers() {
        // formatli veri yazımı
        System.out.println(String.format("%3s", "Customer id") + "  "
                + String.format("%15s", "name") + " "
                + String.format("%15s", "phonenumber") + " "
                + String.format("%20s", "contactaddress"));

        for (Customer c : customers) {
            System.out.println(c);
        }

    }

    public Customer getCustomer(int customerid) {
        for (Customer c : customers) {
            if (c.getCustomerid() == customerid) {
                return c;
            }
        }
        return null;
    }

    public void listCheckinCheckouts() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        
        System.out.println("Current customers staying at the hotel now");
        System.out.println("Customer ID Room ID  Date of arrival  Date of Departure");
        for (Checkin cc : checkins) {
            if (!cc.isCheckedout()) {
                System.out.println(cc.getCustomer().getCustomerid() + " "
                        + cc.getRoom().getRoomid() + " "
                        + df.format(cc.getDateofarrival()) + " "
                        + df.format(cc.getDateofdeparture()));
            }
        }
        System.out.println();
        System.out.println("Customers staying at the hotel before");
        System.out.println("ID  COMPANY CUSTOMER  ARRIVAL DATE   DEPARTURE DATE  ROOM ID   ROOMTYPE  CHECKOUT");
        for (Checkin cc : checkins) {
            if (cc.isCheckedout()) {
                System.out.println(cc.getCustomer().getCustomerid() + " "
                        + cc.getRoom().getRoomid() + " "
                        + df.format(cc.getDateofarrival()) + " "
                        + df.format(cc.getDateofdeparture()));

            }
        }

    }

    public void checkin() {
        Scanner sc = new Scanner(System.in);

        int roomid;
        String arrivaldate;
        String departuredate;
        int customerid;
        int companyid = 0;
        Company company = null;

        String c;

        System.out.println("Enter Staying details");
        System.out.print("Customer id    : ");
        customerid = sc.nextInt();

        System.out.print("Arrival Date   : ");
        arrivaldate = sc.next();

        System.out.print("Departure Date : ");
        departuredate = sc.next();

        System.out.print("Room Id        :");
        roomid = sc.nextInt();

        System.out.print("Is Customer Sponsored (Y/N) ? ");
        c = sc.next();
        if (c.equals("Y") || c.equals("Y")) {
            System.out.print("Company id     : ");
            companyid = sc.nextInt();
        }
        lastcheckinid++;

        Checkin checkin = new Checkin();

        checkin.setCheckinid(lastcheckinid);
        checkin.setCustomer(getCustomer(customerid));

        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

        try {
            checkin.setDateofarrival(df.parse(arrivaldate));
            checkin.setDateofdeparture(df.parse(departuredate));
        } catch (ParseException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }

        checkin.setRoom(rooms[roomid - 1]);
        if (companyid > 0) {
            checkin.setCompany(companies[companyid - 1]);
        }

        checkins.add(checkin);
        listCheckinCheckouts();

//           private int checkinid;
//    private Company company;
//    private Customer customer;
//    private Date dateofarrival;
//    private Date dateofdeparture;
//    private Room room;
//    private boolean checkedout;
    }

    public void checkout() {
        Scanner sc = new Scanner(System.in);

        int customerid;

        System.out.println("Enter the customer Id you want to checkout : ");
        customerid = sc.nextInt();

        Customer customer = getCustomer(customerid);

        System.out.println("custormer info");
        System.out.println(customer);

        System.out.print("Is this correct customer  (Y/N) ? ");
        String c = sc.next();

        if (!(c.equals("Y") || c.equals("y"))) {
            //quiting from checkout
            return;
        }
        Checkin checkinfound=null;
        for (Checkin checkin : checkins) {
            if (checkin.getCustomer().getCustomerid() == customerid) {
                checkinfound = checkin;
                checkin.setCheckedout(true);
                break;
            }
        }
        
        listCheckinCheckouts();
        

    }

}
