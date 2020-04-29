package com.qa.trello.framework;

import com.qa.trello.framework.HelperBase;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.*;

public class BoardHelper extends HelperBase {

    public BoardHelper(WebDriver wd) {
        super(wd);
    }

    public void newBoardCreation(String text) {
        initCreateBoard();
        fillBoardForm(text);
        confirmBoardCriation();

    }

    public void confirmBoardCriation() {
        click(cssSelector("button._3UeOvlU6B5KUnS"));
    }

    public void fillBoardForm(String text) {
        type(cssSelector("input._23NUW98LaZfBpQ"), text);
        click(cssSelector("[name='check']"));
    }

    public void initCreateBoard() {
        click(name("add"));
        click(xpath("//span[contains(text(),'Create Board')]"));
    }

    public void permanentlyDeletBoard() {
        click(cssSelector(".js-delete"));
        confirm();
    }

    public void initBoardDeletionInBoardMenu() {
        clickCloseBoardFromMoreMenu();
        confirm();

    }

    public void clickCloseBoardFromMoreMenu() {
        click(cssSelector(".js-close-board"));
    }

    public void clickMoreButton() {
        click(cssSelector(".js-open-more"));
    }

    public void openFirstPersonalBoard() {
        click(xpath("//*[@class='icon-lg icon-member']/../../..//li"));
    }

    public int getBoardsCount() {
        return wd.findElements(xpath("//*[@class='icon-lg icon-member']/../../..//li")).size() - 1;
    }

    public void createBoard() {
        initCreateBoard();
        fillBoardForm("yy");
        confirmBoardCriation();
        returnToHomePage();
    }

    public void changeBackground(){
        click(cssSelector(".js-change-background"));
        click(cssSelector(".js-bg-photos"));
        click(xpath("//div[@id='surface']//div[8]//span[1]"));
    }


}
