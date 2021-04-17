package pattern.creational.abstractfactory.factory;

import pattern.creational.abstractfactory.phone.Phone;
import pattern.creational.abstractfactory.phone.WindowsPhone;

public class WindowsFactory implements PhoneFactory {

    @Override
    public Phone createPhone() {
        return new WindowsPhone();
    }
}
