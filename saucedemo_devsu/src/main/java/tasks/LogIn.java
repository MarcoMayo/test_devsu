package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import userinterface.HomePage;

public class LogIn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("standard_user").into(HomePage.LOGIN_USER),
                SendKeys.of("secret_sauce").into(HomePage.LOGIN_PASS),
                Click.on(HomePage.LOGIN_BUTTON)
        );
    }

    public static LogIn successfully(){
        return Tasks.instrumented(LogIn.class);
    }

}
