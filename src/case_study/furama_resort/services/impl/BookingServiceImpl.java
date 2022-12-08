package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.booking.Booking;
import case_study.furama_resort.services.BookingComparator;
import case_study.furama_resort.services.IBookingService;

import java.io.*;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl implements IBookingService {
    private final BookingComparator bookingComparator = new BookingComparator();
    private final String PATH_FILE_BOOKING = "src/case_study/furama_resort/data/booking.csv";

    static {

    }

    @Override
    public void addData(Booking booking) {
        Set<Booking> bookingList =readFile();
        bookingList.add(booking);
        writeFile(bookingList);
    }

    @Override
    public Set<Booking> getListBooking() {
        return readFile();
    }

    private Set<Booking> readFile() {
//        Set<Booking> bookingList = new TreeSet<>(Comparator.comparing(Booking::getStartDay).thenComparing(Booking::getEndDay));
        Set<Booking> bookingList = new TreeSet<>(bookingComparator);
        try {
            File file = new File(PATH_FILE_BOOKING);
            if(!file.exists()){
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] booking = line.split(",");
                bookingList.add(new Booking(booking[0],booking[1],booking[2],Integer.parseInt(booking[3]),booking[4]));
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");
        }
        return bookingList;
    }

    private void writeFile(Set<Booking> bookingList) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH_FILE_BOOKING));
            for (Booking booking : bookingList) {
                bufferedWriter.write(booking.writeInfor().toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public boolean isIDBookingAlreadyExists(String id) {
       Set<Booking> bookingList = readFile();
        for (Booking booking : bookingList) {
            if (Objects.equals(id, booking.getIdBooking())) {
                return true;
            }
        }
        return false;
    }
}
