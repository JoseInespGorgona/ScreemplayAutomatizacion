package co.com.dafiti.UserInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionarProducto extends PageObject {
    public static final Target BTN_INICIAR_SESION = Target.the("Iniciar sesion")
            .located(By.id("LoginInfoTag"));
    public static final Target TXT_USUARIO = Target.the("Ingresar usuario")
            .located(By.id("LoginForm_email"));
    public static final Target TXT_CLAVE = Target.the("Ingrese Clave")
            .located(By.name("LoginForm[password]"));
    public static final Target BTN_ENTRAR = Target.the("Iniciar sesion")
            .located(By.id("loginButton"));
    //Buscar Producto por categoria
    public static final Target BTN_CATEGORIA_NIÑO = Target.the("clic en busqueda categoria niño")
            .located(By.xpath("//a[@class='segment sel-cat-infantil']"));
    public static final Target BTN_SESION_PRODUCTO = Target.the("click en producto")
            .located(By.xpath("(//img[@data-creative='HomeKids_Ropa'])[1]"));
    public static final Target BTN_PRODUCTO = Target.the("seleccionar proucto")
            .located(By.xpath("//li[@id='GA449AT50PRXCO']"));

    public static final Target LST_TALLA = Target.the("Seleccionar talla")
            .located(By.xpath("//div[@class='selectSize mbs loaded']"));

    public static final Target LST_OPCION_TALLA = Target.the("Seleccionar talla")
            .located(By.xpath("//li[@class='prd-option-item opt-item-3']"));
    public static final Target BTN_AGREGAR_CARRITO = Target.the("Agregar producto al carrito")
            .located(By.id("AddToCart"));

    public static final Target TXT_CAMPO_BUSQUEDA = Target.the("Escribir Producto")
            .located(By.id("searchInput"));

    public static final Target BTN_BUSCAR = Target.the("Buscar producto")
            .located(By.xpath("//button[@class='icon-magnifier searchButton sel-search-button']"));

    public static final Target BTN_PRODUCTO_BUSQUEDA = Target.the("Seleccionar producto por busqueda")
            .located(By.xpath("//img[@alt='Niños Crocband™ Clog Color Lavanda Crocs']"));

    public static final Target LST_OPCION_TALLA_ZAPATO = Target.the("Seleccionar talla zapatos")
            .located(By.xpath("//li[@class='prd-option-item opt-item-2']"));

    public static final Target BTN_CARRITO_COMPRA = Target.the("Carrito de compra")
            .located(By.xpath("//span[@class='icon icon-cart']"));

}
