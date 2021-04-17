package pattern.creational.prototype.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Earphones implements Cloneable {
    int costPrice;
    int price;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
