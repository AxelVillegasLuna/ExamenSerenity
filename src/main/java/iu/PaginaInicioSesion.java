package iu;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicioSesion {
    public static final Target TXT_USERNAME = Target.the("Caja de texto para ingresar el nombre de usuario")
            .locatedBy("//input[@name='username']");

    public static final Target TXT_PASSWORD = Target.the("Caja de texto para ingresar la contraseña")
            .locatedBy("//input[@name='password']");

    public static final Target BTN_LOGIN = Target.the("Boton para iniciar sesion")
            .locatedBy("//input[@name='signon']");
}
