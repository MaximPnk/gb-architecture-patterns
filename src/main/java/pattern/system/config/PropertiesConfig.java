package pattern.system.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesConfig {

    private final Properties properties;

    public PropertiesConfig() {
        properties = new Properties();
    }

    public Properties loadProperties(String sourcePath) {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(sourcePath);
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
