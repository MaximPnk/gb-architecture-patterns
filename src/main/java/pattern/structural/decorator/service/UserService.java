package pattern.structural.decorator.service;

public class UserService {

    public void saveNewUser(String user) {
        System.out.printf("Send user \"%s\" data to dao%n", user);
    }
}
