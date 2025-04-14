package co.siigo.qastaging.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.siigo.qastaging.userInterfaces.UsuariosUI.TXT_PERFIL_TERCEROS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CrearCliente implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
       actor.attemptsTo(
               WaitUntil.the(TXT_PERFIL_TERCEROS, isVisible()).forNoMoreThan(20).seconds()
       );
        return TXT_PERFIL_TERCEROS.resolveFor(actor).isVisible();
    }
    public static CrearCliente crearCliente() {
        return new CrearCliente();
    }
}
