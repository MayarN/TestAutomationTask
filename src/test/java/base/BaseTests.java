package base;

import dataFileReaders.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTests {

    protected static WebDriver driver;

    public static String propertyFilePath = "configs//Configuration.properties";

    ConfigFileReader configFileObj = new ConfigFileReader(propertyFilePath);

    @BeforeClass
    public void setUp() {
        String browser = configFileObj.getBrowser();
        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get(configFileObj.getUrl());

    }


    @AfterClass
    public void tearDown() {
        driver.quit();

    }
}
