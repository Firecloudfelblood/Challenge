package com.erivalaxl.Challenge;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.*;

import java.util.List;

import static org.testng.Assert.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MicrosoftMainPageTest {
    private final MainPage mainPage = new MainPage();

    @BeforeClass
    public static void setUpAllure() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeMethod
    public void setUp() {
        Configuration.startMaximized = true;
        open(mainPage.URL);
    }

    @Test
    public void toolsMenu() {
        $(byId(mainPage.MENU_ID+"1")).shouldBe(visible);
    }

    @Test
    public void validateMenuItems(List<String> expectedItems) {
        boolean itemsExist = true;
        for (int i = 1; i < expectedItems.size()-1; i++) {
            if(!expectedItems.get(i).equals($(byId(mainPage.MENU_ID+i)).getText()) ){
                itemsExist=false;
            }
        }
        if(! expectedItems.get(6).equals($(byId(mainPage.MENU_ID_SUPPORT)).getText())){
            itemsExist = false;
        }
        assertTrue(itemsExist);
    }
    @Test
    public void goToWindowsPage(){
        mainPage.windows.click();
        assertTrue(mainPage.windowsTen.exists());
    }
}
