import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class testDriver {
    public static void main(String[] args) {
        String path=System.getProperty("user.dir");
        String chromeDriverPath = path + "/WebDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver;
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://google.com");
//        WebElement txtBox=driver.findElement(By.name("q"));
//        txtBox.sendKeys("Winamgic");
//        txtBox.submit();
        driver=Webdriver.getDriver("chrome");
        driver.get("https://google.com");


    }
}
