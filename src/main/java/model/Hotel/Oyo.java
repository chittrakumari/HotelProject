/**
 * User: Chittra Kumari
 * Date: 18-02-2022
 * IDE: IntelliJ IDEA
 * File: model.Hotel.Oyo.java
 * JDK: Oracle JDK 17
 */

package model.Hotel;

import model.Customer.Customer;
import model.Customer.RegularCustomer;
import model.Customer.RewardCustomer;

import java.time.LocalDate;

public final class Oyo extends Hotel{

    public int getRate(Customer customer) {
        if (customer instanceof RegularCustomer) {
            if (LocalDate.now().getDayOfWeek().name().equals("Saturday") || LocalDate.now().getDayOfWeek().name().equals("Sunday")) {
                return 90;
            } else {
                return 130;
            }
        }
        else {
            if (LocalDate.now().getDayOfWeek().name().equals("Saturday") || LocalDate.now().getDayOfWeek().name().equals("Sunday")) {
                return 80;
            } else {
                return 90;
            }
        }
    }

    @Override
    public int rating() {
        return 4;
    }



}
