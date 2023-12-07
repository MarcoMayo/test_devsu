package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {
    public static final Target FIRST_NAME = Target.the("First name input").located(By.id("first-name"));
    public static final Target LAST_NAME = Target.the("Last name input").located(By.id("last-name"));
    public static final Target POSTAL_CODE = Target.the("Postal code input").located(By.id("postal-code"));
    public static final Target CONTINUE_BUTTON = Target.the("Continue button").located(By.id("continue"));
    public static final Target FINISH_BUTTON = Target.the("Finish button").located(By.id("finish"));
    public static final Target TEXT_FINISH = Target.the("Finish text").located(By.className("complete-header"));
    public static final Target TOTAL_TEXT = Target.the("Total").locatedBy("//*[@class='summary_info_label summary_total_label']");
}
