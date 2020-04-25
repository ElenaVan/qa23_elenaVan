package com.qa.trello;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase {


    @Test
    public void testBoardCreation() {
        int before = app.getBoardsCount();

        app.newBoardCreation("qa23");

        app.returnToHomePage();
        int after = app.getBoardsCount();
        Assert.assertEquals(after, before + 1);


    }


}
