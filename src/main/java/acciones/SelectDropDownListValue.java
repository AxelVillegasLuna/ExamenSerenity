package acciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class SelectDropDownListValue implements Interaction {
    private final Target target;
    private final String value;

    public SelectDropDownListValue(Target target, String value) {
        this.target = target;
        this.value = value;
    }

    public static Performable valueTarget(Target target, String value) {
        return Tasks.instrumented(SelectDropDownListValue.class, target, value);
    }

    @Step("{0} selecciona #value en #target")
    public <T extends Actor> void performAs(T theUser) {
        this.target.resolveFor(theUser).selectByValue(this.value);
    }
}
