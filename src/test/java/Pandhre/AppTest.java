package Pandhre;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AppTest {
    private WebDriver driver;


    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:/WebDrivers/geckodriver.exe");
        driver = new FirefoxDriver();
    }


    @Test
    public void testTitle() {
        driver.get("http://demo.guru99.com/test/guru99home/");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Demo Guru99 Page"));
    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
