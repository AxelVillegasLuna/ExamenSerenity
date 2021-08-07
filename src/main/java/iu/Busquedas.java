package iu;

import net.serenitybdd.screenplay.targets.Target;

public class Busquedas {
    public static final Target TBL_FISH = Target.the("Tabla de resultados de peces")
            .locatedBy("//div[@id='Catalog']//table");

    public static final Target LINK_FISH_CHINA = Target.the("Link para el pez de China")
            .locatedBy("//a[normalize-space()='Fresh Water fish from China']");
}
