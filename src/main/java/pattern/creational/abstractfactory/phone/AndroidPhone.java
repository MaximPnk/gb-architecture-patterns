package pattern.creational.abstractfactory.phone;

public class AndroidPhone implements Phone {
    @Override
    public void call(String number) {
        System.out.println("Android: calling " + number);
    }

    @Override
    public void msg(String number, String text) {
        System.out.println("Android: sending \"" + text + "\" to " + number);
    }
}
