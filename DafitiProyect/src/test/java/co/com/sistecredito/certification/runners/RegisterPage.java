package co.com.sistecredito.certification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register.feature",
glue = "co.com.sistecredito.certification.stepDefinitions",
snippets = SnippetType.CAMELCASE)

public class RegisterPage {
}
