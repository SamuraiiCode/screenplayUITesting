package co.com.saucedemo.certification.tasks;

import co.com.saucedemo.certification.userinterfaces.Cart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterInfo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Click.on(Cart.BUTTON_CHECKOUT),
               Enter.theValue("Standard").into(Cart.FIRST_NAME),
               Enter.theValue("User").into(Cart.LAST_NAME),
               Enter.theValue("00000").into(Cart.POSTAL_CODE),
               Click.on(Cart.BUTTON_CONTINUE)
       );
    }
    public static EnterInfo enterInfo(){
        return instrumented(EnterInfo.class);
    }
}
