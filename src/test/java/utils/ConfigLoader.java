package utils;

import java.util.Properties;

public class ConfigLoader {

    private final Properties properties;
    private static ConfigLoader configloader;

    private ConfigLoader() {
        this.properties = PropertyUtils.propertyLoader("src/test/resources/dev_config.properties");
    }

    public static ConfigLoader getInstance() {
        if (configloader == null) {
            configloader = new ConfigLoader();
        }
        return configloader;
    }

    public String getBaseUrl() {
        String property = properties.getProperty("baseUrl");
        if (property != null) {
            return property;
        } else {
            throw new RuntimeException("property baseUrl is not specified in the config file");
        }
    }

    public String getClientId() {
        String property = properties.getProperty("clientId");
        if (property != null) {
            return property;
        } else {
            throw new RuntimeException("property clientId is not specified in the config file");
        }
    }

    public String getClientSecret() {
        String property = properties.getProperty("clientSecret");
        if (property != null) {
            return property;
        } else {
            throw new RuntimeException("property clientSecret is not specified in the config file");
        }
    }
}
