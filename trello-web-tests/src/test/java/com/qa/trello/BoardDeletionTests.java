package com.qa.trello;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.cssSelector;

public class BoardDeletionTests extends TestBase {
    @BeforeMethod
    public void ensurePreconditions(){
        if(isOnBoardPage()){
            click(cssSelector("[href$=boards]"));
        }


        if(getBoardsCount()==0){
            createBoard();
        }

    }

    public boolean isOnBoardPage() {
        String url = wd.getCurrentUrl();
        return url.contains("boards");
    }

    @Test
    public void testBoardDeletion() {
        int before = getBoardsCount();
        openFirstPersonalBoard();
        clickMoreButton();
        initBoardDeletionInBoardMenu();

        permanentlyDeletBoard();
        returnToHomePage();
        int after = getBoardsCount();
        System.out.println("was:" + before + " now: " + after);
        Assert.assertEquals(after, before - 1);


    }


}

