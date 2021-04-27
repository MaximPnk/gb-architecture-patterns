package pattern.system.datamapper;

import pattern.system.config.ConnectionConfig;
import pattern.system.entity.BookingEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookingMapper {

    private final Connection connection;

    public BookingMapper() {
        connection = ConnectionConfig.getInstance().getConnection();
    }

    public List<BookingEntity> findAllBookings() {
        List<BookingEntity> bookings = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bookings");
            ResultSet rs = null;
            rs = statement.executeQuery();
            while (rs.next()) {
                bookings.add(new BookingEntity(rs.getString("book_ref"), rs.getDate("book_date"), rs.getDouble("total_amount")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookings;
    }

    public BookingEntity findBookingByBookRef(String bookRef) {
        BookingEntity bookingEntity;
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bookings WHERE book_ref = ?");
            statement.setString(1, bookRef);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                bookingEntity = new BookingEntity(rs.getString("book_ref"), rs.getDate("book_date"), rs.getDouble("total_amount"));
                return bookingEntity;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
