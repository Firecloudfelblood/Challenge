package com.erivalaxl.Challenge;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public SelenideElement seeAllToolsButton = $("a.wt-button_mode_primary");
    public SelenideElement toolsMenu = $x("//div[contains(@class, 'menu-main__item') and text() = 'Tools']");
    public SelenideElement searchButton = $(".js-nav-menu");
    public SelenideElement windows = $("#shellmenu_2");
    public SelenideElement windowsTen = $("#c-shellmenu_54");
    public SelenideElement search = $("#search");
    public SelenideElement searchTextBox = $("#cli_shellHeaderSearchInput");
    public SelenideElement searchResult = $("#coreui-productplacement-30l7ywa_0");
    public SelenideElement notinterested = $(".glyph-cancel");
    public SelenideElement productPrice = $(".pi-price-text");
    public SelenideElement addToCart = $("#buttonPanel_AddToCartButton");
    public SelenideElement select = $("select");
    public SelenideElement carQty = $(".shopping-cart-amount");
    public SelenideElement stayInUs =$("#R1MarketRedirect-close");


//    CONSTANTS
    public final String URL ="https://www.microsoft.com/en-us/";
    public final String MENU_ID = "shellmenu_";
    public final String MENU_ID_SUPPORT ="l1_support";
    public final String GET_WINDOWS = "c-shellmenu_55";
    public final String WINDOWS_TEN_MENU = "c-shellmenu_"; //55-64
    public final String VISUAL_STUDIO = "visual studio";
    public final String FIRST_PRICE = "//*[@id=\"coreui-productplacement-30l7ywa_0\"]/div/div/span[3]/span[1]";
    public final String SECOND_PRICE = "//*[@id=\"coreui-productplacement-30l7ywa_1\"]/div/div/span[3]/span[1]";
    public final String THIRD_PRICE = "//*[@id=\"coreui-productplacement-30l7ywa_2\"]/div/div/span[3]/span[1]";
    public final String CHANGE_STORE = "#R1MarketRedirect-1 :first-child";
    public final String TWENTY_ITEMS_PRICE ="//*[@id=\"store-cart-root\"]/div/div/div/section[2]/div/div/div[2]/div/span/span[2]/strong/span";
    public final String NOSUSCRIBE ="//*[@id=\"email-newsletter-dialog\"]/div[3]/div[1]";

//    PRICE VAR
    public final String EXPECTED_PRICE = "1,199.00";
    public String firstPrice = "" ;

}
