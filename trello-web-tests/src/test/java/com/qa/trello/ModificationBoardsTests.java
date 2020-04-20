package com.qa.trello;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ModificationBoardsTests extends TestBase {
    @BeforeMethod
    public void ensurePreconditions(){
        if(getBoardsCount()==0){
            createBoard();
        }
    }
    @Test
    public void modifiBoards(){
   openFirstPersonalBoard();
   changeBackground();
   returnToHomePage();

}

}

