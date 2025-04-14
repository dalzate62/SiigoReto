package co.siigo.qastaging.interations;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Put;

public class ActualizarUsuarioPUT implements Interaction {
    private final String URL;
    private final String nombre ;
    private final String trabajo;

    public ActualizarUsuarioPUT(String URL,String nombre, String trabajo) {
        this.URL = URL;
        this.nombre = nombre;
        this.trabajo = trabajo;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Put.to(URL)
                        .with(requestSpecification -> requestSpecification
                                .body("{\n" +
                                        "    \"name\": \"" + nombre + "\",\n" +
                                        "    \"job\": \""+ trabajo + "\"\n" +
                                        "}")
                        )
        );
        SerenityRest.lastResponse().prettyPrint();
    }
    public static Performable actualizarUsuarioPUT(String URL,String nombre, String trabajo){
        return Tasks.instrumented(ActualizarUsuarioPUT.class,URL,nombre,trabajo);
    }
}
