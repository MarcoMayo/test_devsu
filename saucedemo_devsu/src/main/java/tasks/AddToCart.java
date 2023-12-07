package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.SwagLabsPage;

public class AddToCart implements Task {

    private String product1;
    private String product2;

    public AddToCart(String product1, String product2) {
        this.product1 = product1;
        this.product2 = product2;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SwagLabsPage.ADD_CART.of(product1)));
        actor.attemptsTo(Click.on(SwagLabsPage.ADD_CART.of(product2)));
    }

    public static AddToCart products(String product1, String product2){
        return Tasks.instrumented(AddToCart.class, product1, product2);
    }

}
