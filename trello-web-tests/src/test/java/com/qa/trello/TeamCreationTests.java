package com.qa.trello;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.cssSelector;

public class TeamCreationTests  extends  TestBase{


    @Test
    public void testTeamCreation() throws InterruptedException {

        app.initTeamCreation();
        app.fillForm("Team_test", By.cssSelector("[data-test-id^=header-create-team-type-input] li "));
        inviteTeamLater();
        app.confirmTeamCreation();
        Thread.sleep(2000);
        app.returnToHomePage();
    }

    public void inviteTeamLater() {
        if(isElementPresent(By.cssSelector("[data-test-id=show-later-button]"))) {
            app.click(cssSelector("[data-test-id=show-later-button]"));
        }
    }
    public boolean isElementPresent(By locator){
       return app.wd.findElements(locator).size()>0;
    }


}




    





















