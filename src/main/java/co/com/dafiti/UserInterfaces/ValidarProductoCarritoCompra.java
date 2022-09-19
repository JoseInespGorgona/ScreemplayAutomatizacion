package co.com.dafiti.UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidarProductoCarritoCompra {
    public static final Target MSJ_NUMERO_PRODUCTO = Target.the("Numero de producto en el carrito de compra")
            .located(By.xpath("//span[.='2']"));
}
