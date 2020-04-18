package com.qa.trello;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BoardDeletionTests extends TestBase{
    @Test
    public void testBoardDeletion(){
        openFirstPersonalBoard();
        clickMoreButton();
       initBoardDeletionInBoardMenu();

        permanentlyDeletBoard();
        returnToHomePage();


        }

    public void permanentlyDeletBoard() {
        click(By.cssSelector(".js-delete"));
        confirm();
    }

    public void initBoardDeletionInBoardMenu() {
        clickCloseBoardFromMoreMenu();
        confirm();

   }

   public void confirm() {
        click(By.cssSelector(".js-confirm "));
    }

    public void clickCloseBoardFromMoreMenu() {
        click(By.cssSelector(".js-close-board"));
    }

    public void clickMoreButton() {
        click(By.cssSelector(".js-open-more"));
    }


    public void openFirstPersonalBoard() {
        click(By.xpath("//*[@class='icon-lg icon-member']/../../..//li"));
    }
}

