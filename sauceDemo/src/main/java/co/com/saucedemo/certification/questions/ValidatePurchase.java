package co.com.saucedemo.certification.questions;

import co.com.saucedemo.certification.userinterfaces.Cart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidatePurchase implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Cart.COMPLETE_PURCHASE.resolveFor(actor).getTextContent().contains("THANK YOU FOR YOUR ORDER");
    }
    public static Question<Boolean> ValidatePurchase(){
        return new ValidatePurchase();
    }
}
