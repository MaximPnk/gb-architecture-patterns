package pattern.structural.composite.model;

public class LivingRoom implements Room {
    @Override
    public void turnOnLight() {
        System.out.println("Light turned on in living room");
    }

    @Override
    public void turnOffLight() {
        System.out.println("Light turned off in living room");
    }
}
