package PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

//Класс со страницей оформления заказа
public class orderPage {

    private WebDriver driver;
    private By name = By.xpath(".//input[contains(@placeholder, '* Имя')]");
    private By surname = By.xpath(".//input[contains(@placeholder, '* Фамилия')]");
    private By adress = By.xpath(".//input[contains(@placeholder, '* Адрес: куда привезти заказ')]");
    private By metro = By.xpath(".//input[contains(@placeholder, '* Станция метро')]");
    private By phone = By.xpath(".//input[contains(@placeholder, '* Телефон: на него позвонит курьер')]");
    private By nextButton = By.xpath(".//button[text() = 'Далее']");

    public orderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setNameField(String _name) {
        driver.findElement(name).click();
        driver.findElement(name).sendKeys(_name);
    }

    public void setSurnameField(String _surname) {
        driver.findElement(surname).click();
        driver.findElement(surname).sendKeys(_surname);
    }

    public void setAdressField(String _adress) {
        driver.findElement(adress).click();
        driver.findElement(adress).sendKeys(_adress);
    }

    public void setMetroField(String _metro) {
        driver.findElement(metro).click();
        driver.findElement(metro).sendKeys(_metro);
        driver.findElement(metro).sendKeys(_metro + Keys.ARROW_DOWN + Keys.ENTER);
    }

    public void setPhoneField(String _phone) {
        driver.findElement(phone).click();
        driver.findElement(phone).sendKeys(_phone);
    }

    //Шаг для объединения заполнения полей формы
    public void setOrderForm(String _name, String _surname, String _adress, String _metro, String _phone) {
        setNameField(_name);
        setSurnameField(_surname);
        setAdressField(_adress);
        setMetroField(_metro);
        setPhoneField(_phone);
    }

    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }
}
