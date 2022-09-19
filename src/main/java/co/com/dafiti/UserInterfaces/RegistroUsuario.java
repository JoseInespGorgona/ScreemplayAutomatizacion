package co.com.dafiti.UserInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.dafiti.com.co/")
public class RegistroUsuario extends PageObject {
    public static final Target BTN_REGISTRAR = Target.the("click en registrar")
            .located(By.id("LoginInfoTag"));
    public static final Target TXT_CORREO = Target.the("Ingresar correo")
            .located(By.id("RegistrationForm_email"));
    public static final Target TXT_CLAVE =Target.the("Ingrese clave")
            .located(By.name("RegistrationForm[password]"));
    public static final Target TXT_CONFIRMAR_CLAVE = Target.the("Confirmar clave")
            .located(By.id("RegistrationForm_password2"));
    public static final Target TXT_NOMBRES = Target.the("Ingresar nombres")
            .located(By.id("RegistrationForm_first_name"));
    public static final Target TXT_APELLIDOS = Target.the("Ingresar apellido")
            .located(By.id("RegistrationForm_last_name"));
    public static final Target TXT_DOCUMENTO = Target.the("Ingrese documento")
            .located(By.name("RegistrationForm[identification]"));
    public static final Target LST_TIPO_DOCUMENTO = Target.the("Ingrese tipo de documento")
            .located(By.id("RegistrationForm_identification_type"));
    public static final Target TXT_DIA = Target.the("Ingrese dia")
            .located(By.id("RegistrationForm_day"));
    public static final Target TXT_MES = Target.the("Ingrese mes")
            .located(By.id("RegistrationForm_month"));
    public static final Target LST_ANO = Target.the("Ingrese ano de nacimiento")
            .located(By.id("RegistrationForm_year"));
    public static final Target LST_SEXO = Target.the("Ingrese el sexo")
            .located(By.id("RegistrationForm_gender"));
    public static final Target BTN_ENVIAR = Target.the("click en enviar")
            .located(By.id("createAccountButton"));
}
