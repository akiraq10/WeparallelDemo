import org.openqa.selenium.WebDriver;

public class DriverFactory {

    WebDriver webDriver;;

    // Singleton Design Pattern
    WebDriver getDriver() {
        if(webDriver == null) {
            webDriver = Webdriver.getChromeDriver();

        }
        return webDriver;
    }

    WebDriver getDriver(String browserName) {
        if(webDriver == null) {
            webDriver = Webdriver.getDriver(browserName);
        }
        return webDriver;
    }

    void quitDriver(){
        if(webDriver !=null ){
            webDriver.quit();
            webDriver = null;
        }
    }

}
