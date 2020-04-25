package com.qa.trello;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

public class TeamCreationTests  extends  TestBase{


    @Test
    public void testTeamCreation() throws InterruptedException {

        initTeamCreation();
        fillForm("Team_test", By.cssSelector("[data-test-id^=header-create-team-type-input] li "));
        inviteTeamLater();
        confirmTeamCreation();
        Thread.sleep(2000);
        returnToHomePage();
    }

    public void inviteTeamLater() {
        if(isElementPresent(By.cssSelector("[data-test-id=show-later-button]"))) {
            click(cssSelector("[data-test-id=show-later-button]"));
        }
    }
    public boolean isElementPresent(By locator){
       return wd.findElements(locator).size()>0;
    }


}




    





















