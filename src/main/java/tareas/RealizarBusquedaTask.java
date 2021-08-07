package tareas;

import iu.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarBusquedaTask implements Task {
    private String tipo_mascota;

    public RealizarBusquedaTask(String tipo_mascota) {
        this.tipo_mascota = tipo_mascota;
    }

    public static RealizarBusquedaTask con(String tipo_mascota) {
        return instrumented(RealizarBusquedaTask.class, tipo_mascota);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.tipo_mascota).into(PaginaPrincipal.TXT_BUSQUEDA),
                WaitUntil.the(PaginaPrincipal.TXT_BUSQUEDA, WebElementStateMatchers.hasValue(this.tipo_mascota)),
                Click.on(PaginaPrincipal.BTN_SEARCH)
        );

    }
}
