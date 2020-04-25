package com.qa.trello;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
   //changeName();
   returnToHomePage();


}

    public void changeName() {
        wd.findElement(By.cssSelector(".js-rename-board"));
      wd.findElement(By.cssSelector("input.js-board-name-input")).sendKeys("rrur"+ Keys.ENTER);
        //type(By.cssSelector(".js-rename-board"), "rrr"+ Keys.ENTER);

    }

}

