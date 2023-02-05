package PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

//Класс главной страницы
public class mainPage {
    private WebDriver driver;

    private By Cookie = By.id("rcc-confirm-button");
    private By homeHeader = By.className("Home_Header__iJKdX");
    private By orderInHead = By.className("Button_Button__ra12g");
    private By orderInPage = By.className("Button_Middle__1CSJM");
    private By question1 = By.id("accordion__heading-0");
    private By question2 = By.id("accordion__heading-1");
    private By question3 = By.id("accordion__heading-2");
    private By question4 = By.id("accordion__heading-3");
    private By question5 = By.id("accordion__heading-4");
    private By question6 = By.id("accordion__heading-5");
    private By question7 = By.id("accordion__heading-6");
    private By question8 = By.id("accordion__heading-7");
    private By answer1 = By.xpath(".//p[text() = 'Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");
    private By answer2 = By.xpath(".//p[text() = 'Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']");

    private By answer3 = By.xpath(".//p[text() = 'Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']");
    private By answer4 = By.xpath(".//p[text() = 'Только начиная с завтрашнего дня. Но скоро станем расторопнее.']");
    private By answer5 = By.xpath(".//p[text() = 'Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']");
    private By answer6 = By.xpath(".//p[text() = 'Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']");
    private By answer7 = By.xpath(".//p[text() = 'Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']");
    private By answer8 = By.xpath(".//p[text() = 'Да, обязательно. Всем самокатов! И Москве, и Московской области.']");

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

    public void checkFAQ1(String expected) {
        driver.findElement(question1).click();
        String actual = driver.findElement(answer1).getText();
        Assert.assertEquals(expected, actual);
    }

    public void checkFAQ2(String expected) {
        driver.findElement(question2).click();
        String actual = driver.findElement(answer2).getText();
        Assert.assertEquals(expected, actual);
    }

    public void checkFAQ3(String expected) {
        driver.findElement(question3).click();
        String actual = driver.findElement(answer3).getText();
        Assert.assertEquals(expected, actual);
    }

    public void checkFAQ4(String expected) {
        driver.findElement(question4).click();
        String actual = driver.findElement(answer4).getText();
        Assert.assertEquals(expected, actual);
    }

    public void checkFAQ5(String expected) {
        driver.findElement(question5).click();
        String actual = driver.findElement(answer5).getText();
        Assert.assertEquals(expected, actual);
    }

    public void checkFAQ6(String expected) {
        driver.findElement(question6).click();
        String actual = driver.findElement(answer6).getText();
        Assert.assertEquals(expected, actual);
    }

    public void checkFAQ7(String expected) {
        driver.findElement(question7).click();
        String actual =  driver.findElement(answer7).getText();
        Assert.assertEquals(expected, actual);
    }

    public void checkFAQ8(String expected) {
        driver.findElement(question8).click();
        String actual = driver.findElement(answer8).getText();
        Assert.assertEquals(expected, actual);
    }
}