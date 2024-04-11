import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class caso3 {
    public static void main(String[]args )throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        WebElement user = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        user.sendKeys("locked_out_user");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("secret_sauce");
        Thread.sleep(2000);
        WebElement login_attempt = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        login_attempt.click();
        Thread.sleep(2000);
        WebElement mensajeError = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]"));
        Assertions.assertEquals("Epic sadface: Sorry, this user has been locked out.", mensajeError.getText());
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
