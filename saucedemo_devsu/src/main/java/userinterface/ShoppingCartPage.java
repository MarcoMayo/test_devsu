package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCartPage {
    public static final Target CHECKOUT = Target.the("Checkout button").located(By.id("checkout"));
}
