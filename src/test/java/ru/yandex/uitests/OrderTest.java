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
                .typeCustomersName("ϸ��")
                .typeCustomersFamily("������")
                .typeCustomersAddress("��. ��������")
                .selectCustomersMetro(1) // 1 - 222
                .typeCustomersTelNumber("+79991234567")
                .clickMiddleOrderStatusButton()
                .selectOrderDate("Choose �������, 18-� ������� 2022 �.") // ���� ������ � �������: "Choose �������, 11-� ������� 2022 �."
                .selectDaysCount("���� �����") // ���� ������ � �������: "���������� �����"
                .clickSelectBlackColor()
                .typeOrderComment("��������� �� ���")
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
                .typeCustomersName("����")
                .typeCustomersFamily("������")
                .typeCustomersAddress("���������� �������")
                .selectCustomersMetro(222) // 1 - 222
                .typeCustomersTelNumber("89001234567")
                .clickMiddleOrderStatusButton()
                .selectOrderDate("Choose �������, 19-� ������� 2022 �.") // ���� ������ � �������: "Choose �������, 11-� ������� 2022 �."
                .selectDaysCount("�����") // ���� ������ � �������: "���������� �����"
                .clickSelectGreyColor()
                .typeOrderComment("�� �������")
                .clickMiddleOrderStatusButton()
                .clickConsentButton()
                .consentWindowDisplay();
        assertTrue(result);
    }
}
