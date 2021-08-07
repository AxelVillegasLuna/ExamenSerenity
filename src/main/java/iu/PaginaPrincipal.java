package iu;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipal {
    public static final Target TXT_BUSQUEDA = Target.the("Textbox para realizar una busqueda")
            .locatedBy("//input[@name='keyword']");

    public static final Target BTN_SEARCH = Target.the("Boton para realizar una busqueda")
            .locatedBy("//input[@name='searchProducts']");

    public static final Target BTN_SIGN_IN = Target.the("Boton para ir al formulario de iniciar sesion")
            .locatedBy("//a[normalize-space()='Sign In']");

    public static final Target LBL_ERROR = Target.the("Label que muestra mensaje de error al iniciar sesion")
            .locatedBy("ul[class='messages'] li");

    public static final Target LBL_USERNAME = Target.the("Label de bienvenida")
            .locatedBy("#WelcomeContent");

    public static final Target LINK_CARRITO = Target.the("Link para ir al carrito de compras")
            .locatedBy("//a[@href='/actions/Cart.action?viewCart=']");

    public static final Target LINK_PRINCIPAL = Target.the("Link para ir a la pagina principal")
            .locatedBy("//a[@href='/actions/Catalog.action']");


}
