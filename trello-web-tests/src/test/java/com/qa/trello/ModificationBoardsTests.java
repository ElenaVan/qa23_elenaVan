package com.qa.trello;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ModificationBoardsTests extends TestBase {
    @BeforeMethod
    public void ensurePreconditions(){
        if(app.getBoardsCount()==0){
            app.createBoard();
        }
    }
    @Test
    public void modifiBoards(){
   app.openFirstPersonalBoard();
   app.changeBackground();
   //changeName();
   app.returnToHomePage();


}

    public void changeName() {
        app.wd.findElement(By.cssSelector(".js-rename-board"));
      app.wd.findElement(By.cssSelector("input.js-board-name-input")).sendKeys("rrur"+ Keys.ENTER);
        //type(By.cssSelector(".js-rename-board"), "rrr"+ Keys.ENTER);

    }

}

