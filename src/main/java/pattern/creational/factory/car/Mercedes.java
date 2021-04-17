package pattern.creational.factory.car;

public class Mercedes implements Car {
    @Override
    public void start() {
        System.out.println("Mercedes start");
    }

    @Override
    public void stop() {
        System.out.println("Mercedes stop");
    }
}
