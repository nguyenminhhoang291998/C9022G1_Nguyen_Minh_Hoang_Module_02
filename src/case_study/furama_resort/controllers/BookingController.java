package case_study.furama_resort.controllers;

import case_study.furama_resort.models.booking.Booking;
import case_study.furama_resort.services.IBookingService;
import case_study.furama_resort.services.impl.BookingServiceImpl;

import java.util.Set;

public class BookingController {
    private final IBookingService bookingServiceImpl = new BookingServiceImpl();

    public void addNewBooking(Booking newBooking) {
        this.bookingServiceImpl.addData(newBooking);
    }

    public Set<Booking> getListBooking() {
        return this.bookingServiceImpl.getListBooking();
    }
}
