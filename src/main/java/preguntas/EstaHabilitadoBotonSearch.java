package preguntas;

import iu.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;

public class EstaHabilitadoBotonSearch implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Enabled.of(PaginaPrincipal.BTN_SEARCH)
                .viewedBy(actor)
                .resolve();
    }
}
