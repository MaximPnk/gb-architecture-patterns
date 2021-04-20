package pattern.behavioral.strategy.model;

public class WalletStrategy implements Strategy {
    @Override
    public void pay(int money) {
        System.out.println("Paid " + money + " in cash");
    }
}
