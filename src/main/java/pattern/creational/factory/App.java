package pattern.creational.factory;

import pattern.creational.factory.factory.BmwModel;
import pattern.creational.factory.factory.CarModel;
import pattern.creational.factory.factory.MercedesModel;

public class App {

    public static void main(String[] args) {
        String carBrand = "Mercedes";

        CarModel model;
        if (carBrand.equalsIgnoreCase("mercedes")) {
            model = new MercedesModel();
        } else if (carBrand.equalsIgnoreCase("bmw")) {
            model = new BmwModel();
        } else {
            throw new UnsupportedOperationException("Unsupported brand");
        }

        model.start();
        model.stop();
    }
}
