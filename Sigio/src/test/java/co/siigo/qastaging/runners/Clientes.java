package co.siigo.qastaging.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Clientes.feature",
        glue = "co.siigo.qastaging.stepDefinitions",
        tags = "@CrearUsuario",
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Clientes {
}
