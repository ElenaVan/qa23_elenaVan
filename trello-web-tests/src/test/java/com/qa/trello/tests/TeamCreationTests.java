package com.qa.trello.tests;

import com.qa.trello.tests.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.cssSelector;

public class TeamCreationTests  extends TestBase {


    @Test
    public void testTeamCreation() throws InterruptedException {

        app.getTeam().initTeamCreation();
        app.getTeam().fillForm("Team_test", By.cssSelector("[data-test-id^=header-create-team-type-input] li "));
        inviteTeamLater();
        app.getTeam().confirmTeamCreation();
        Thread.sleep(2000);
        app.returnToHomePage();
    }

    public void inviteTeamLater() {
        if(isElementPresent(By.cssSelector("[data-test-id=show-later-button]"))) {
            app.getTeam().click(cssSelector("[data-test-id=show-later-button]"));
        }
    }


}




    





















