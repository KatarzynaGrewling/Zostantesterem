import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class UltimateQATest {

    String projectLocation = System.getProperty("user.dir");
    ChromeDriver driver;
    @BeforeEach
    public void setup() {


        System.setProperty("webdriver.chrome.driver", projectLocation + "/resources1/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");


    }

    @Test
    public void testOne() {

    }

    @AfterEach
        public void teardown() {
    driver.quit();

    }
    



}
