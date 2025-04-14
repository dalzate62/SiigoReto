package co.siigo.qastaging.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.siigo.qastaging.userInterfaces.HomeUI.getTxtBanner;
import static co.siigo.qastaging.userInterfaces.UsuariosUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class CrearUsuario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(TXT_CREAR_UN_TERCERO, isVisible())
                .forNoMoreThan(30).seconds();
        getTxtIdentificacion().sendKeys("123456789");
        getTxtNombre().sendKeys("prueba");
        getTxtApellido().sendKeys("prueba");
        getClickCiudad().click();
        getSearchCiudad().sendKeys("Bogota");
        getOpcionCiudad().click();
        actor.attemptsTo(
                Scroll.to(BTN_GUARDAR).andAlignToBottom(),
                Click.on(BTN_GUARDAR)
        );
    }

    public static Performable crearUsuario(){
        return Tasks.instrumented(CrearUsuario.class);
    }
}
