package iu;

import net.serenitybdd.screenplay.targets.Target;

public class CatalogoPez {
    public static final Target BTN_EST_21 = Target.the("Boton para añadir al carrito Female Goldfish")
            .locatedBy("//tbody/tr[3]/td[5]/a[1]");

    public static final Target LBL_GOLDFISH = Target.the("Label que muestra el tipo de pez Goldfish")
            .locatedBy("//h2[normalize-space()='Goldfish']");
}
