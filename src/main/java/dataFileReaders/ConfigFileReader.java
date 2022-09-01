package dataFileReaders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;

    public ConfigFileReader(String path) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(path));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("path.properties not found at " + path);
        }
    }

    public String getBrowser() {
        String driverPath = properties.getProperty("browser");
        if (driverPath != null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }


    public String getUrl() {
        String url = properties.getProperty("url");
        if (url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }



}
