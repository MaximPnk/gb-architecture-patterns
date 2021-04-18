package pattern.structural.decorator.service;

public class UserServiceLogDecorator extends UserServiceDecorator {

    public UserServiceLogDecorator(UserService service) {
        super(service);
    }

    @Override
    public void saveNewUser(String user) {
        super.saveNewUser(user);
        System.out.println("Logging into file: save user - " + user);
    }
}
