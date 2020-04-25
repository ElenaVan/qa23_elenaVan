package com.qa.trello;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TeamDeletionTests extends TestBase {
    @Test
    public void myTeams(){
        app.click(By.xpath("[data-test-id='home-team-tab-name']"));
    }
    public void sittingsOfTeams(){
        app.click(By.cssSelector("._1uWLDFWlmhvDog"));
    }

    public void deletionTeams(){
        app.click(By.cssSelector(".quiet-button"));
    }


}