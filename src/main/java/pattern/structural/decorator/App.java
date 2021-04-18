package pattern.structural.decorator;

import pattern.structural.decorator.service.UserService;
import pattern.structural.decorator.service.UserServiceDecorator;
import pattern.structural.decorator.service.UserServiceLogDecorator;

public class App {

    public static void main(String[] args) {
        UserService userService = new UserService();
        UserServiceDecorator serviceDecorator = new UserServiceDecorator(new UserService());
        UserServiceLogDecorator logDecorator = new UserServiceLogDecorator(new UserServiceDecorator(new UserService()));

        userService.saveNewUser("Alex");
        serviceDecorator.saveNewUser("Peter");
        logDecorator.saveNewUser("Kamilla");
    }
}
