package pattern.creational.factory.car;

public class Bmw implements Car {
    @Override
    public void start() {
        System.out.println("Bmw start");
    }

    @Override
    public void stop() {
        System.out.println("Bmw stop");
    }
}
