package co.siigo.qastaging.stepDefinitions;

import co.siigo.qastaging.interations.ActualizarUsuarioPUT;
import co.siigo.qastaging.interations.EliminarUsuarioDELETE;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.siigo.qastaging.Questions.RespuestaDelete.respuestaDelete;
import static co.siigo.qastaging.Questions.RespuestaGet.respuestaGet;
import static co.siigo.qastaging.Questions.RespuestaPost.respuestaPost;
import static co.siigo.qastaging.Questions.RespuestaPut.respuestaPut;
import static co.siigo.qastaging.interations.ActualizarUsuarioPUT.actualizarUsuarioPUT;
import static co.siigo.qastaging.interations.ConsultarListaUsuariosGET.consultarListarUsuariosGET;
import static co.siigo.qastaging.interations.CrearUsuarioPOST.crearUsuarioPOST;
import static co.siigo.qastaging.interations.EliminarUsuarioDELETE.eliminarUsuarioDelete;
import static co.siigo.qastaging.utils.BaseUrlApi.BASE_URL_API;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class apisStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("el usuario inicia apis")
    public void elUsuarioIniciaApis() {
        theActorCalled("actor");
    }

    @Cuando("^el usuario consulta el listado de usuarios (.*)$")
    public void elUsuarioConsultaElListadoDeUsuarios(String URL) {
        theActorInTheSpotlight().whoCan(CallAnApi.at(BASE_URL_API.toString()));
        theActorInTheSpotlight().attemptsTo(consultarListarUsuariosGET(URL));
    }

    @Entonces("valida el codigo de respuesta Get")
    public void validaElCodigoDeRespuestaGet() {
        theActorInTheSpotlight().should(
                seeThat("El status code es correcto", respuestaGet())
        );
    }

    @Cuando("^el usuario crea un nuevo usuario (.*) (.*) (.*)$")
    public void elUsuarioCreaUnNuevoUsuario(String URL, String nombre, String trabajo) {
        theActorInTheSpotlight().whoCan(CallAnApi.at(BASE_URL_API.toString()));
        theActorInTheSpotlight().attemptsTo(crearUsuarioPOST(URL,nombre,trabajo));
    }
    @Entonces("valida el codigo de repuesta Post")
    public void validaElCodigoDeRepuestaPost() {
        theActorInTheSpotlight().should(seeThat("el status code es correcto", respuestaPost()));
    }

    @Cuando("^el usuario actualiza un usuario (.*) (.*) (.*)$")
    public void elUsuarioActualizaUnUsuario(String URL, String nombre, String trabajo) {
        theActorInTheSpotlight().whoCan(CallAnApi.at(BASE_URL_API.toString()));
        theActorInTheSpotlight().attemptsTo(actualizarUsuarioPUT(URL,nombre,trabajo));
    }
    @Entonces("valida el codigo de repuesta Put")
    public void validaElCodigoDeRepuestaPut() {
        theActorInTheSpotlight().should(seeThat("el status code es correcto", respuestaPut()));
    }
    @Cuando("^el usuario elimina el usuarios creado (.*)$")
    public void elUsuarioEliminaElUsuariosCreado(String URL) {
        theActorInTheSpotlight().whoCan(CallAnApi.at(BASE_URL_API.toString()));
        theActorInTheSpotlight().attemptsTo(eliminarUsuarioDelete(URL));
    }
    @Entonces("valida el codigo de respuesta Delete")
    public void validaElCodigoDeRespuestaDelete() {
        theActorInTheSpotlight().should(seeThat("el status code es correcto", respuestaDelete()));
    }

}
