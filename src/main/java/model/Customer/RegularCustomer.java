/**
 * User: Chittra Kumari
 * Date: 18-02-2022
 * IDE: IntelliJ IDEA
 * File: model.Customer.RegularCustomer.java
 * JDK: Oracle JDK 17
 */

package model.Customer;

import model.Hotel.Hotel;
import model.Hotel.Oyo;
import model.Hotel.Radisson;
import model.Hotel.Taj;

import javax.swing.*;

public final class RegularCustomer implements Customer{
    public int bookHotel(Hotel hotel){
        int bookingRate=0;
if(hotel instanceof Oyo){
    bookingRate=hotel.getRate(this);
}
else if(hotel instanceof Radisson){
            bookingRate=hotel.getRate(this);
        }

    else if(hotel instanceof Taj){
        bookingRate=hotel.getRate(this);
    }
        JOptionPane.showConfirmDialog(null,
                "The booking rate for the hotel is ₹" + bookingRate
        );
return bookingRate;

}

}
