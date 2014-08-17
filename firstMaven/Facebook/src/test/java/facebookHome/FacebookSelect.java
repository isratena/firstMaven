package facebookHome;

import Common.CommonApi;
import org.testng.annotations.Test;

/**
 * Created by israt on 8/14/2014.
 */
public class FacebookSelect extends CommonApi {
    @Test
    public void signIn()throws InterruptedException{
        typeByCss("#email", "novemberrain2424@gmail.com");
        typeByCss("#pass", "pocha24");
        enterKeys("#pass");
        sleep(3);
    }


}
