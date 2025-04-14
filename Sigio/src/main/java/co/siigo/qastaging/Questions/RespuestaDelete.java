package co.siigo.qastaging.Questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RespuestaDelete implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        int statusCode = SerenityRest.lastResponse().statusCode();
        return statusCode == 204;
    }

    public static RespuestaDelete respuestaDelete() {
        return new RespuestaDelete();
    }
}
