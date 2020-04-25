package com.qa.trello;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.cssSelector;

public class BoardDeletionTests extends TestBase {
    @BeforeMethod
    public void ensurePreconditions(){
        if(isOnBoardPage()){
            app.click(cssSelector("[href$=boards]"));
        }


        if(app.getBoardsCount()==0){
            app.createBoard();
        }

    }

    public boolean isOnBoardPage() {
        String url = app.wd.getCurrentUrl();
        return url.contains("boards");
    }

    @Test
    public void testBoardDeletion() {
        int before = app.getBoardsCount();
        app.openFirstPersonalBoard();
        app.clickMoreButton();
        app.initBoardDeletionInBoardMenu();

        app.permanentlyDeletBoard();
        app.returnToHomePage();
        int after = app.getBoardsCount();
        System.out.println("was:" + before + " now: " + after);
        Assert.assertEquals(after, before - 1);


    }


}

