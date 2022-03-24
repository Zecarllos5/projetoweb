package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends  Page{
    private final static String URL = "https://www.phptravels.net/";
    private WebElement btnSearch = getDriver().findElement(By.id("submit"));
//    private WebElement campoCidade = getDriver().findElement(By.className("select2-search__field"));

    public HomePage(String browser) {
        super(browser, URL);
    }

    public WebDriver pesquisar(String cidade){
//       campoCidade.sendKeys(cidade);
       btnSearch.click();
       return getDriver();
   }
}
