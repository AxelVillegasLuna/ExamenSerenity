package preguntas;

import iu.PaginaPrincipal;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ContenidoTextboxBusqueda {
    public static Question<String> contenidoTextboxBusqueda() {
        return actor -> TextContent.of(PaginaPrincipal.TXT_BUSQUEDA)
                .viewedBy(actor).asString();
    }
}
