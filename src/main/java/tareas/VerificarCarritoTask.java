package tareas;

import iu.CarritoDeCompras;
import iu.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerificarCarritoTask implements Task {
    public VerificarCarritoTask() {
    }

    public static VerificarCarritoTask con() {
        return instrumented(VerificarCarritoTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaPrincipal.LINK_CARRITO),
                WaitUntil.the(CarritoDeCompras.LBL_CARRITO, WebElementStateMatchers.containsText("Your cart is empty.")),
                Click.on(PaginaPrincipal.LINK_PRINCIPAL)
        );
    }
}
