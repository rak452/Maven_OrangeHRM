import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp extends Utils

{

    static Properties prop;
    static FileInputStream input;

    public String getProperty(String key) {
        prop = new Properties();
        try {
            input = new FileInputStream("Properties/TestDataConfig.properties");
            prop.load(input);

        }catch (IOException e){
            e.getStackTrace();
        }
        return  prop.getProperty(key);

    }
}
