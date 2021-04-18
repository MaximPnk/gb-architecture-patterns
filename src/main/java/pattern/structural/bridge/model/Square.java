package pattern.structural.bridge.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Square implements Figure {
    private String color;
    private int width;
    private int height;
}
