package definicionPasos;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import navegacion.NavegateTo;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.StringContains;
import preguntas.ContenidoTextboxBusqueda;
import preguntas.EsVisibleTablaResultados;
import preguntas.EstaHabilitadoBotonSearch;
import tareas.RealizarBusquedaTask;

public class RealizarBusquedaSteps {
    private final String nombre_actor = "Axel";

    @Dado("en la pagina principal")
    public void en_la_pagina_principal() {
        OnStage.setTheStage(new OnlineCast());

        OnStage.theActorCalled(this.nombre_actor).attemptsTo(
                NavegateTo.paginaPrincipal()
        );

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("Textbox de busqueda vacio",
                        ContenidoTextboxBusqueda.contenidoTextboxBusqueda(),
                        StringContains.containsString("")
                )
        );

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("Boton de busqueda habilitado",
                        new EstaHabilitadoBotonSearch(),
                        IsEqual.equalTo(Boolean.TRUE)
                )
        );
    }

    @Cuando("busco el tipo de mascota {string}")
    public void busco_el_tipo_de_mascota(String tipo_mascota) {
        OnStage.theActor(this.nombre_actor).attemptsTo(
                RealizarBusquedaTask.con(tipo_mascota)
        );
    }

    @Entonces("se visualiza una tabla de resultados")
    public void se_visualiza_una_tabla_de_resultados() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("La tabla de resultados es visible",
                        new EsVisibleTablaResultados(),
                        IsEqual.equalTo(Boolean.TRUE)
                )
        );
    }
}
