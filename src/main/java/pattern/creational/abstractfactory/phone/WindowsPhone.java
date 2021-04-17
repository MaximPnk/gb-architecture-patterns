package pattern.creational.abstractfactory.phone;

public class WindowsPhone implements Phone {
    @Override
    public void call(String number) {
        System.out.println("Windows phone: calling " + number);
    }

    @Override
    public void msg(String number, String text) {
        System.out.println("Windows phone: sending \"" + text + "\" to " + number);
    }
}
