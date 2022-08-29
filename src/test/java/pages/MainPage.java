package pages;

import com.codeborne.selenide.SelenideElement;
import constants.Urls;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private SelenideElement SEARCH_BY_DESTINATION_INPUT = $(By.xpath("//div//form//input[@name='ss']"));
    private SelenideElement AUTOCOMPLETE_RESULTS_LIST = $(By.xpath("//ul[@data-testid='autocomplete-results']//div[contains(text(), 'Lombardy')]"));

    private String SEARCH_BUTTON_PATH = "//button[@type='submit']//span[contains(text(),'%s')]";

    public MainPage openMainPage() {
        open(Urls.MAIN_PAGE_URL);
        return this;

    }

    public MainPage searchForTheHotel(String hotelName) {
        SEARCH_BY_DESTINATION_INPUT.sendKeys(hotelName);
        AUTOCOMPLETE_RESULTS_LIST.hover().click();
        return this;
    }

    public SearchResultsPage clickSearchButton(String buttonName) {
        String searchButtonXpath = String.format(SEARCH_BUTTON_PATH, buttonName);
        $(By.xpath(searchButtonXpath)).click();
        return new SearchResultsPage();

    }

}
