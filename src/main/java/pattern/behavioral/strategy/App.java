package pattern.behavioral.strategy;

import pattern.behavioral.strategy.model.CardStrategy;
import pattern.behavioral.strategy.model.Order;
import pattern.behavioral.strategy.model.Strategy;
import pattern.behavioral.strategy.model.WalletStrategy;

public class App {

    public static void main(String[] args) {
        Order order1 = new Order(50);

        Strategy strategy = new CardStrategy();
        order1.pay(strategy);
        Strategy strategy1 = new WalletStrategy();
        order1.pay(strategy1);
    }
}
