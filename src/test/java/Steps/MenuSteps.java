package Steps;

import com.erivalaxl.Challenge.MicrosoftMainPageTest;
import com.erivalaxl.Challenge.MicrosoftWindowsPageTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class MenuSteps {
    MicrosoftMainPageTest microsoftMainPageTest = new MicrosoftMainPageTest();
    MicrosoftWindowsPageTest microsoftWindowsPageTest = new MicrosoftWindowsPageTest();
    @Given("I navigate to the microsoft page")
    public void iNavigateToTheMicrosoftPage() {
       microsoftMainPageTest.setUp();
    }

    @And("I should see the menu items")
    public void iShouldSeeTheMenuItems() {
        microsoftMainPageTest.toolsMenu();
    }

    @Then("I should validate all menu items are in there")
    public void iShouldValidateAllMenuItemsAreInThere(DataTable table) {
        List<String> items = table.asList();
        microsoftMainPageTest.validateMenuItems(items);

    }

    @Given("I click on the windows link")
    public void iClickOnTheWindowsLink() {
        microsoftMainPageTest.goToWindowsPage();
    }

    @And("I see the windows page")
    public void iSeeTheWindowsPage() {
        microsoftWindowsPageTest.windowsPage();
    }

    @And("I click on the windows10 menu")
    public void iClickOnTheWindowsMenu() {
        microsoftWindowsPageTest.clickWinTen();
    }

    @Then("I print all the elements from the drop down menu")
    public void iPrintAllTheElementsFromTheDropDownMenu() {
        microsoftWindowsPageTest.printElements();
    }
}
