package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginPage;
public class DigitarDatos implements Task {
    private final String user;
    private final String password;

    public DigitarDatos(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public static DigitarDatos llenar(String user, String password) {
        return Tasks.instrumented(DigitarDatos.class,user,password);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(LoginPage.TXT_USERLOGIN),
                Enter.theValue(password).into(LoginPage.TXT_USERPASS),
                Click.on(LoginPage.BTN_LOGIN)
        );
}
}
