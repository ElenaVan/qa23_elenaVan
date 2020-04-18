package com.qa.trello;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase {


    @Test
    public void testBoardCreation() {
        int before = getBoardsCount();

        newBoardCreation("qa23");

        returnToHomePage();
        int after = getBoardsCount();
        Assert.assertEquals(after, before + 1);


    }


}
