package pattern.system.proxy;

import pattern.system.datamapper.BookingMapper;
import pattern.system.entity.BookingEntity;
import pattern.system.identitymap.IdentityMap;

public class BookingMapperProxy extends BookingMapper {

    @Override
    public BookingEntity findBookingByBookRef(String bookRef) {
        BookingEntity entity;
        entity = IdentityMap.getBookFromCache(bookRef);
        if (entity != null) {
            System.out.println("got from cache");
            return entity;
        }
        entity = super.findBookingByBookRef(bookRef);
        IdentityMap.addBookToCache(entity);
        return entity;
    }
}
