package preguntas;

import iu.OrdenDeCompra;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class MensajeCompra {
    public static Question<String> contenidoMensaje() {
        return actor -> TextContent.of(OrdenDeCompra.LBL_COMPRA)
                .viewedBy(actor).asString();
    }
}
