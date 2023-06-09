package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {


    private static Properties properties;

    static {

        try {
            properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/configurations.properties");
            properties.load(fileInputStream);
            fileInputStream.close();

           }
        catch (IOException e) {

            System.out.println("file not found");

        }

    }

    public static String getValue(String key){
        return properties.getProperty(key);
    }


}
