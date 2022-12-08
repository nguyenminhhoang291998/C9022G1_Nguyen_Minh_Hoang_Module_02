package case_study.furama_resort.services;

import case_study.furama_resort.models.booking.Booking;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        LocalDate o1StartDay = LocalDate.parse(o1.getStartDay(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate o2StartDay = LocalDate.parse(o2.getStartDay(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate o1EndDay = LocalDate.parse(o1.getEndDay(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate o2EndDay = LocalDate.parse(o2.getEndDay(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        if (Period.between(o1StartDay, o2StartDay).getDays() > 0) {
            return -1;
        } else if (Period.between(o1StartDay, o2StartDay).getDays() < 0) {
            return 1;
        } else return Integer.compare(Period.between(o1EndDay, o2EndDay).getDays(), 0);
    }
}
