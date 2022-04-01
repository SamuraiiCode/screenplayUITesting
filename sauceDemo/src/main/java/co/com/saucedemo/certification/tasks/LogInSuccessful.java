package co.com.saucedemo.certification.tasks;

import co.com.saucedemo.certification.userinterfaces.LogInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogInSuccessful implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("standard_user").into(LogInPage.USER_NAME),
                Enter.theValue("secret_sauce").into(LogInPage.PASSWORD),
                Click.on(LogInPage.LOG_IN_BUTTON)
        );
    }
    public static LogInSuccessful enterInfo(){
        return instrumented(LogInSuccessful.class);
    }
}
