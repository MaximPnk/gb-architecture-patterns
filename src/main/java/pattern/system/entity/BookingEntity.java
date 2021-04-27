package pattern.system.entity;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingEntity {

    String bookRef;
    Date bookDate;
    Double totalAmount;

}
