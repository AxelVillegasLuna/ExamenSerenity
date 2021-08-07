package preguntas;

import iu.PaginaPrincipal;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class MensajeBienvenidaUsuario {
    public static Question<String> contenidoMensaje() {
        return actor -> TextContent.of(PaginaPrincipal.LBL_USERNAME)
                .viewedBy(actor).asString();
    }
}
