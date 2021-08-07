package tareas;

import iu.PaginaInicioSesion;
import iu.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesionTask implements Task {
    private String usuario;
    private String password;

    public IniciarSesionTask(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public static IniciarSesionTask con(String usuario, String password) {
        return instrumented(IniciarSesionTask.class, usuario, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaPrincipal.BTN_SIGN_IN),
                WaitUntil.the(PaginaInicioSesion.TXT_USERNAME, WebElementStateMatchers.containsText("")),
                WaitUntil.the(PaginaInicioSesion.TXT_PASSWORD, WebElementStateMatchers.containsText("")),
                WaitUntil.the(PaginaInicioSesion.BTN_LOGIN, WebElementStateMatchers.isEnabled()),
                Enter.theValue(this.usuario).into(PaginaInicioSesion.TXT_USERNAME),
                WaitUntil.the(PaginaInicioSesion.TXT_USERNAME, WebElementStateMatchers.hasValue(this.usuario)),
                Enter.theValue(this.password).into(PaginaInicioSesion.TXT_PASSWORD),
                WaitUntil.the(PaginaInicioSesion.TXT_PASSWORD, WebElementStateMatchers.hasValue(this.password)),
                Click.on(PaginaInicioSesion.BTN_LOGIN)
        );
    }
}
