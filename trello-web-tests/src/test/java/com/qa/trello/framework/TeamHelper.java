package com.qa.trello.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamHelper  {
    public TeamHelper(WebDriver wd) {
        super(wd);
    }

    public void fillForm(String nameOfTeam, By locatorTeamType) {
        type(By.cssSelector("[class='_1CLyNodCAa-vQi']"), nameOfTeam);
        click(By.id("teamTypeSelect"));
        click(locatorTeamType);

    }

    public void confirmTeamCreation() {
        click(By.cssSelector("[type='submit']"));
        click(By.cssSelector("[class='eg0KI5SqghoOFd']"));
    }

    public void initTeamCreation() {
        click(By.cssSelector("[class='icon-add icon-sm _2aV_KY1gTq1qWc']"));
    }
}
