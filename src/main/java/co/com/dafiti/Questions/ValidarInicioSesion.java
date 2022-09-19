package co.com.dafiti.Questions;

import co.com.dafiti.UserInterfaces.ValidarSesionIniciada;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarInicioSesion implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return ValidarSesionIniciada.MSJ_SESIO_INICIADA.resolveFor(actor).isVisible();
    }
    public static Question validarSesion(){
        return new ValidarInicioSesion();
    }
}
