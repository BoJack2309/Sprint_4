package PageObject;

public class DescriptionOfElements {
    //Главная страница
    //Заголовок - homeHeader - By.className("Home_Header__iJKdX");
    //Уведомление об использовании cookie - Cookie - By.id("rcc-confirm-button");
    //Кнопка "Заказать" в шапке страницы - orderInHead - By.className("Button_Button__ra12g")
    //Кнопка "Заказать" на самой странице - orderInPage - By.className("Button_Middle__1CSJM")

    //Блок "Вопросы о важном"
    //Вопрос 1 - question1 - By.id("accordion__heading-0")
    //Вопрос 2 - question2 - By.id("accordion__heading-1")
    //Вопрос 3 - question2 - By.id("accordion__heading-2")
    //Вопрос 4 - question2 - By.id("accordion__heading-3")
    //Вопрос 5 - question2 - By.id("accordion__heading-4")
    //Вопрос 6 - question2 - By.id("accordion__heading-5")
    //Вопрос 7 - question2 - By.id("accordion__heading-6")
    //Вопрос 8 - question2 - By.id("accordion__heading-7")

    //Форма заказа
    //Поле "Имя" - name - By.xpath(".//input[contains(@placeholder, '* Имя')]")
    //Поле "Фамилия" - surname - By.xpath(".//input[contains(@placeholder, '* Фамилия')]")
    //Поле "Адрес" - adress - By.xpath(".//input[contains(@placeholder, '* Адрес: куда привезти заказ')]")
    //Поле "Станция метро" - metro - By.xpath(".//input[contains(@placeholder, '* Станция метро')]")
    //Элемент из выпадающего списка "Станция метро" - metroStation - By.xpath(".//input[@value = 'Название станции']")
    //Поле "Телефон" - phone - By.xpath(".//input[contains(@placeholder, '* Телефон: на него позвонит курьер')]")
    //Кнопка "Далее" - nextButton - By.xpath(".//button[text() = 'Далее']")

    //Форма "Про аренду"
    //Поле "Когда привезти самокат" - date - By.xpath(".//input[contains(@placeholder, '* Когда привезти самокат')]")
    //Поле "Срок аренды" - rentalPeriod - By.xpath(".//div[@class = 'Dropdown-placeholder']")
    //Элемент выпадающего списка "Срок аренды" - rentalPeriodTime - By.xpath(".//div[@class = 'Dropdown-option' and text() = 'необходимое значение']")
    //Чекбокс "Чёрный жемчуг" в поле "Цвет самоката" - checkbox1 - By.id("black")
    //Чекбокс "Серая безысходность" в поле "Цвет самоката" - checkbox2 - By.id("grey")
    //Поле "Комментарий для курьера" - comment - By.xpath(".//input[contains(@placeholder, 'Комментарий для курьера')]")
    //Кнопка "Заказать" - orderButton - By.className("Button_Button__ra12g Button_Middle__1CSJM")
    //Кнопка "Да" в окне "Хотите оформить заказ?" - yesButton - By.xpath(".//button[text() = 'Да']")
    //Уведомление об оформлении заказа - orderSuccess - By.className("Order_ModalHeader__3FDaJ")

}
