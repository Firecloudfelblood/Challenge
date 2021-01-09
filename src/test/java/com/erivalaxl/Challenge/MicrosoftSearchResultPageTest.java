package com.erivalaxl.Challenge;

import org.testng.Assert;
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
//        $(byCssSelector(mainPage.CHANGE_STORE)).click();
        List<String> prices = new ArrayList<>();
        prices.add($(byXpath(mainPage.FIRST_PRICE)).getText().replace("$",""));
        prices.add($(byXpath(mainPage.SECOND_PRICE)).getText().replace("$",""));
        prices.add($(byXpath(mainPage.THIRD_PRICE)).getText().replace("$",""));

        mainPage.firstPrice = prices.get(0);
        Assert.assertTrue(mainPage.firstPrice.equals(mainPage.EXPECTED_PRICE));
    }

    @Test
    public void clickOnFirstItem(){
        mainPage.searchResult.click();
        mainPage.nosubscribe.click();
        assertTrue(mainPage.productPrice.getText() != null);
    }
    @Test
    public void pricesAreTheSame(){
        String price =  mainPage.productPrice.getText().replace("$","");
        assertEquals(mainPage.firstPrice, price);
    }

    @Test
    public void addToCart(){
        mainPage.addToCart.click();
        assertEquals("1",mainPage.carQty.text());
    }
}
