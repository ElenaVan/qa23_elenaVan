package com.telran.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class OpenGoogleTest {
    WebDriver wd;

    @BeforeClass

    public void setUp(){
wd = new ChromeDriver();
wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
wd.get("https://www.google.com/");
    }
    @Test
    public void testOpenGoogle(){

wd.findElement(By.className("gb_D")).click();
wd.findElement(By.className("gb_D")).click();


    }
    @Test
    public void testSearchGoogle() throws InterruptedException {

        click();
        wd.findElement(By.name("q")).clear();
        wd.findElement(By.name("q")).sendKeys("java");
        Thread.sleep(3000);
    }

    private void click() {
    }

    private void click(By locator) {
        locator.findElement(wd).click();
    }
    @Test
    public void testOpenProFile()  throws InterruptedException{
        click(By.id("gb_70"));
        Thread.sleep(3000);
    }
    @AfterClass
    public void tearDown(){
wd.quit();
    }

}
