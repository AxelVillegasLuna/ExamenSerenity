package definicionPasos;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.core.StringContains;
import org.hamcrest.text.IsEqualIgnoringWhiteSpace;
import preguntas.MensajeBienvenidaUsuario;
import preguntas.MensajeErrorIniciarSesion;
import tareas.IniciarSesionTask;
import tareas.VerificarCarritoTask;

public class IniciarSesionSteps {
    private final String nombre_actor = "Axel";

    @Cuando("inicio sesion con los valores {string} y {string}")
    public void inicio_sesion_con_los_valores_y(String usuario, String password) {
        OnStage.theActor(this.nombre_actor).attemptsTo(
                IniciarSesionTask.con(usuario, password)
        );
    }

    @Entonces("se visualiza el texto {string}")
    public void se_visualiza_el_texto(String mensaje) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("Mensaje de error al iniciar sesion con credenciales incorrectas",
                        MensajeErrorIniciarSesion.contenidoMensaje(),
                        IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace(mensaje)
                )
        );
    }

    @Entonces("ingrese correctamente a mi usuario")
    public void ingrese_correctamente_a_mi_usuario() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("Mensaje de bienvenida al usuario",
                        MensajeBienvenidaUsuario.contenidoMensaje(),
                        StringContains.containsString("Welcome")
                )
        );

        OnStage.theActor(this.nombre_actor).attemptsTo(
                VerificarCarritoTask.con()
        );


    }
}
