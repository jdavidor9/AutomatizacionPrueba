package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.LoginPage;

public class VerificarSesion implements Question<Boolean> {
    public static Question<Boolean> valida() {
        return new VerificarSesion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginPage.lbl_producto.resolveFor(actor).isDisplayed();
    }
}
