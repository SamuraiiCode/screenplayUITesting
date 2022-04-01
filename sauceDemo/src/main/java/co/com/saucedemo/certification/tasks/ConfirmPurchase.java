package co.com.saucedemo.certification.tasks;

import co.com.saucedemo.certification.userinterfaces.Cart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConfirmPurchase implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Cart.BUTTON_FINISH)
        );
    }
    public static ConfirmPurchase finish(){
        return instrumented(ConfirmPurchase.class);
    }
}
