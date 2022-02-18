package model.Customer;

import model.Hotel.Hotel;

public sealed interface Customer permits RegularCustomer,RewardCustomer{
    public int bookHotel(Hotel hotel);
}

