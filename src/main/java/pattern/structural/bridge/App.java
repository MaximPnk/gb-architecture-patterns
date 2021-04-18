package pattern.structural.bridge;

import pattern.structural.bridge.service.Draw;
import pattern.structural.bridge.service.Paint;

public class App {

    public static void main(String[] args) {
        Draw draw = new Paint();
        System.out.println(draw.createBigYellowCircle());
        System.out.println(draw.createSmallWhiteSquare());
    }
}
