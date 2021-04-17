package pattern.creational.singleton;

import pattern.creational.singleton.connection.Connection;

public class App {

    public static void main(String[] args) {
//        Connection connection = new Connection();
        Connection connection = Connection.getInstance();
        System.out.println(connection);
        Connection connection1 = Connection.getInstance();
        System.out.println(connection1);
    }
}
