import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class caso4 {
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
        String imagenitem = driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img")).getAttribute("src");
        WebElement item = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]"));
        item.click();
        Thread.sleep(3000);
        String imagendespcrip = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[1]/img")).getAttribute("src");
        if (imagenitem.equals(imagendespcrip)) {
            System.out.println("Las URLs de las imágenes son iguales.");
        } else {
            System.out.println("Las URLs de las imágenes son diferentes.");
        }
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}
