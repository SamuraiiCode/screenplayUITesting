package co.com.saucedemo.certification.questions;

import co.com.saucedemo.certification.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateAddProduct implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return MainPage.CART_PRODUCT.resolveFor(actor).getTextContent().contains("Sauce Labs Fleece Jacket");
    }
    public static Question<Boolean> ValidateAddProduct(){
        return new ValidateAddProduct();
    }
}
