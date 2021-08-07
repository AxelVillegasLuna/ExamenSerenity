package definicionPasos;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.core.StringContains;
import preguntas.MensajeCompra;
import tareas.RealizarCompraTask;


public class RealizarCompraSteps {
    private final String nombre_actor = "Axel";

    @Cuando("realizo los pasos para comprar una mascota {string} con una tarjeta {string} cuyo numero es {string}")
    public void realizo_los_pasos_para_comprar_una_mascota_con_una_tarjeta_cuyo_numero_es(String mascota, String tipo_tarjeta, String nro_tarjeta) {
        OnStage.theActor(this.nombre_actor).attemptsTo(
                RealizarCompraTask.con(mascota, tipo_tarjeta, nro_tarjeta)
        );
    }

    @Entonces("se visualiza el mensaje {string}")
    public void se_visualiza_el_mensaje(String mensaje) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("Mensaje de compra exitosa",
                        MensajeCompra.contenidoMensaje(),
                        StringContains.containsString(mensaje)
                )
        );
    }
}
