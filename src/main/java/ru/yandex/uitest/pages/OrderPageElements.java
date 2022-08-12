package ru.yandex.uitest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class OrderPageElements {
    public OrderPageElements (WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;

    //������ �����(�����.)/�����
    private final By headerOrderStatusButton = By.xpath(".//button[@class = 'Button_Button__ra12g']");
    //������ �����(����.)
    private final By middleOrderStatusButton = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");
    // ���� ���
    private final By customersNameInput = By.xpath(".//input[@placeholder='* ���']");
    // ���� �������
    private final By customersFamilyInput = By.xpath(".//input[@placeholder='* �������']");
    //���� �����
    private final By customersAddressInput = By.xpath(".//input[@placeholder='* �����: ���� �������� �����']");
    //������� �����
    private final By customersMetroSelect = By.xpath(".//input[@placeholder='* ������� �����']");
    //������� �������
    private final By customersTelNumberInput = By.xpath(".//input[@placeholder='* �������: �� ���� �������� ������']");
    //����� �������� �������
    private final By orderDate = By.xpath(".//input[@placeholder = '* ����� �������� �������']");
    // ���� ������
    private final By orderDuration = By.xpath(".//div[text() = '* ���� ������']");
    //����� ����� "������ ������"
    private final By selectBlackColor = By.xpath("//label[contains(@class, 'Checkbox_Label__3wxSf') and contains(text() ,'������ ������')]");
    //����� ����� "����� �������������"
    private final By selectGreyColor = By.xpath("//label[contains(@class, 'Checkbox_Label__3wxSf') and contains(text() ,'����� �������������')]");
    // ����������� ��� �������
    private final By orderComment = By.xpath(".//input[@placeholder = '����������� ��� �������']");
    // ������ ������������� ������
    private final  By consentButton =By.xpath(".//button[contains(@class, 'Button_Button__ra12g Button_Middle__1CSJM') and contains(text() ,'��')]");
    // ���� ������������� ������
    private final By consentWindow = By.xpath("//div[contains(@class, 'Order_ModalHeader__3FDaJ') and contains(text() ,'����� ��������')]");

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
