package Steps;

import com.erivalaxl.Challenge.MicrosoftMainPageTest;
import com.erivalaxl.Challenge.MicrosoftSearchResultPageTest;
import com.erivalaxl.Challenge.MicrosoftWindowsPageTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchSteps {
    MicrosoftMainPageTest microsoftMainPageTest = new MicrosoftMainPageTest();
    MicrosoftWindowsPageTest microsoftWindowsPageTest = new MicrosoftWindowsPageTest();
    MicrosoftSearchResultPageTest microsoftSearchResultPageTest = new MicrosoftSearchResultPageTest();
    @And("I save the first price")
    public void iSaveTheFirstPrice() {

    }

    @Given("I go to the search")
    public void iGoToTheSearch() {
        microsoftMainPageTest.setUp();
        microsoftWindowsPageTest.displaySearchBox();
    }

    @And("I search for visual studio")
    public void iSearchForVisualStudio() {
        microsoftWindowsPageTest.doSearch();
    }

    @And("I Store the price of the first {int} items in a list")
    public void iStoreThePriceOfTheFirstItemsInAList(int arg0) {
        microsoftSearchResultPageTest.getThreePrices();
    }

    @And("I click on the first one to go to the details page")
    public void iClickOnTheFirstOneToGoToTheDetailsPage() {
    }

    @Then("I should validate both prices are the same")
    public void iShouldValidateBothPricesAreTheSame() {
    }

    @Given("I click on add to cart")
    public void iClickOnAddToCart() {
    }

    @And("I verify al {int} price amount are the same")
    public void iVerifyAlPriceAmountAreTheSame(int arg0) {
    }

    @And("on the number of items drop down select {int}")
    public void onTheNumberOfItemsDropDownSelect(int arg0) {
    }

    @Then("I verify the total amount is a unit price * {int}")
    public void iVerifyTheTotalAmountIsAUnitPrice(int arg0) {
    }
}
