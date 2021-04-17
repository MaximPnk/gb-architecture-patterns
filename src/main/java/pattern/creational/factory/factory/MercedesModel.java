package pattern.creational.factory.factory;

import pattern.creational.factory.car.Car;
import pattern.creational.factory.car.Mercedes;

public class MercedesModel extends CarModel {
    @Override
    public Car createCar() {
        return new Mercedes();
    }
}
