package pattern.behavioral.strategy.model;

public class CardStrategy implements Strategy {
    @Override
    public void pay(int money) {
        System.out.println("Paid " + money + " by card");
    }
}
