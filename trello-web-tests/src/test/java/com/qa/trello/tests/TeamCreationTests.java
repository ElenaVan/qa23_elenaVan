package com.qa.trello.tests;

import com.qa.trello.tests.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.cssSelector;

public class TeamCreationTests  extends TestBase {


    @Test
    public void testTeamCreation() {

        app.getTeam().initTeamCreation();
        app.getTeam().fillTeamForm("Team_test");
        app.getTeam().confirmTeamCreation();
        app.getTeam().inviteTeamLater();

        app.getTeam().returnToHomePage();


    }


}




    





















