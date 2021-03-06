package com.indra.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/automationpractice/registro_us/registro_user.feature"
        ,glue = "com.indra.stepsDefinitions"
        ,snippets = SnippetType.CAMELCASE
//        ,tags = ""
)
public class RegisterUserRunners {

}
