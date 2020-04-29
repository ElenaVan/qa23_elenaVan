package com.qa.trello.tests;

import com.qa.trello.tests.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TeamDeletionTests extends TestBase {
    @Test
    public void myTeams(){
        app.getTeam().click(By.xpath("[data-test-id='home-team-tab-name']"));
    }
    public void sittingsOfTeams(){
        app.getTeam().click(By.cssSelector("._1uWLDFWlmhvDog"));
    }

    public void deletionTeams(){
        app.getTeam().click(By.cssSelector(".quiet-button"));
    }


}