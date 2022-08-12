package ru.yandex.uitests;

import org.junit.Test;
import ru.yandex.uitest.pages.OrderPageElements;

import static org.junit.Assert.assertTrue;

public class OrderTest extends BaseTest {

    @Test
    public void test1() {
        OrderPageElements orderPage = new OrderPageElements(driver);
        boolean result = orderPage
                .clickHeaderOrderStatusButton()
                .typeCustomersName("Пётр")
                .typeCustomersFamily("Петров")
                .typeCustomersAddress("ул. Петровка")
                .selectCustomersMetro(1) // 1 - 222
                .typeCustomersTelNumber("+79991234567")
                .clickMiddleOrderStatusButton()
                .selectOrderDate("Choose четверг, 18-е августа 2022 г.") // Дата заказа в формате: "Choose четверг, 11-е августа 2022 г."
                .selectDaysCount("трое суток") // Срок аренды в формате: "количество суток"
                .clickSelectBlackColor()
                .typeOrderComment("позвонить за час")
                .clickMiddleOrderStatusButton()
                .clickConsentButton()
                .consentWindowDisplay();
        assertTrue(result);
    }

    @Test
    public void test2() {
        OrderPageElements orderPage = new OrderPageElements(driver);
        boolean result = orderPage
                .clickMiddleOrderStatusButton()
                .typeCustomersName("иван")
                .typeCustomersFamily("иванов")
                .typeCustomersAddress("ивановская площадь")
                .selectCustomersMetro(222) // 1 - 222
                .typeCustomersTelNumber("89001234567")
                .clickMiddleOrderStatusButton()
                .selectOrderDate("Choose пятница, 19-е августа 2022 г.") // Дата заказа в формате: "Choose четверг, 11-е августа 2022 г."
                .selectDaysCount("сутки") // Срок аренды в формате: "количество суток"
                .clickSelectGreyColor()
                .typeOrderComment("не звонить")
                .clickMiddleOrderStatusButton()
                .clickConsentButton()
                .consentWindowDisplay();
        assertTrue(result);
    }
}
