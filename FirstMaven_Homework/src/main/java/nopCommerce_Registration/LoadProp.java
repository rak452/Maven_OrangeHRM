package nopCommerce_Registration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class LoadProp extends BasePage {


    static Properties prop;
    //    static String fielName="TestDataConfig.properties";
//    static String filelocation="I:\\AutomationBackup\\29-07-2016\\AKDMC\\";
//    static String filelocation="src\\test\\Resources\\Properties\\";
    static FileInputStream input;

    public String getProperty(String key) {
        prop = new Properties();
        try {
            input = new FileInputStream("BrowserDriver/Properties/TestDataConfig.properties");
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}

