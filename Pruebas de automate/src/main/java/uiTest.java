import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class uiTest {
    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void navigationToUrl() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        WebElement user = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        user.sendKeys("standard_user");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("secret_sauce");
        Thread.sleep(2000);
        WebElement login_attempt = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        login_attempt.click();
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        driver.close();
        driver.quit();
    }

    @Test()
    public void test1() throws InterruptedException {
        Thread.sleep(2000);
        WebElement bar = driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']"));
        bar.click();
        Thread.sleep(2000);
        WebElement logout = driver.findElement(By.xpath("//*[@id='logout_sidebar_link']"));
        logout.click();
        Thread.sleep(2000);
    }

    @Test()
    public void test2() throws InterruptedException {
        Thread.sleep(1000);
        WebElement add1 = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']"));
        add1.click();
        Thread.sleep(1000);
        WebElement add2 = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light']"));
        add2.click();
        Thread.sleep(1000);
        WebElement buy = driver.findElement(By.xpath("//*[@id='shopping_cart_container']/a"));
        buy.click();
        Thread.sleep(1000);
        WebElement checkout = driver.findElement(By.xpath("//*[@id='checkout']"));
        checkout.click();
        Thread.sleep(1000);
        WebElement name = driver.findElement(By.xpath("//*[@id='first-name']"));
        name.sendKeys("Jose stiven");
        Thread.sleep(1000);
        WebElement last = driver.findElement(By.xpath("//*[@id='last-name']"));
        last.sendKeys("cardoso cardoso");
        Thread.sleep(1000);
        WebElement zip = driver.findElement(By.xpath("//*[@id='postal-code']"));
        zip.sendKeys("1234556");
        Thread.sleep(1000);
        WebElement continueButton = driver.findElement(By.xpath("//*[@id='continue']"));
        continueButton.click();
        Thread.sleep(1000);
        WebElement finish = driver.findElement(By.xpath("//*[@id='finish']"));
        finish.click();
        Thread.sleep(1000);
    }

/*@Test()
    public void test3() throws InterruptedException {
        Thread.sleep(2000);
        WebElement mensajeError = driver.findElement(By.xpath("//*[@id='login_button_container']/div/form/div[3]"));
        Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.", mensajeError.getText());
        Thread.sleep(2000);
    }*/

    @Test()
    public void test4() throws InterruptedException {
        Thread.sleep(1000);
        String imagenitem = driver.findElement(By.xpath("//*[@id='item_4_img_link']/img")).getAttribute("src");
        WebElement item = driver.findElement(By.xpath("//*[@id='item_4_title_link']"));
        item.click();
        Thread.sleep(3000);
        String imagendescrip = driver.findElement(By.xpath("//*[@id='inventory_item_container']/div/div/div[1]/img")).getAttribute("src");
        if (imagenitem.equals(imagendescrip)) {
            System.out.println("Las URLs de las imágenes son iguales.");
        } else {
            System.out.println("Las URLs de las imágenes son diferentes.");
        }
        Thread.sleep(3000);
    }
}
