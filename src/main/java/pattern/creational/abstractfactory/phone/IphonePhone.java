package pattern.creational.abstractfactory.phone;

public class IphonePhone implements Phone {
    @Override
    public void call(String number) {
        System.out.println("Iphone: calling " + number);
    }

    @Override
    public void msg(String number, String text) {
        System.out.println("Iphone: sending \"" + text + "\" to " + number);
    }
}
