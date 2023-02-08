import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.After;
import org.junit.Test;
import PageObject.mainPage;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FAQTest {

    private WebDriver driver = new ChromeDriver();
    private final String QUESTION_NUMBER;
    private final String EXPECTED;

    public FAQTest(String question_number, String expected) {
        this.QUESTION_NUMBER = question_number;
        this.EXPECTED = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"0", "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {"1", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {"2", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {"3", "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {"4", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {"5", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {"6", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {"7", "Да, обязательно. Всем самокатов! И Москве, и Московской области."}
        };
    }

    @Test
    public void checkFAQIsCorrect() {

        mainPage objMainPage = new mainPage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru");
        //Ожидание загрузки браузера
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Home_Header__iJKdX")));

        objMainPage.clickCookieAffirm();
        By question_number = objMainPage.getQuestion(QUESTION_NUMBER);
        objMainPage.checkFAQ(question_number, QUESTION_NUMBER, EXPECTED);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}