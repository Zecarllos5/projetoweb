import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;

public class Selenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        ChromeDriver driver = new ChromeDriver(options);
//
//        driver.get("https://www.phptravels.net/");
//
//        WebElement abaHotel = driver.findElement(By.id("submit"));
//        abaHotel.click();
//        driver.quit();


        HomePage homePage = new HomePage("chrome");
        homePage.pesquisar("Recife");
        homePage.fecharBrowser();




    }
}
