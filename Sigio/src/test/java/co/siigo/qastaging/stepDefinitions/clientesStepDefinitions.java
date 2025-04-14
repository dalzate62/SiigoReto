package co.siigo.qastaging.stepDefinitions;

import co.siigo.qastaging.Questions.CrearCliente;
import co.siigo.qastaging.interations.Navega;
import co.siigo.qastaging.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.siigo.qastaging.Questions.CancelarCliente.cancelar;
import static co.siigo.qastaging.Questions.CrearCliente.crearCliente;
import static co.siigo.qastaging.tasks.BotonCrear.botonCrear;
import static co.siigo.qastaging.tasks.CrearUsuario.crearUsuario;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class clientesStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^el usuario ingresa con (.*) y (.*) (.*)$")
    public void elUsuarioIngresaConCorreoYContrasena(String correo, String contrasena, String ambiente) {
        theActorCalled("Actor").wasAbleTo(Navega.Pagina(ambiente));
        theActorInTheSpotlight().attemptsTo(Login.logearUsuario(correo,contrasena));
    }
    @Cuando("el usuario selecciona la funcionalidad de cliente")
    public void elUsuarioSeleccionaLaFuncionalidadDeCliente() {
        theActorInTheSpotlight().attemptsTo(botonCrear());
    }
    @Entonces("el usuario valida la cancelacion de la creacion de otro usuario")
    public void elUsuarioCancelaLaCreacionDeOtroUsuario() {
        theActorInTheSpotlight().should(seeThat(cancelar()));
    }

    @Y("se crea un usuario")
    public void seCreaUnUsuario() {
      theActorInTheSpotlight().attemptsTo(crearUsuario());
    }

    @Entonces("valida que el usuario este creado")
    public void validaQueElUsuarioEsteCreado() {theActorInTheSpotlight().should(seeThat(crearCliente()));}
}
