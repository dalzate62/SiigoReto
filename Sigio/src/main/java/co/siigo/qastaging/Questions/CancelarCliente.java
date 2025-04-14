package co.siigo.qastaging.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.siigo.qastaging.userInterfaces.UsuariosUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CancelarCliente implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_CANCELAR, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_CANCELAR)
        );
        return TXT_LISTA_RESULTADOS.resolveFor(actor).isVisible();
    }

    public static CancelarCliente cancelar() {
        return new CancelarCliente();
    }
}
