package SwagLabs;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage extends CommonAPI {

    @Test

    public void UsingCorrectEmailandPassword(){



        type("#user-name","standard_user");
        type("#password","secret_sauce");
        click("#login-button");
        waitFor(5);


    }



}
