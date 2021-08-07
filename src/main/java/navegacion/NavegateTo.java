package navegacion;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavegateTo {

    public static Performable paginaPrincipal() {
        return Task.where("{0} abre la pagina principal de Pet Store",
                Open.browserOn().the(PaginaPrincipal.class)
        );
    }
}