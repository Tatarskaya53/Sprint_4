package ru.yandex.uitest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class MainPageElements {

    public MainPageElements(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;

    //Блок вопросов для теста ("Вопросы о важном")
    private final By blockOfQuestions = By.className("Home_FAQ__3uVm4");

    public MainPageElements scrollBlockOfQuestions() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(blockOfQuestions));
        return this;
    }
    public MainPageElements clickBlockOfQuestions(String question){
        driver.findElement(By.xpath("//*[text()='" + question + "']")).click();
        return this;
    }

    public boolean consentBlockOfQuestions(String answer){
        driver.findElement(By.xpath("//*[text()='" + answer + "']")).isDisplayed();
        return true;
    }

}
