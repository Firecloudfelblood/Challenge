package com.erivalaxl.Challenge;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.*;

public class MicrosoftWindowsPageTest {
    private final MainPage mainPage = new MainPage();

    @Test
    public void windowsPage(){
       assertTrue( mainPage.windowsTen.exists());
    }
    @Test
    public void clickWinTen(){
        mainPage.windowsTen.click();
        assertTrue($(byId(mainPage.GET_WINDOWS)).exists());
    }

    @Test
    public void printElements(){
        for (int i = 55; i < 65; i++) {
            System.out.println($(byId(mainPage.WINDOWS_TEN_MENU+i)).getText());
        }
        assertTrue($(byId(mainPage.WINDOWS_TEN_MENU+64)).exists());
    }
    @Test
    public void displaySearchBox(){
        mainPage.search.click();
        assertTrue(mainPage.searchTextBox.exists());
    }

    @Test
    public void doSearch(){
        mainPage.search.click();
        mainPage.searchTextBox.sendKeys(mainPage.VISUAL_STUDIO);
        mainPage.search.click();
        mainPage.stayInUs.click();
        assertTrue(mainPage.searchResult.exists());
    }
}
