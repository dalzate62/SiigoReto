package co.siigo.qastaging.tasks;

import co.siigo.qastaging.userInterfaces.LoginUI;
import net.serenitybdd.markers.IsSilent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.htmlunit.javascript.host.dom.ShadowRoot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import static co.siigo.qastaging.userInterfaces.LoginUI.*;

public class Login implements Task, IsSilent {

    String correo;
    String contrasena;

    public Login (String correo, String contrasena){
        this.correo = correo;
        this.contrasena = contrasena;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        LoginUI.getCorreoField().sendKeys(correo);
        LoginUI.getContrasenaField().sendKeys(contrasena);
        actor.attemptsTo(Click.on(BTN_INGRESAR));
    }
/* normalmente se usuario el actor para interactuar con la tarea
actor.attemptsTo(
        Enter.theValue(correo).into(),
                Enter.theValue(contrasena).into(LABEL_CONTRASENA),
                Click.on(BTN_INGRESAR)
            );*/
    public static Performable logearUsuario(String correo, String contrasena){
        return Tasks.instrumented(Login.class,correo,contrasena);
    }
}
