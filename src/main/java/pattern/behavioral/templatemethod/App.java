package pattern.behavioral.templatemethod;

import pattern.behavioral.templatemethod.model.Chrome;
import pattern.behavioral.templatemethod.model.Network;
import pattern.behavioral.templatemethod.model.Telegram;

public class App {

    public static void main(String[] args) {
        Network t = new Telegram();
        t.sendData("blablabla");

        Network b = new Chrome();
        b.sendData("lalala");
    }
}
