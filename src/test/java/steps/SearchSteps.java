package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;
import pages.SearchResultsPage;

public class SearchSteps {
    @Given("Main booking page opened")
    public void main_booking_page_opened() {
        MainPage mainPage = new MainPage();
        mainPage.openMainPage();
    }
    @When("User enters the hotel name {string}")
    public void user_enters_the_hotel_name(String hotelName) {
        MainPage mainPage = new MainPage();
        mainPage.searchForTheHotel(hotelName);
    }
    @When("Clicks {string} button")
    public void clicks_button(String buttonName) {
        MainPage mainPage = new MainPage();
        mainPage.clickSearchButton(buttonName);
    }
    @Then("{string} hotel presents on page")
    public void hotel_presents_on_page(String hotelName) {
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        Assert.assertTrue(searchResultsPage.hotelPresentsOnPage(hotelName), "Hotel doesn't present on page");
    }

    @Then("Hotel is valued at {string}")
    public void hotelIsValuedAt(String numberOfStars) {
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        String totalStars = Integer.toString(searchResultsPage.numberOfStars());
        Assert.assertEquals(totalStars, numberOfStars, "Number of stars is not the same");
    }
}
