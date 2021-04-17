package pattern.creational.factory.factory;

import pattern.creational.factory.car.Bmw;
import pattern.creational.factory.car.Car;

public class BmwModel extends CarModel {
    @Override
    public Car createCar() {
        return new Bmw();
    }
}
