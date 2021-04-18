package pattern.structural.composite.model;

public class Bedroom implements Room {
    @Override
    public void turnOnLight() {
        System.out.println("Light turned on in bedroom");
    }

    @Override
    public void turnOffLight() {
        System.out.println("Light turned off in bedroom");
    }
}
