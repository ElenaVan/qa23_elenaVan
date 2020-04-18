package com.qa.trello;

import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase{


    @Test
    public void testBoardCreation() {



        newBoardCreation("qa23");

        returnToHomePage();


    }


}
