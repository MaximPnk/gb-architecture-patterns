package pattern.structural.bridge;

import pattern.structural.bridge.service.FigureBridge;

public class App {

    public static void main(String[] args) {
        FigureBridge figureBridge = new FigureBridge();
        System.out.println(figureBridge.createBigYellowCircle());
        System.out.println(figureBridge.createSmallWhiteSquare());
    }
}
