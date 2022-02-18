/**
 * User: Chittra Kumari
 * Date: 18-02-2022
 * IDE: IntelliJ IDEA
 * File: main.Main.java
 * JDK: Oracle JDK 17
 */

package main;

import model.Customer.RegularCustomer;
import model.Hotel.Taj;

public class Main {
    public static void main(String[] args) {
        RegularCustomer object=new RegularCustomer();
        Taj obj=new Taj();
        object.bookHotel(obj);
    }
}
