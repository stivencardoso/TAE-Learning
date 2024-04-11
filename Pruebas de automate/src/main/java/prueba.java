import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class prueba {
 public static void main(String[]args )throws InterruptedException {
     WebDriverManager.chromedriver().setup();
     ChromeOptions options=new ChromeOptions();
     options.addArguments("--start-maximized");
     WebDriver driver=new ChromeDriver(options);
     driver.get("https://www.youtube.com/");
     Thread.sleep(5000);
     WebElement homebutton= driver.findElement(By.xpath("//a[@title=\"Home\"]//yt-formatted-string"));
     Assertions.assertEquals("Home",homebutton.getText());
     driver.close();
     driver.quit();
 }
}
