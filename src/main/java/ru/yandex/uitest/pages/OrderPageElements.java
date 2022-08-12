package ru.yandex.uitest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class OrderPageElements {
    public OrderPageElements (WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;

    //Кнопка заказ(верхн.)/далее
    private final By headerOrderStatusButton = By.xpath(".//button[@class = 'Button_Button__ra12g']");
    //Кнопка заказ(нижн.)
    private final By middleOrderStatusButton = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");
    // Поле Имя
    private final By customersNameInput = By.xpath(".//input[@placeholder='* Имя']");
    // Поле Фамилия
    private final By customersFamilyInput = By.xpath(".//input[@placeholder='* Фамилия']");
    //Поле адрес
    private final By customersAddressInput = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //Станция метро
    private final By customersMetroSelect = By.xpath(".//input[@placeholder='* Станция метро']");
    //Телефон клиента
    private final By customersTelNumberInput = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Когда привезти самокат
    private final By orderDate = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    // Срок аренды
    private final By orderDuration = By.xpath(".//div[text() = '* Срок аренды']");
    //Выбор цвета "чёрный жемчуг"
    private final By selectBlackColor = By.xpath("//label[contains(@class, 'Checkbox_Label__3wxSf') and contains(text() ,'чёрный жемчуг')]");
    //Выбор цвета "серая безысходность"
    private final By selectGreyColor = By.xpath("//label[contains(@class, 'Checkbox_Label__3wxSf') and contains(text() ,'серая безысходность')]");
    // Комментарий для курьера
    private final By orderComment = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");
    // Кнопка подтверждения заказа
    private final  By consentButton =By.xpath(".//button[contains(@class, 'Button_Button__ra12g Button_Middle__1CSJM') and contains(text() ,'Да')]");
    // Окно подтверждения заказа
    private final By consentWindow = By.xpath("//div[contains(@class, 'Order_ModalHeader__3FDaJ') and contains(text() ,'Заказ оформлен')]");

    public OrderPageElements clickHeaderOrderStatusButton() {
        driver.findElement(headerOrderStatusButton).click();
        return this;
    }

    public OrderPageElements clickMiddleOrderStatusButton() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(middleOrderStatusButton));
        driver.findElement(middleOrderStatusButton).click();
        return this;
    }

    public OrderPageElements typeCustomersName (String customersName) {
        driver.findElement(customersNameInput).sendKeys(customersName);
        return this;
    }
    public OrderPageElements typeCustomersFamily (String customersFamily) {
        driver.findElement(customersFamilyInput).sendKeys(customersFamily);
        return this;
    }
    public OrderPageElements typeCustomersAddress (String customersAddress) {
        driver.findElement(customersAddressInput).sendKeys(customersAddress);
        return this;
    }

    public OrderPageElements selectCustomersMetro (int metroNumber) {
        driver.findElement(customersMetroSelect).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//div/ul/li[" + metroNumber + "]")));
        driver.findElement(By.xpath("//div/ul/li[" + metroNumber + "]")).click();
        return this;
    }

    public OrderPageElements typeCustomersTelNumber (String customersAddress) {
        driver.findElement(customersTelNumberInput).sendKeys(customersAddress);
        return this;
    }

    public OrderPageElements selectOrderDate (String date) {
        driver.findElement(orderDate).click();
        driver.findElement(By.xpath(".//div[@aria-label = '" + date + "']")).click();
        return this;
    }
    public OrderPageElements selectDaysCount(String duration) {
        driver.findElement(orderDuration).click();
        driver.findElement(By.xpath(".//div[text() = '" + duration + "']")).click();
        return this;
    }

    public OrderPageElements clickSelectBlackColor () {
        driver.findElement(selectBlackColor).click();
        return this;
    }

    public OrderPageElements clickSelectGreyColor () {
        driver.findElement(selectGreyColor).click();
        return this;
    }

    public OrderPageElements typeOrderComment (String comment) {
        driver.findElement(orderComment).sendKeys(comment);
        return this;
    }

    public OrderPageElements clickConsentButton() {
        driver.findElement(consentButton).click();
        return this;
    }

    public boolean consentWindowDisplay () {
        driver.findElement(consentWindow).isDisplayed();
        return true;
    }


}
