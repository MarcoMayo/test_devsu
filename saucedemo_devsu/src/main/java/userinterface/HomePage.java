package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target LOGIN_USER = Target.the("Username input").located(By.id("user-name"));
    public static final Target LOGIN_PASS = Target.the("Parrword input").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("LogIn button").located(By.id("login-button"));

}
