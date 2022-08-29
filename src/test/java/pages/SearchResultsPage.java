package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {

    private String HOTEL_NAME_PATH = "//div[contains(text(), '%s')]";

    public boolean hotelPresentsOnPage(String hotelName) {
        String hotelNameXpath = String.format(HOTEL_NAME_PATH, hotelName);
        return $(By.xpath(hotelNameXpath)).isDisplayed();

    }

    public int numberOfStars(){
        return $$(By.xpath("//div[@data-testid='property-card'][1]//div[@data-testid='rating-stars']//span")).size();
    }

}
