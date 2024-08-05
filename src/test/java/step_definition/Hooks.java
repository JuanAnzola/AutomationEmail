package step_definition;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class Hooks {
    Properties properties = new Properties();
    private static ChromeDriver driver;

    @Before
    public void setUp() throws IOException {
        properties.load(new FileReader("src\\test\\resources\\configuration\\application.properties"));
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Driver Chrome/chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get(properties.getProperty("app.url"));
            driver.manage().window().maximize();

        }catch (Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }


    @After
    public void tearDown (){
        try {
            driver.quit();
        }catch (Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }

    public static ChromeDriver getDriver(){
        return driver;
    }
}