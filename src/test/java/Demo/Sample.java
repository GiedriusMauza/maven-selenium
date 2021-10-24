package Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Sample {
    @Test
    public void demo() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Cerberus\\Downloads\\maven-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String baseTitle = driver.getTitle();
        System.out.println("title =" + baseTitle);
        driver.manage().window().maximize();
        driver.quit();
    }
}