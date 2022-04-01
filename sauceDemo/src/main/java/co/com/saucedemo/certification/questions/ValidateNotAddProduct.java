package co.com.saucedemo.certification.questions;

import co.com.saucedemo.certification.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateNotAddProduct implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return MainPage.NOT_FOUND.resolveFor(actor).getTextContent().contains("ITEM NOT FOUND");
    }
    public static Question<Boolean> ValidateNotAddProduct(){
        return new ValidateNotAddProduct();
    }
}
