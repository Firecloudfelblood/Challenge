package com.erivalaxl.Challenge;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.*;

public class MicrosoftCartPageTest {
    private final MainPage mainPage = new MainPage();

    @Test
    public void selectQty(){
        mainPage.select.selectOptionByValue("20");
        assertEquals("20", mainPage.select.getSelectedValue());

    }

    @Test
    public void priceOfTwety(){
        double price = Double.valueOf($(byXpath(mainPage.TWENTY_ITEMS_PRICE)).text().replace("$", "").replace(",",""));
        double searchPrice = 1199.00;

        System.out.println(price);
        System.out.println(searchPrice);
        assertEquals(searchPrice * 20, price);
    }


}
