package LearnCucumber;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties extends Utils {

    static Properties prop;
    static FileInputStream input;

    public String getProperty(String key) {
        prop = new Properties();
        try {
            input = new FileInputStream("src/test/resources/config.properties");
            prop.load(input);

        }catch (IOException e){
            e.getStackTrace();
        }
        return  prop.getProperty(key);

    }
}
