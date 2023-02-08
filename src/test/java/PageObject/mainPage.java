package PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Класс главной страницы
public class mainPage {
    private WebDriver driver;
    private By Cookie = By.id("rcc-confirm-button");
    private By homeHeader = By.className("Home_Header__iJKdX");
    private By orderInHead = By.className("Button_Button__ra12g");
    private By orderInPage = By.className("Button_Middle__1CSJM");

    public mainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOrderButtonInHead() {
        driver.findElement(orderInHead).click();
    }

    public void clickOrderButtonInPage() {
        driver.findElement(orderInPage).click();
    }

    public void clickCookieAffirm() {
        driver.findElement(Cookie).click();
    }

    public By getQuestion(String i) {
        return By.id("accordion__heading-" + i);
    }

    public void checkFAQ(By _question_number, String i, String expected) {
        driver.findElement(_question_number).click();
        String actual = driver.findElement(By.id("accordion__panel-" + i)).getText();
        Assert.assertEquals(expected, actual);
    }
}