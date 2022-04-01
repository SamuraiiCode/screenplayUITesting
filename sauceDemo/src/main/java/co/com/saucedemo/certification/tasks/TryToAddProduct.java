package co.com.saucedemo.certification.tasks;

import co.com.saucedemo.certification.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TryToAddProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainPage.FLEECE_JACKET_ITEM),
                Click.on(MainPage.NOT_FOUND_ADD)
        );
    }
    public static TryToAddProduct add(){
        return instrumented(TryToAddProduct.class);
    }
}
