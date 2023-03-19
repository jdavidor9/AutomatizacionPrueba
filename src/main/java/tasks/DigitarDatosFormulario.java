package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromBy;
import userinterfaces.FormularioPage;


public class DigitarDatosFormulario implements Task {


    private final String requeried;
    private final String select;

    public DigitarDatosFormulario(String requeried, String select) {
        this.requeried = requeried;
        this.select = select;
    }


    public static DigitarDatosFormulario llenar(String requeried, String select) {

        return Tasks.instrumented(DigitarDatosFormulario.class,requeried,select);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormularioPage.BTN_FORM),
                Click.on(FormularioPage.BTN_FORM_VALIDATION),
                Enter.theValue(requeried).into(FormularioPage.INPUT_REQUERIED)

        );
    }
}
