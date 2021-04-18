package pattern.structural.composite.model;

public class Kitchen implements Room {
    @Override
    public void turnOnLight() {
        System.out.println("Light turned on in the kitchen");
    }

    @Override
    public void turnOffLight() {
        System.out.println("Light turned off in the kitchen");
    }
}
