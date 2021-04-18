package pattern.structural.facade.service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserOrderFacade {

    OrderService orderService;
    UserService userService;

    public String[] getOrdersByUserId(Long id) {
        String user = userService.findUserById(1L);
        return orderService.getOrdersByUser(user);
    }
}
