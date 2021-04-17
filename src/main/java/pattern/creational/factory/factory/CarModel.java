package pattern.creational.factory.factory;

import pattern.creational.factory.car.Car;

public abstract class CarModel {

    public abstract Car createCar();

    public void start() {
        Car car = createCar();
        car.start();
    }

    public void stop() {
        Car car = createCar();
        car.stop();
    }
}
