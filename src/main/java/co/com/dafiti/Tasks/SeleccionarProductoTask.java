package co.com.dafiti.Tasks;

import co.com.dafiti.Interactions.EsperaImplicita;
import co.com.dafiti.Utils.Excel;
import io.cucumber.java.an.E;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.io.IOException;

import static co.com.dafiti.UserInterfaces.SeleccionarProducto.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarProductoTask implements Task {
    Excel excel = new Excel();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    /*Click.on(BTN_INICIAR_SESION),
                    Enter.theValue(excel.leerDatosExcel("Datos.xlsx", "Sesion", 1, 0)).into(TXT_USUARIO),
                    Enter.theValue(excel.leerDatosExcel("Datos.xlsx", "Sesion", 1, 1)).into(TXT_CLAVE),
                    Click.on(BTN_ENTRAR),
                    Click.on(BTN_CATEGORIA_NIÑO),
                    Click.on(BTN_SESION_PRODUCTO),
                    Scroll.to(BTN_PRODUCTO),
                    Click.on(BTN_PRODUCTO),
                    Click.on(LST_TALLA),
                    Click.on(LST_OPCION_TALLA),
                    Click.on(BTN_AGREGAR_CARRITO),*/
                    WaitUntil.the(TXT_CAMPO_BUSQUEDA, isVisible()),
                    Enter.theValue(excel.leerDatosExcel("Datos.xlsx", "Buscar", 1, 0)).into(TXT_CAMPO_BUSQUEDA),
                    //SE UTILIZA PARA POSECIONAR EL CURSOR EN EL ELEMENTO
                    //MoveMouse.to()

                    //Click.on(String.valueOf(Keys.ENTER)),
                    //Enter.keyValues(Keys.ENTER),
                   // Click.on(BTN_BUSCAR),
                    Click.on(BTN_PRODUCTO_BUSQUEDA),
                    Click.on(LST_TALLA),
                    Click.on(LST_OPCION_TALLA_ZAPATO),
                    Click.on(BTN_AGREGAR_CARRITO),
                    Click.on(BTN_CARRITO_COMPRA),
                    EsperaImplicita.porEstosSegundos(10)
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static SeleccionarProductoTask seleccionarProducto() {
        return instrumented(SeleccionarProductoTask.class);
    }
}
