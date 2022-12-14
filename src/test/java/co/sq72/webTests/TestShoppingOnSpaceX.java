package co.sq72.webTests;

import co.sq72.fwk.runner.WebTest;
import co.sq72.fwk.web.pages.GoTo;
import co.sq72.fwk.web.pages.Search;
import co.sq72.fwk.web.pages.ShopIt;
import org.testng.annotations.Test;

public class TestShoppingOnSpaceX extends WebTest {
    GoTo goTo = new GoTo();
    Search search = new Search();
    ShopIt shopIt = new ShopIt();

    @Test(testName = "Search for items on SpaceX and shop")
    public void searchAndShopTest(){
        goTo.launchSpaceX("https://shop.spacex.com/").Search();
        search.searchProducts("Space").selectFromResults();
        shopIt.ItemSpecifics();
    }
}
