package com.qa.trello;

import org.testng.annotations.Test;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

public class TeamCreationTests  extends  TestBase{





    @Test
    public void testTeamCreation() {

        click(cssSelector("button._33CvMKqfH4Yf0j._3SBHBJq0AAxzqg"));
        wd.findElement(cssSelector("._1CLyNodCAa-vQi")).sendKeys("nnn");

        click(id("teamTypeSelect"));


      //  click(cssSelector("_15aIJYNKhrO4vB"));
      //  wd.findElement(cssSelector("_15aIJYNKhrO4vB")).sendKeys("jjj");

        returnToHomePage();

    }




    




















}
