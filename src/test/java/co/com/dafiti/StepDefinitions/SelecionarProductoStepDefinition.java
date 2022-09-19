package co.com.dafiti.StepDefinitions;

import co.com.dafiti.Questions.ValidarProducto;
import co.com.dafiti.Tasks.SeleccionarProductoTask;
import co.com.dafiti.UserInterfaces.RegistroUsuario;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SelecionarProductoStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor ingGorgona = Actor.named("ingGorgona");

    @Before
    public void configuracion() {
        ingGorgona.can(BrowseTheWeb.with(navegador));
        ingGorgona.attemptsTo(Open.browserOn(new RegistroUsuario()));
    }

    @Cuando("el usuario inicie sesion y escoja los productos")
    public void elUsuarioInicieSesionYEscojaLosProductos() {
        ingGorgona.wasAbleTo(SeleccionarProductoTask.seleccionarProducto());
    }

    @Entonces("se visualizara los productos seleccionados")
    public void seVisualizaraLosProductosSeleccionados() {
        ingGorgona.should(seeThat("El usuario puede ver",
                ValidarProducto.validarProducto(), Matchers.equalTo(true)));
    }
}
