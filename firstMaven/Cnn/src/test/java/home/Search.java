package home;

import Common.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by israt on 8/14/2014.
 */
public class Search extends CommonApi
{
    @Test
    public void searchBox()throws InterruptedException{
        typeByCss("#hdr-search-box", "politics");
        clickByXpath(".//*[@id='hdr-search']/form/div/div[2]/input");
        sleep(3);
    }
}



