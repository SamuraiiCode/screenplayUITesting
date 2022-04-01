package co.com.saucedemo.certification.questions;

import co.com.saucedemo.certification.userinterfaces.LogInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateErrorLogIn implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return LogInPage.ERROR_MESSAGE.resolveFor(actor).getTextContent().contains("Epic sadface: Sorry, this user has been locked out.");
    }
    public static Question<Boolean> ValidateErrorLogIn(){
        return new ValidateErrorLogIn();
    }
}
