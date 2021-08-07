package preguntas;

import iu.PaginaPrincipal;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class MensajeErrorIniciarSesion {
    public static Question<String> contenidoMensaje() {
        return actor -> TextContent.of(PaginaPrincipal.LBL_ERROR)
                .viewedBy(actor).asString();
    }
}
