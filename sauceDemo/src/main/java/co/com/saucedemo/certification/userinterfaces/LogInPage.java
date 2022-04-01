package co.com.saucedemo.certification.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogInPage {
    public static final Target USER_NAME = Target.the("user name standard user")
            .located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("password")
            .located(By.id("password"));
    public static final Target LOG_IN_BUTTON = Target.the("log in button")
            .located(By.id("login-button"));
    public static final Target ERROR_MESSAGE = Target.the("error message")
            .locatedBy("//h3[contains(text(),'Epic sadface: Sorry, this user has been locked out.')]");


}
