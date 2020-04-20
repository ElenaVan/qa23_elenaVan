package com.qa.trello;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TeamDeletionTests extends TestBase {
    @Test
    public void myTeams(){
        click(By.xpath("[data-test-id='home-team-tab-name']"));
    }
    public void sittingsOfTeams(){
        click(By.cssSelector("._1uWLDFWlmhvDog"));
    }

    public void deletionTeams(){
        click(By.cssSelector(".quiet-button"));
    }


}