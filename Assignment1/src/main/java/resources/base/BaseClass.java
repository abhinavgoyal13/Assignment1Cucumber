package resources.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;
    public Properties p;

    public WebDriver baseInit() throws IOException {
        p = new Properties();
        FileInputStream fs = new FileInputStream("src/main/java/resources/data.properties");
        p.load(fs);
        if (p.getProperty("browser").equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (p.getProperty("browser").equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
}
