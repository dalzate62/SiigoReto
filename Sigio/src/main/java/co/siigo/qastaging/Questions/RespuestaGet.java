package co.siigo.qastaging.Questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RespuestaGet implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        int statusCode = SerenityRest.lastResponse().statusCode();
        return statusCode == 200;
    }

    public static RespuestaGet respuestaGet() {
        return new RespuestaGet();
    }
}
