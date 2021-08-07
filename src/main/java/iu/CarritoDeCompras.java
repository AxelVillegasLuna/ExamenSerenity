package iu;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoDeCompras {
    public static final Target LBL_CARRITO = Target.the("Label que indica el estado del carrito")
            .locatedBy("//b[normalize-space()='Your cart is empty.']");

    public static final Target LBL_SUBTOTAL = Target.the("Label que indica el subtotal de la compra")
            .locatedBy("//td[normalize-space()='Sub Total: $5.29']");

    public static final Target BTN_CHECKOUT = Target.the("Boton para ir al checkout")
            .locatedBy("//a[normalize-space()='Proceed to Checkout']");
}
