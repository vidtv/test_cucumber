import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MarketPage {

    public SelenideElement getItemSearch() {
        return $(By.xpath("//input[@id='header-search']"));
    }

    /* ввод названия первого товара в строку поиска */
    public void searchItem(String item) {
        getItemSearch().sendKeys(item);
    }

    public SelenideElement getYandexMarketButton() {
        return $(By.xpath("//a[@data-id='market']"));
    }

    public SelenideElement getElectronicaButton() {
        return $$(".n-w-tab__control-caption").findBy(Condition.text("Электроника"));
    }
}
