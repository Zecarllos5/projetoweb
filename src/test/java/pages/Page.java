package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Page {

    private WebDriver driver;

    public Page(String browser, String url) {
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                this.driver = new ChromeDriver(options);
                break;
            case "firefox":
                System.setProperty("webdriver.firefox.driver", "src/test/resources/drivers/firefoxdriver.exe");
                FirefoxOptions optionsFirefox = new FirefoxOptions();
                this.driver = new FirefoxDriver(optionsFirefox);

            default:
                break;
        }
        driver.get(url);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void fecharBrowser(){
        this.driver.quit();
    }

}
