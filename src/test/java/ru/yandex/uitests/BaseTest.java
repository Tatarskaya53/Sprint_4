package ru.yandex.uitests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;


public class BaseTest {

    WebDriver driver;
    //Адрес URL
    public final String pageUrl = "https://qa-scooter.praktikum-services.ru/";

    @Before
    public void setup() {

        driver = new ChromeDriver();
      //  driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(pageUrl);

    }

    @After
    public void teardown() {
        driver.quit();
    }

}
