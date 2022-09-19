package co.com.dafiti.Interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class EsperaImplicita implements Interaction {
    private int segundos;
    public EsperaImplicita(int segundos) {
        this.segundos = segundos;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static EsperaImplicita porEstosSegundos(int segundos) {
        return Instrumented.instanceOf(EsperaImplicita.class).withProperties(segundos);
    }
}


