package SwagLabs;

import base.CommonAPI;
import org.testng.annotations.Test;

public class MenuBar  extends CommonAPI {


    @Test

    public void menubartesting(){



        type("#user-name","standard_user");
        type("#password","secret_sauce");
        click("#login-button");
        click("#react-burger-menu-btn");
        waitFor(5);
    }
}
