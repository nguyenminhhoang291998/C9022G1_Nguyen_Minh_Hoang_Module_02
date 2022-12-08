package case_study.furama_resort.services;

import case_study.furama_resort.models.booking.Booking;

import java.util.Set;

public interface IBookingService extends IService<Booking>{
    Set<Booking> getListBooking();

    boolean isIDBookingAlreadyExists(String id);

}

