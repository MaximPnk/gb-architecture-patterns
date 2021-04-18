package pattern.structural.bridge.service;

import lombok.AllArgsConstructor;
import pattern.structural.bridge.model.Circle;
import pattern.structural.bridge.model.Figure;
import pattern.structural.bridge.model.Square;

@AllArgsConstructor
public class FigureBridge {

    public Figure createBigYellowCircle() {
        Figure figure = new Circle();
        figure.setColor("yellow");
        figure.setHeight(100);
        figure.setWidth(100);
        return figure;
    }

    public Figure createSmallWhiteSquare() {
        Figure figure = new Square();
        figure.setColor("white");
        figure.setHeight(5);
        figure.setWidth(5);
        return figure;
    }

}
