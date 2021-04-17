package pattern.creational.abstractfactory;

import pattern.creational.abstractfactory.common.PhoneType;
import pattern.creational.abstractfactory.factory.AndroidFactory;
import pattern.creational.abstractfactory.factory.IphoneFactory;
import pattern.creational.abstractfactory.factory.PhoneFactory;
import pattern.creational.abstractfactory.factory.WindowsFactory;
import pattern.creational.abstractfactory.phone.Phone;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        PhoneFactory factory = getPhoneFactoryByName("iPhone"); //iphone, windows, android
        Phone phone = factory.createPhone();
        phone.call("88005553535");
        phone.msg("100", "where is my money?");

    }

    private static PhoneFactory getPhoneFactoryByName(String name) {
        PhoneType type = Arrays.stream(PhoneType.values()).filter(t -> t.getValue().equalsIgnoreCase(name)).findAny()
                .orElseThrow(() -> new IllegalArgumentException("Bad phone type"));
        switch (type) {
            case IPHONE:
                return new IphoneFactory();
            case ANDROID:
                return new AndroidFactory();
            case WINDOWS:
                return new WindowsFactory();
            default:
                throw new UnsupportedOperationException("Something went wrong");
        }
    }
}
