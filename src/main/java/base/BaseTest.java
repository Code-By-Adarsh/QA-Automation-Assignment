package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class BaseTest {
    protected WebDriver driver;

    @BeforeSuite
    public void setupSuite(){
        System.out.println("-----Launching Suite-----");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("-----Launching Browser-----");
        System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("-----Closing Browser-----");
        if (driver != null){
            driver.quit();
        }
    }

    @AfterSuite
    public void tearDownSuite(){
        System.out.println("-----Closing Suite-----");
    }
}
