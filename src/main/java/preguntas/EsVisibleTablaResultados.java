package preguntas;

import iu.Busquedas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class EsVisibleTablaResultados implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(Busquedas.TBL_FISH)
                .viewedBy(actor)
                .resolve();
    }
}
