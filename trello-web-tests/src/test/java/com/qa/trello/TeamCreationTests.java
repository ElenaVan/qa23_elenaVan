package com.qa.trello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.*;

public class TeamCreationTests {
    WebDriver wd = new ChromeDriver();
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wait = new WebDriverWait(wd, 45);
        wd.navigate().to("https://trello.com/");

    }

    @Test
    public void testTeamCreation() {
        initLogin();

        fillloginForm("vanyushkinelena@gmail.com", "felia161075");
        confirmLogin();
        click(id("login"));

        click(cssSelector("button._33CvMKqfH4Yf0j._3SBHBJq0AAxzqg"));
        wd.findElement(cssSelector("._1CLyNodCAa-vQi")).sendKeys("nnn");

        click(cssSelector(".css-3gw83x"));
    }




    


    public void fillloginForm(String userEmail,String password ) {

        type(name("user"), userEmail);
        click(id("password"));
        type(id("password"), password);
    }


    public void confirmLogin() {

        click(id("login"));
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





  //  @AfterMethod
    public void tearDown() {
        wd.quit();
    }


}
