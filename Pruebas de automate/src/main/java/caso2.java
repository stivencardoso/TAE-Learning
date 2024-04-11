import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class caso2 {
    public static void main(String[]args )throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
        WebElement user = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        user.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("secret_sauce");
        WebElement login_attempt = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        login_attempt.click();
        Thread.sleep(1000);
        WebElement add1 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
        add1.click();
        Thread.sleep(1000);
        WebElement add2 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
        add2.click();
        Thread.sleep(1000);
        WebElement buy = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        buy.click();
        Thread.sleep(1000);
        WebElement checkout = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
        checkout.click();
        Thread.sleep(1000);
        WebElement name = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
        name.sendKeys("Jose stiven");
        Thread.sleep(1000);
        WebElement last = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
        last.sendKeys("cardoso cardoso");
        Thread.sleep(1000);
        WebElement zip = driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
        zip.sendKeys("1234556");
        Thread.sleep(1000);
        WebElement continuebuttom = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
        continuebuttom.click();
        Thread.sleep(1000);
        WebElement finish = driver.findElement(By.xpath("//*[@id=\"finish\"]"));
        finish.click();
        Thread.sleep(1000);
        driver.close();
        driver.quit();
    }
}

