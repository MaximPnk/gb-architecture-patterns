package pattern.structural.bridge.model;

public interface Figure {

    void setColor(String color);
    void setWidth(int width);
    void setHeight(int height);
    String getColor();
    int getHeight();
    int getWidth();
}
