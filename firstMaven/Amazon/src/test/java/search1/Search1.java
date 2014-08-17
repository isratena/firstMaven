package search1;

import Common.CommonApi;
import org.testng.annotations.Test;

//import static java.lang.Thread.sleep;

/**
 * Created by israt on 8/16/2014.
 */
public class Search1 extends CommonApi {

    @Test
    public void searchBox()throws InterruptedException{
        typeByCss("#twotabsearchtextbox", "iphone");
        clickByXpath("//*[@id='nav-searchbar']/div[1]/input");
        sleep(3);
    }


}
