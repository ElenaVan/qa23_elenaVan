package com.qa.trello;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

public class TeamCreationTests  extends  TestBase{


    @Test
    public void testTeamCreation() throws InterruptedException {

        initTeamCreation();
        fillForm("Team_test", By.cssSelector("[class='_38pq5NbRWAG39y']"));
        confirmTeamCreation();
        Thread.sleep(2000);
        returnToHomePage();
    }



    }




    





















