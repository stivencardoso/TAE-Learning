import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class prueba2 {
    public static void main(String[]args )throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://co.linkedin.com/");
        Thread.sleep(5000);
        WebElement login_attempt = driver.findElement(By.xpath("/html/body/nav/div/a[2]"));
        login_attempt.click();
        driver.close();
        driver.quit();
    }
}
