package com.erivalaxl.Challenge;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.*;

public class MicrosoftSearchResultPageTest {
    private final MainPage mainPage = new MainPage();

    @Test
    public void getThreePrices(){
        $(byCssSelector(mainPage.CHANGE_STORE)).click();
        List<String> prices = new ArrayList<>();
        prices.add($(byXpath(mainPage.FIRST_PRICE)).getText().replace("$",""));
        prices.add($(byXpath(mainPage.SECOND_PRICE)).getText().replace("$",""));
        prices.add($(byXpath(mainPage.THIRD_PRICE)).getText().replace("$",""));
//        for (String a:prices ) {
            System.out.println(prices);
//        }
        assertEquals(prices.size(), 3);
    }
}
