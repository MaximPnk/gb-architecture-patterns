package pattern.structural.facade;

import pattern.structural.facade.service.OrderService;
import pattern.structural.facade.service.UserOrderFacade;
import pattern.structural.facade.service.UserService;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        UserOrderFacade facade = new UserOrderFacade(new OrderService(), new UserService());
        String[] orders = facade.getOrdersByUserId(1L);
        System.out.println(Arrays.toString(orders));
    }
}
