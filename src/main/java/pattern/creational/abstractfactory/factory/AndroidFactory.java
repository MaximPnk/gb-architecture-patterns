package pattern.creational.abstractfactory.factory;

import pattern.creational.abstractfactory.phone.AndroidPhone;
import pattern.creational.abstractfactory.phone.Phone;

public class AndroidFactory implements PhoneFactory {

    @Override
    public Phone createPhone() {
        return new AndroidPhone();
    }
}
