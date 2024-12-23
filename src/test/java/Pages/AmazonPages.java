package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept = By.id("sp-cc-accept");
    static By search = By.id("twotabsearchtextbox");
    static By searchButton = By.id("nav-search-submit-button");
    static By appleFilter = By.xpath("//*[@id=\"p_123/110955\"]/span/a/span");
    static By amazonFilter = By.xpath("//*[@id=\"p_98/21345978031\"]/span/a/span/span");
    static By firstProduct =By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] div[class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style'] span:nth-child(1)");
    static By add = By.id("add-to-cart-button");

    static By cart = By.cssSelector("#nav-cart-count");
    static By check = By.cssSelector(".a-truncate-cut");



    public AmazonPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void HomePage() {
    }

    public static void acceptCookie() {
        elementHelper.click(accept);
    }

    public static void clickSearch() {
        elementHelper.click(search);
    }

    public static void writeProduct() {
        elementHelper.sendKey(search,"apple airpods");
    }

    public static void searchButton() {
        elementHelper.click(searchButton);
    }

    public static void filterAmazon() {
        elementHelper.click(amazonFilter);
    }
    public static void filterApple() {
        elementHelper.click(appleFilter);
    }
    public static void firstProduct() {
        elementHelper.click(firstProduct);
    }
    public static void addCart() {
        elementHelper.click(add);
        elementHelper.click(cart);
    }
    public static void checkCart() {
        elementHelper.checkVisible(check);
    }
}
