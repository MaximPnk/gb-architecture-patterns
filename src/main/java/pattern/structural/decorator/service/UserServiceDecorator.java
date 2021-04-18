package pattern.structural.decorator.service;

public class UserServiceDecorator extends UserService {

    UserService service;

    public UserServiceDecorator(UserService service) {
        this.service = service;
    }

    @Override
    public void saveNewUser(String user) {
        service.saveNewUser(user);
    }
}
