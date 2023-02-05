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
import PageObject.orderPage;
import PageObject.rentPage;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class OrderTest {

    private final int scenario;
    private final String _name;
    private final String _surname;
    private final String _adress;
    private final String _metro;
    private final String _phone;
    private final String _date;
    private final String _rent;
    private final boolean expected;
    public OrderTest(int scenario, String _name, String _surname, String _adress, String _metro, String _phone, String _date, String _rent, boolean expected) {
        this.scenario = scenario;
        this._name = _name;
        this._surname = _surname;
        this._adress = _adress;
        this._metro = _metro;
        this._phone = _phone;
        this._date = _date;
        this._rent = _rent;
        this.expected = expected;
    }

    private WebDriver driver = new ChromeDriver();

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {1, "Александр", "Соломеин", "Екатеринбург", "Бульвар Рокоссовского", "79505504425", "05.02.2023", "Сутки", true},
                {2, "Иван", "Иванов", "Санкт-Петербург", "Черкизовская", "79403212312", "06.02.2023", "Двое суток", true}
        };
    }

    @Test
    public void checkOrderSuccess() {

        mainPage objMainPage = new mainPage(driver);

        driver.get("https://qa-scooter.praktikum-services.ru/");
        //Ожидание загрузки браузера
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Home_Header__iJKdX")));

        objMainPage.clickCookieAffirm();
        if(scenario == 1) {
            objMainPage.clickOrderButtonInHead();
        } else if (scenario == 2) {
            objMainPage.clickOrderButtonInPage();
        }

        orderPage objOrderPage = new orderPage(driver);
        objOrderPage.setOrderForm(_name, _surname, _adress, _metro, _phone);
        objOrderPage.clickNextButton();

        rentPage objRentPage = new rentPage(driver);
        objRentPage.setRentForm(_date, _rent);
        boolean actual = objRentPage.checkIfOrderSuccess();

        Assert.assertEquals(expected, actual);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
