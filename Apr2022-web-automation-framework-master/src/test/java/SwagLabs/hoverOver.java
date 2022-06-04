package SwagLabs;

import base.CommonAPI;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.objects.NativeJava.type;

public class hoverOver extends CommonAPI {

    @Test

    public void hoverOverTesting(){

        type("#user-name","standard_user");
        type("#password","secret_sauce");
        click("#login-button");
        click("#react-burger-menu-btn");
        waitFor(2);
        hoverOver("#about_sidebar_link");
        waitFor(5);
    }
}
