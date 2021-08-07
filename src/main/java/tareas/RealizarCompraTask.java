package tareas;

import acciones.SelectDropDownListValue;
import iu.Busquedas;
import iu.CarritoDeCompras;
import iu.CatalogoPez;
import iu.OrdenDeCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarCompraTask implements Task {
    private String mascota;
    private String tipo_tarjeta;
    private String nro_tarjeta;

    public RealizarCompraTask(String mascota, String tipo_tarjeta, String nro_tarjeta) {
        this.mascota = mascota;
        this.tipo_tarjeta = tipo_tarjeta;
        this.nro_tarjeta = nro_tarjeta;
    }

    public static RealizarCompraTask con(String mascota, String tipo_tarjeta, String nro_tarjeta) {
        return instrumented(RealizarCompraTask.class, mascota, tipo_tarjeta, nro_tarjeta);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Busquedas.LINK_FISH_CHINA, WebElementStateMatchers.containsText(this.mascota)),
                Click.on(Busquedas.LINK_FISH_CHINA),
                WaitUntil.the(CatalogoPez.LBL_GOLDFISH, WebElementStateMatchers.containsText("Goldfish")),
                Click.on(CatalogoPez.BTN_EST_21),
                WaitUntil.the(CarritoDeCompras.LBL_SUBTOTAL, WebElementStateMatchers.containsText("Sub Total: $5.29")),
                Click.on(CarritoDeCompras.BTN_CHECKOUT),
                WaitUntil.the(OrdenDeCompra.LBL_DETAILS, WebElementStateMatchers.isVisible()),
                WaitUntil.the(OrdenDeCompra.LBL_ADDRESS, WebElementStateMatchers.isVisible()),
                SelectDropDownListValue.valueTarget(OrdenDeCompra.LIST_CARD, this.tipo_tarjeta),
                WaitUntil.the(OrdenDeCompra.LIST_CARD, WebElementStateMatchers.hasValue(this.tipo_tarjeta)),
                Enter.theValue(this.nro_tarjeta).into(OrdenDeCompra.TXT_CARD_NUMBER),
                WaitUntil.the(OrdenDeCompra.TXT_CARD_NUMBER, WebElementStateMatchers.hasValue(this.nro_tarjeta)),
                Click.on(OrdenDeCompra.BTN_CONTINUE),
                WaitUntil.the(OrdenDeCompra.LBL_CONFIRM, WebElementStateMatchers.containsText("Please confirm the information")),
                Click.on(OrdenDeCompra.BTN_CONFIRM)
        );
    }
}
