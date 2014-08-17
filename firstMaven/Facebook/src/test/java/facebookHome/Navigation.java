package facebookHome;

import Common.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by israt on 8/16/2014.
 */
public class Navigation extends CommonApi {

    @Test
    public void test1() throws InterruptedException {


        List<WebElement> navTabLinks = getWebElements(".fb_logo.img.sp_9vUokIDmpP8.sx_15c231");
        System.out.println(navTabLinks.size());
        for(int i = 1; i<navTabLinks.size(); i++){
            if(i==1 || i==14 ||i==15){
                navTabLinks.get(i).findElement(By.tagName("a")).click();
                navigateBack();
                sleep(3);

            }else{

                navTabLinks.get(i).findElement(By.tagName("a")).click();
                if(i==5 || i==6){
                    navTabLinks = getWebElements(".fb_logo.img.sp_9vUokIDmpP8.sx_15c231");
                    System.out.println("---------------" +navTabLinks.get(i).getText()+"------------");
                    clickByXpath("html/body/div[1]/div[1]/div/div/div/div/div");

                }      sleep(4);
                navTabLinks = getWebElements(".fb_logo.img.sp_9vUokIDmpP8.sx_15c231");

            }


        }
    }





}


//        List<WebElement> tab = getWebElements(".fb_logo.img.sp_9vUokIDmpP8.sx_15c231");
//        for(int i=0; i<tab.size(); i++){
//            if(i==1||i==14||i==15){
//
//                tab.get(i).findElement(By.tagName("a")).click();
//                navigateBack();
//                sleep(2);
//            }else{
//                tab.get(i).findElement(By.tagName("a")).click();
//                sleep(2);
//            }
//
//            tab =getWebElements(".fb_logo.img.sp_9vUokIDmpP8.sx_15c231");
//        }
//
//    }
//}
