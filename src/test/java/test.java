import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test extends DriverBase{
    @Test
    public void testLoginWithCorrectCreds() {
        WebDriver driver = getDriver();
        WebElement txt1=driver.findElement(By.name("q"));
        txt1.sendKeys("Winmagic");
        txt1.submit();
        Assert.fail();
        driver.quit();

    }

    @Test
    public void testLoginWithIncorrectCreds() {
        WebDriver driver = getDriver();
        WebElement txt1=driver.findElement(By.name("q"));
        txt1.sendKeys("facebook");
        txt1.submit();
        Assert.fail();
        driver.quit();
    }


}
