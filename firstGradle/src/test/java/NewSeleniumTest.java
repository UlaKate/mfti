import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.charset.StandardCharsets;

public class NewSeleniumTest {
    WebDriver driver;

    @BeforeEach
    void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    void OpenSiteTest(){
        driver.get("https://dedmorozmos.ru/");
        Assertions.assertEquals("https://dedmorozmos.ru/", driver.getCurrentUrl());
        Assertions.assertEquals("Московская усадьба Деда Мороза", driver.getTitle());
    }

    @Test
    void CanCallTest(){
        driver.get("https://dedmorozmos.ru/");
        WebElement icon = driver.findElement(By.xpath("//button[@class='burger']"));
        icon.click();
        Assertions.assertEquals("https://dedmorozmos.ru/", driver.getCurrentUrl());
    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }
}
