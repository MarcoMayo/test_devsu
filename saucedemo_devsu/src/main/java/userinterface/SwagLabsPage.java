package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SwagLabsPage {
    public static final Target ADD_CART = Target.the("ADD {0} to cart")
            .locatedBy("//button[contains(@id,'add-to-cart') and contains(@id,'{0}')]");
    public static final Target BUTTON_CART = Target.the("button cart")
            .located(By.id("shopping_cart_container"));

}
