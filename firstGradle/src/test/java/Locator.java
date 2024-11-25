import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
    WebDriver driver;

    @BeforeEach
    void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    void CanCallTest(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        WebElement text = driver.findElement(By.xpath("//h1[@class='display-6']"));
        Assertions.assertEquals("Web form", text.getText());

        WebElement icon = driver.findElement(By.xpath("//button[text()='Submit']"));
        icon.click();
        Assertions.assertEquals("https://bonigarcia.dev/selenium-webdriver-java/submitted-form.html?my-text=&my-password=&my-textarea=&my-readonly=Readonly+input&my-select=Open+this+select+menu&my-datalist=&my-file=&my-check=on&my-radio=on&my-colors=%23563d7c&my-date=&my-range=5&my-hidden=",driver.getCurrentUrl());

        WebElement input = driver.findElement(By.name("my-text"));
        WebElement textInput = driver.findElement(By.id("my-text-id"));
        WebElement tagName = driver.findElement(By.tagName("input"));
        WebElement className = driver.findElement(By.className("form-control"));
        WebElement lintText = driver.findElement(By.linkText("Return to index"));

        WebElement textCss = driver.findElement(By.cssSelector("my-text-id"));
        WebElement textInputCss = driver.findElement(By.cssSelector(".form-control"));
        WebElement textByNameCss = driver.findElement(By.cssSelector("[name='my-text']"));
        WebElement tagCss = driver.findElement(By.cssSelector("input.form-control");

        WebElement textContains = driver.findElement(By.xpath("//h1[contains(text(),'Hands-On Selenium WebDriver with Java')]"));




    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }
}
