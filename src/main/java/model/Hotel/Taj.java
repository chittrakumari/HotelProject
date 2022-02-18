/**
 * User: Chittra Kumari
 * Date: 18-02-2022
 * IDE: IntelliJ IDEA
 * File: model.Hotel.Taj.java
 * JDK: Oracle JDK 17
 */

package model.Hotel;

import model.Customer.Customer;
import model.Customer.RegularCustomer;

import java.time.LocalDate;

public final class Taj extends Hotel{
    public int getRate(Customer customer) {
        if (customer instanceof RegularCustomer) {
            if (LocalDate.now().getDayOfWeek().name().equals("Saturday") || LocalDate.now().getDayOfWeek().name().equals("Sunday")) {
                return 110;
            } else {
                return 120;
            }
        }
        else {
            if (LocalDate.now().getDayOfWeek().name().equals("Saturday") || LocalDate.now().getDayOfWeek().name().equals("Sunday")) {
                return 105;
            } else {
                return 90;
            }
        }
    }

    @Override
    public int rating() {
        return super.rating();
    }

}
