package pattern.creational.builder.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Human {

    private String name;
    private int age;
    private int weight;
    private int height;
}
