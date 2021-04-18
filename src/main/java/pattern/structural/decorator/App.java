package pattern.structural.decorator;

import pattern.structural.decorator.service.UserService;
import pattern.structural.decorator.service.UserServiceDecorator;
import pattern.structural.decorator.service.UserServiceLogDecorator;

public class App {

    public static void main(String[] args) {
        UserService userService = new UserService();
        UserServiceDecorator serviceDecorator = new UserServiceDecorator(userService);
        UserServiceLogDecorator logDecorator = new UserServiceLogDecorator(userService);

        userService.saveNewUser("Alex");
        serviceDecorator.saveNewUser("Peter");
        logDecorator.saveNewUser("Kamilla");
    }
}
