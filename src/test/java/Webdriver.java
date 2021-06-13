import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Webdriver {


    public static WebDriver getChromeDriver(){

        String path=System.getProperty("user.dir");
        String chromeDriverPath = path + "/WebDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://google.com");
        return driver;

    }
    public static WebDriver getDriver(String browserName){
        WebDriver driver=null;
        switch (browserName){
            case "chrome":{
                String path=System.getProperty("user.dir");
                String chromeDriverPath = path + "/WebDriver/chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", chromeDriverPath);
                driver= new ChromeDriver();
                break;
            }
            default:
                System.out.println("The browser not exsting ");
        }
        
        return driver;
    }
}
