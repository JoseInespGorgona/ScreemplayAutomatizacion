package co.com.dafiti.Tasks;

import co.com.dafiti.Utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import java.io.IOException;

import static co.com.dafiti.UserInterfaces.RegistroUsuario.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistroUsuarioTask implements Task {
    Excel excel = new Excel();
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Click.on(BTN_REGISTRAR),
                    Enter.theValue(excel.leerDatosExcel("Datos.xlsx", "Registro", 1, 0)).into(TXT_CORREO),
                    Enter.theValue(excel.leerDatosExcel("Datos.xlsx", "Registro", 1, 1)).into(TXT_CLAVE),
                    Enter.theValue(excel.leerDatosExcel("Datos.xlsx", "Registro", 1, 2)).into(TXT_CONFIRMAR_CLAVE),
                    Enter.theValue(excel.leerDatosExcel("Datos.xlsx", "Registro", 1, 3)).into(TXT_NOMBRES),
                    Enter.theValue(excel.leerDatosExcel("Datos.xlsx", "Registro", 1, 4)).into(TXT_APELLIDOS),
                    Enter.theValue(excel.leerDatosExcel("Datos.xlsx", "Registro", 1, 5)).into(TXT_DOCUMENTO),
                    SelectFromOptions.byVisibleText(excel.leerDatosExcel("Datos.xlsx", "Registro", 1, 6)).from(LST_TIPO_DOCUMENTO),
                    Enter.theValue(excel.leerDatosExcel("Datos.xlsx", "Registro", 1, 7)).into(TXT_DIA),
                    Enter.theValue(excel.leerDatosExcel("Datos.xlsx", "Registro", 1, 8)).into(TXT_MES),
                    SelectFromOptions.byVisibleText(excel.leerDatosExcel("Datos.xlsx", "Registro", 1, 9)).from(LST_ANO),
                    SelectFromOptions.byVisibleText(excel.leerDatosExcel("Datos.xlsx", "Registro", 1, 10)).from(LST_SEXO),
                    Click.on(BTN_ENVIAR)
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static RegistroUsuarioTask datosRegistrarUsuario() {
        return instrumented(RegistroUsuarioTask.class);
    }
}
