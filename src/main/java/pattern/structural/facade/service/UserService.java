package pattern.structural.facade.service;

public class UserService {

    String findUserById(Long id) {
        return new String[]{"A", "B", "C"}[(int) (Math.random() * 3)];
    }
}
