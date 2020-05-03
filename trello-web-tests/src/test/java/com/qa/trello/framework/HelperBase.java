package com.qa.trello.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.name;

public class HelperBase {
    WebDriver wd ;
    WebDriverWait wait;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void type(By locator, String text) {
        waitForElementLocatedAndClick(locator, 20);
        wd.findElement(locator).clear();

        wd.findElement(locator).sendKeys(text);
    }

    public void click(By locator, int timeOut) {
        // wd.findElement(locator).click();
      new WebDriverWait(wd,timeOut).until(ExpectedConditions.presenceOfElementLocated(locator)).click();
    }

    public void confirm() {
        click(cssSelector(".js-confirm "));
    }

    public void returnToHomePage() {
        click(By.xpath("//*[@name='house']/.."));
    }
    public boolean isElementPresent(By locator) {
        return wd.findElements(locator).size() > 0;
    }
    public void waitForElementLocatedAndClick(By locator, int timeOut) {
        new WebDriverWait(wd, timeOut)
                .until(ExpectedConditions.presenceOfElementLocated(locator)).click();
    }
    }

