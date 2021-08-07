package acciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class SelectDropDownListText implements Interaction {
    private final Target target;
    private final String visibleText;

    public SelectDropDownListText(Target target, String visibleText) {
        this.target = target;
        this.visibleText = visibleText;
    }

    public static Performable textTarget(Target target, String visibleText) {
        return Tasks.instrumented(SelectDropDownListText.class, target, visibleText);
    }

    @Step("{0} selecciona #visibleText en #target")
    public <T extends Actor> void performAs(T theUser) {
        this.target.resolveFor(theUser).selectByVisibleText(this.visibleText);
    }
}
