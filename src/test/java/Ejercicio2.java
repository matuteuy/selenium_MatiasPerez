import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.GetProperties;

public class Ejercicio2 {

    @Test
public void segundoTest(){
    GetProperties properties = new GetProperties();
    String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
    System.setProperty("webdriver.chrome.driver", chromeDriverUrl);

    WebDriver driver = new ChromeDriver();
    driver.get("http://www.google.com");

    System.out.println(driver.getTitle());
}


}

