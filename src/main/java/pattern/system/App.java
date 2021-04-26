package pattern.system;

import pattern.system.datamapper.BookingMapper;
import pattern.system.proxy.BookingMapperProxy;

public class App {

    public static void main(String[] args) {
        BookingMapper bookingMapper = new BookingMapper();
//        System.out.println(bookingMapper.findAllBookings());

        System.out.println(bookingMapper.findBookingByBookRef("FFFCCC"));
        System.out.println(bookingMapper.findBookingByBookRef("FFFCCC"));

        System.out.println();

        BookingMapperProxy proxy = new BookingMapperProxy();
        System.out.println(proxy.findBookingByBookRef("FFFCCC"));
        System.out.println(proxy.findBookingByBookRef("FFFCCC"));
    }
}
