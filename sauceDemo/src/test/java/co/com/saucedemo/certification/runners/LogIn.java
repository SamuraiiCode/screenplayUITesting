package co.com.saucedemo.certification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/log_in.feature",
glue = "co.com.saucedemo.certification.stepdefinitions",
snippets = SnippetType.CAMELCASE,tags = "")
public class LogIn {

}
