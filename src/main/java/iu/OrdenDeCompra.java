package iu;

import net.serenitybdd.screenplay.targets.Target;

public class OrdenDeCompra {
    public static final Target LBL_DETAILS = Target.the("Label que indica los detalles del pago")
            .locatedBy("//th[normalize-space()='Payment Details']");

    public static final Target LBL_ADDRESS = Target.the("Label que indica los datos de la direccion de envio")
            .locatedBy("//th[normalize-space()='Billing Address']");

    public static final Target LIST_CARD = Target.the("Lista de tipos de tarjetas")
            .locatedBy("//select[@name='order.cardType']");

    public static final Target TXT_CARD_NUMBER = Target.the("Textbox para ingresar el numero de tarjeta")
            .locatedBy("//input[@name='order.creditCard']");

    public static final Target BTN_CONTINUE = Target.the("Boton para continuar con la compra")
            .locatedBy("//input[@name='newOrder']");

    public static final Target LBL_CONFIRM = Target.the("Label que nos pide que confirmemos nuestra compra")
            .locatedBy("//div[@id='Catalog']");

    public static final Target BTN_CONFIRM = Target.the("Boton para confirmar la compra")
            .locatedBy("//a[normalize-space()='Confirm']");

    public static final Target LBL_COMPRA = Target.the("Label que nos indica que nuestra compra ha sido enviada")
            .locatedBy("//li[normalize-space()='Thank you, your order has been submitted.']");
}

