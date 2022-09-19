package co.com.dafiti.Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/RegistroUsuario.feature",
        glue = "co.com.dafiti.StepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RegistroUsuarioRunner {
}
