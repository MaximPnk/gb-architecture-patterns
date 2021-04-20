package pattern.behavioral.strategy.model;

public class Order {
    int sum;

    public Order(int sum) {
        this.sum = sum;
    }

    public void pay(Strategy strategy) {
        strategy.pay(sum);
    }
}
