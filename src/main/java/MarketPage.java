import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MarketPage {

    public SelenideElement getYandexMarketButton() {
        return $(By.xpath("//a[@data-id='market']"));
    }

    public SelenideElement getElectronicaButton() {
        return $$(".n-w-tab__control-caption").findBy(Condition.text("Электроника"));
    }

    public SelenideElement getEarphonesButton() {
        return $(By.xpath("//a[text()='Наушники и Bluetooth-гарнитуры']"));
    }

    public SelenideElement getExtendedSearchButton() {
        return $(By.xpath("//span[text()='Все фильтры']"));
    }

    public SelenideElement getItemSearch() {
        return $("#header-search");
    }

    public SelenideElement getMinPriceInputField() {
        return $("#glf-pricefrom-var");
    }

    public SelenideElement getSearchButton() {
        return $(By.xpath("//span[text()='Показать подходящие']"));
    }

    /* ввод названия первого товара в строку поиска */
    public void searchItem(String item) {
        getItemSearch().sendKeys(item);
    }

    /* массив карточек товаров */

    public ElementsCollection getItemsList() {
        return $$(By.xpath("//div[@class='n-snippet-card2__title']/a"));
    }

    /* подсчет кол-ва карточек товаров на странице */
    public int getNumOfItems() {
        return getItemsList().size();
    }

    /* название марки товара в первой карточке */
    public String getNameOfFirstItem() {
        SelenideElement firstItem = getItemsList().get(0);
        return firstItem.getAttribute("title").substring("Наушники ".length());
    }

    public SelenideElement getSuggestItem() {
        return $(By.xpath("//div[@class='suggest2__group'][1]//span[@class='suggest2-rich-item__text']/b"));
    }

    /* извлечение названия предложенного товара */
    public String getSuggestedItem() {
        return getSuggestItem().getText();
    }


}
