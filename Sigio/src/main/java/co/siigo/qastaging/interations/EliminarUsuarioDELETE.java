package co.siigo.qastaging.interations;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;

public class EliminarUsuarioDELETE implements Interaction {
    private final String URL;

    public EliminarUsuarioDELETE(String URL) {
        this.URL = URL;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Delete.from(URL));
    }

    public static Performable eliminarUsuarioDelete(String URL){
        return Tasks.instrumented(EliminarUsuarioDELETE.class, URL);
    }
}
