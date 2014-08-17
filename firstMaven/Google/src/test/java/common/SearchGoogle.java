package common;
import Common.CommonApi;
import org.testng.annotations.Test;

/**
 * Created by israt on 8/16/2014.
 */
class SearchGoogle extends CommonApi {

    @Test

   public void searchBox()throws InterruptedException{
            typeByCss("#gs_htif0", "selenium");
            clickByXpath("//*[@id='gbqfb']");
            sleep(3);
        }
    }