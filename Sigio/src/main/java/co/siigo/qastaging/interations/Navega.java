package co.siigo.qastaging.interations;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Navega implements Interaction {
    private String ambiente;

    public Navega (String ambiente){this.ambiente = ambiente;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().thePageNamed("pages.".concat(ambiente)));
    }
    public static Performable Pagina(String ambiente){
        return Tasks.instrumented(Navega.class, ambiente);
    }
}
