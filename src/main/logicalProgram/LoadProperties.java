package logicalProgram;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {
    public static void main(String [] args) throws IOException {
        InputStream input = WordLength.class.getClassLoader().getResourceAsStream("Config.properties");
        Properties prop = new Properties();
        prop.load(input);

        //Print data
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("email"));
    }
}
