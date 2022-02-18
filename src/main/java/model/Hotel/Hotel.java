/**
 * User: Chittra Kumari
 * Date: 18-02-2022
 * IDE: IntelliJ IDEA
 * File: model.Hotel.Hotel.java
 * JDK: Oracle JDK 17
 */

package model.Hotel;

import model.Customer.Customer;

public sealed abstract class Hotel permits Oyo,Radisson,Taj {
private int rate;
private int rating;

public int getRate(Customer customer){
    return rate;
}
public int rating (){
    return rating;
}
}
