package co.siigo.qastaging.interations;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ConsultarListaUsuariosGET implements Interaction {

    private final String URL;

    public ConsultarListaUsuariosGET(String URL) {
        this.URL = URL;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(URL)
                .with(requestSpecification -> requestSpecification
                .queryParam("page","2")));
        SerenityRest.lastResponse().prettyPrint();
    }

    public static Performable consultarListarUsuariosGET(String URL){
        return Tasks.instrumented(ConsultarListaUsuariosGET.class, URL);
    }
}
