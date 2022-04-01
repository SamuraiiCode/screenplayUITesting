package co.com.saucedemo.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    public static final Target USER_NAME = Target.the("products tittle")
            .locatedBy("//span[contains(text(),'Products')]");
    public static final Target FLEECE_JACKET_ADD = Target.the("sauce labs fleece jacket product")
            .located(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    public static final Target NOT_FOUND_ADD = Target.the("sauce labs fleece jacket product")
            .located(By.id("add-to-cart-item-not-found"));
    public static final Target CART_PRODUCT = Target.the("increase number")
            .locatedBy("//div[contains(text(),'Sauce Labs Fleece Jacket')]");
    public static final Target CART_BUTTON = Target.the("cart button")
            .located(By.className("shopping_cart_link"));
    public static final Target NOT_FOUND = Target.the("not found item")
            .locatedBy("//div[contains(text(),'ITEM NOT FOUND')]");
    public static final Target FLEECE_JACKET_ITEM = Target.the("increase number")
            .located(By.id("item_5_title_link"));




}
