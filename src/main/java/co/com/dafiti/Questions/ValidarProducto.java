package co.com.dafiti.Questions;

import co.com.dafiti.UserInterfaces.ValidarProductoCarritoCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarProducto implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        return ValidarProductoCarritoCompra.MSJ_NUMERO_PRODUCTO.resolveFor(actor).isVisible();
    }
    public static Question validarProducto(){
        return new ValidarProducto();
    }
}
