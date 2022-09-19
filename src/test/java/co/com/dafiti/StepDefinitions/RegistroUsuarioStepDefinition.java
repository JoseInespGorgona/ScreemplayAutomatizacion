package co.com.dafiti.StepDefinitions;

import co.com.dafiti.Questions.ValidarInicioSesion;
import co.com.dafiti.Tasks.RegistroUsuarioTask;
import co.com.dafiti.UserInterfaces.RegistroUsuario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistroUsuarioStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor demjose = Actor.named("demjose");
    @Before
    public void configuracion(){
        demjose.can(BrowseTheWeb.with(navegador));
        }

    @After
    public void cerrarNavegador(){
        navegador.close();
    }

    @Dado("que el usuario se encuentre en la pagina Dafiti")
    public void queElUsuarioSeEncuentreEnLaPaginaDafiti() {
        demjose.attemptsTo(Open.browserOn(new RegistroUsuario()));
    }

    @Cuando("ingrese a la al registro y llene todos las datos")
    public void ingreseALaAlRegistroYLleneTodosLasDatos() {
        demjose.wasAbleTo(RegistroUsuarioTask.datosRegistrarUsuario());
    }

    @Entonces("se visualizara un saludo del usuario logueado")
    public void seVisualizaraUnSaludoDelUsuarioLogueado() {
        demjose.should(seeThat("El usuario puede ver",
                ValidarInicioSesion.validarSesion(), Matchers.equalTo(true)));
    }
}
