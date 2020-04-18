package com.qa.trello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.*;

public class TestBase {
    WebDriver wd = new ChromeDriver();
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(wd, 45);
        wd.manage().window().maximize();
        wd.navigate().to("https://trello.com/");
        login("vanyushkinelena@gmail.com", "felia161075");


    }

    public void returnToHomePage() {
        click(name("house"));
        click(name("house"));
    }

    public void newBoardCreation(String text) {
        click(name("add"));
        click(xpath("//span[contains(text(),'Create Board')]"));
        type(cssSelector("input._23NUW98LaZfBpQ"), text);
        click(cssSelector("button._3UeOvlU6B5KUnS"));
        //click(name("house"));
    }

    public void confirmLogin() {
        // wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login"))).click();
        click(id("login"));
    }

    public void fillloginForm(String userEmail, String password) {
        type(name("user"), userEmail);
        click(id("password"));
        type(id("password"), password);
    }

    public void initLogin() {
        click(cssSelector("[href='/login']"));
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        // wd.findElement(locator).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();
    }

     @AfterMethod
    public void tearDown() {
        wd.quit();

    }

    public void login(String email, String password) {
        initLogin();
        fillloginForm(email, password);
        confirmLogin();
    }
}
