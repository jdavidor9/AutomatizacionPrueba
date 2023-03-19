package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.VerificarSesion;
import tasks.AbrirNavegador;
import tasks.DigitarDatos;
import tasks.DigitarDatosFormulario;

import java.util.List;

public class LoginStepDefinitions {


    @Before
    public void iniciarTest(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^El user acceda a la app colorlib\\.com$")
    public void el_user_acceda_a_la_app_colorlib_com() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("User").attemptsTo(AbrirNavegador.abrir());
    }

    @When("^El user ingresa con user password y da click en sign in$")
    public void el_user_ingresa_con_user_password_y_da_click_en_sign_in(List<String> datos) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(DigitarDatos.llenar(datos.get(0), datos.get(1)));
    }

    /*@When("^El user ingresa con \"([^\"]*)\" \"([^\"]*)\" y da click en sign in$")
    public void el_user_ingresa_con_y_da_click_en_sign_in(String user, String password) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(DigitarDatos.llenar(user, password));
    }*/
    @When("^Diligenciamos el formulario de validacion$")
    public void diligenciamos_el_formulario_de_validacion(List<String> datos) {

        OnStage.theActorInTheSpotlight().attemptsTo(DigitarDatosFormulario.llenar(datos.get(0), datos.get(1)));
    }

    @Then("^EL user vera en la pnatalla el dashboard$")
    public void el_user_vera_en_la_pnatalla_el_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarSesion.valida()));

    }
}
