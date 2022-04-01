package co.com.saucedemo.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Cart {
    public static final Target BUTTON_CHECKOUT = Target.the("button checkout")
            .located(By.id("checkout"));
    public static final Target FIRST_NAME = Target.the("first name")
            .located(By.id("first-name"));
    public static final Target LAST_NAME = Target.the("first name")
            .located(By.id("last-name"));
    public static final Target POSTAL_CODE = Target.the("first name")
            .located(By.id("postal-code"));
    public static final Target BUTTON_CONTINUE = Target.the("button continue")
            .located(By.id("continue"));
    public static final Target BUTTON_FINISH = Target.the("button finish")
            .located(By.id("finish"));
    public static final Target COMPLETE_PURCHASE = Target.the("message complete purchase")
            .locatedBy("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]");


}
