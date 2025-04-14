package co.siigo.qastaging.tasks;

import co.siigo.qastaging.userInterfaces.HomeUI;
import co.siigo.qastaging.utils.ShadowRootTarget;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import static co.siigo.qastaging.userInterfaces.HomeUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class BotonCrear implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(getTxtBanner().getText(), isVisible())
                .forNoMoreThan(30).seconds();
        getBTNCrear_Home().click();
        getBTNCliente_Home().click();
    }

    public static Performable botonCrear(){
        return Tasks.instrumented(BotonCrear.class);
    }


}
