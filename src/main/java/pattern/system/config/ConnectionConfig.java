package pattern.system.config;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionConfig {

    private static ConnectionConfig instance;
    private Connection connection;

    private ConnectionConfig() {
        Properties prop = new PropertiesConfig().loadProperties("secret.properties");

        String jdbcUrl = prop.getProperty("jdbcUrl");
        String user = prop.getProperty("user");
        String password = prop.getProperty("password");
        try {
            connection = DriverManager.getConnection(jdbcUrl, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ConnectionConfig getInstance() {
        if (instance == null) {
            instance = new ConnectionConfig();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
