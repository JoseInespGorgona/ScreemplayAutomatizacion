package co.com.dafiti.UserInterfaces;

import co.com.dafiti.Utils.Excel;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.io.IOException;

public class ValidarSesionIniciada {
    static Excel excel = new Excel();
    public static final Target MSJ_SESIO_INICIADA;

    static {
        try {
            MSJ_SESIO_INICIADA = Target.the("boton de mi cuenta")
                    .located(By.xpath("//span[.='Hola, "+excel.leerDatosExcel("Datos.xlsx","Registro",1,3)+"']"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
