package pattern.creational.abstractfactory.factory;

import pattern.creational.abstractfactory.phone.IphonePhone;
import pattern.creational.abstractfactory.phone.Phone;

public class IphoneFactory implements PhoneFactory {

    @Override
    public Phone createPhone() {
        return new IphonePhone();
    }
}
