package pattern.system.identitymap;

import pattern.system.entity.BookingEntity;

import java.util.HashMap;
import java.util.Map;

public class IdentityMap {

    private static Map<String, BookingEntity> bookingsCache = new HashMap<>();

    public static BookingEntity getBookFromCache(String bookRef) {
        return bookingsCache.get(bookRef);
    }

    public static void addBookToCache (BookingEntity entity) {
        if (entity == null) {
            return;
        }
        bookingsCache.put(entity.getBookRef(), entity);
    }
}
