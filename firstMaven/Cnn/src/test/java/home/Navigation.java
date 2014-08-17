package home;

//
// import common.CommonApi;
import Common.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


public class Navigation extends CommonApi {

    @Test
    public void test1() throws InterruptedException {
        List<WebElement> tab = getWebElements("#cnn_hdr-nav li");
        for(int i=0; i<tab.size(); i++){
            if(i==1||i==14||i==15){

                tab.get(i).findElement(By.tagName("a")).click();
                navigateBack();
                sleep(2);
            }else{
                tab.get(i).findElement(By.tagName("a")).click();
                sleep(2);
            }

            tab =getWebElements("#cnn_hdr-nav li");
        }

    }
}