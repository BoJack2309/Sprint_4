import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Assert.*;
import PageObject.mainPage;

public class FAQTest {

    private WebDriver driver = new ChromeDriver();

    @Test
    public void checkFAQIsCorrect() {
        mainPage objMainPage = new mainPage(driver);

        driver.get("https://qa-scooter.praktikum-services.ru");
        //Ожидание загрузки браузера
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Home_Header__iJKdX")));

        objMainPage.clickCookieAffirm();

        objMainPage.checkFAQ1("Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
        objMainPage.checkFAQ2("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.");
        objMainPage.checkFAQ3("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.");
        objMainPage.checkFAQ4("Только начиная с завтрашнего дня. Но скоро станем расторопнее.");
        objMainPage.checkFAQ5("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.");
        objMainPage.checkFAQ6("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.");
        objMainPage.checkFAQ7("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.");
        objMainPage.checkFAQ8("Да, обязательно. Всем самокатов! И Москве, и Московской области.");

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}