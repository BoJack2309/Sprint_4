package PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

//Класс для формы "Про аренду"
public class rentPage {

    private WebDriver driver;

    private By date = By.xpath(".//input[contains(@placeholder, '* Когда привезти самокат')]");
    private By rentalPeriod = By.xpath(".//div[@class = 'Dropdown-placeholder']");
    private By rentalPeriodTime1 = By.xpath(".//div[@class = 'Dropdown-option' and text() = 'Сутки']");
    private By rentalPeriodTime2 = By.xpath(".//div[@class = 'Dropdown-option' and text() = 'Двое суток']");
    private By checkbox1 = By.id("black");
    private By checkbox2 = By.id("grey");
    private By comment = By.xpath(".//input[contains(@placeholder, 'Комментарий для курьера')]");
    private By orderButton = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    private By yesButton = By.xpath(".//button[text() = 'Да']");
    private By orderSuccess = By.className("Order_ModalHeader__3FDaJ");

    public rentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setDateField(String _date) {
        driver.findElement(date).click();
        driver.findElement(date).sendKeys(_date + Keys.ARROW_DOWN + Keys.ENTER);
    }

    public void setRentalPeriodField(String _rent) {
        driver.findElement(rentalPeriod).click();
        if (_rent == "Сутки") {
            driver.findElement(rentalPeriodTime1).click();
        } else
        driver.findElement(rentalPeriodTime2).click();
    }

    public void setCheckboxField(int x) {
        if(x == 1) {
            driver.findElement(checkbox1).click();
        } else {
            driver.findElement(checkbox2).click();
        }
    }

    public void setComment(String _comment) {
        driver.findElement(comment).click();
        driver.findElement(comment).sendKeys(_comment);
    }

    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }

    public void clickYesButton() {
        driver.findElement(yesButton).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(orderSuccess).getText();
    }

    //Шаг для объединения заполнения полей формы
    public void setRentForm(String _date, String _rent) {
        setDateField(_date);
        setRentalPeriodField(_rent);
    }
    //Шаг для объединения 3 методов выше и получения результата оформления заказа
    public boolean checkIfOrderSuccess() {
                clickOrderButton();
                clickYesButton();
                String successMessage = getSuccessMessage();
                if (successMessage == "Заказ оформлен") {
                    return true;
                } else return false;
    }
}
