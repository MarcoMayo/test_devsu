package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import userinterface.CheckoutPage;
import userinterface.HomePage;
import userinterface.ShoppingCartPage;
import userinterface.SwagLabsPage;

public class NavegateToFinishShopping implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SwagLabsPage.BUTTON_CART),
                Click.on(ShoppingCartPage.CHECKOUT),
                SendKeys.of("User QA").into(CheckoutPage.FIRST_NAME),
                SendKeys.of("test").into(CheckoutPage.LAST_NAME),
                SendKeys.of("050042").into(CheckoutPage.POSTAL_CODE),
                Click.on(CheckoutPage.CONTINUE_BUTTON)
        );
    }

    public static final NavegateToFinishShopping successfully(){
        return Tasks.instrumented(NavegateToFinishShopping.class);
    }

}
