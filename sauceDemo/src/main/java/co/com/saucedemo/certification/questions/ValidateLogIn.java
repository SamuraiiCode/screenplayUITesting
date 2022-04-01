package co.com.saucedemo.certification.questions;

import co.com.saucedemo.certification.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateLogIn implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return MainPage.USER_NAME.resolveFor(actor).getTextContent().contains("Products");
    }
    public static Question<Boolean> ValidateLogIn(){
        return new ValidateLogIn();
    }
}
