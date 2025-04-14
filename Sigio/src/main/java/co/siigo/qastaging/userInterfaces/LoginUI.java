package co.siigo.qastaging.userInterfaces;

import co.siigo.qastaging.utils.ShadowRootTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginUI {

    //este codigo es para poder identificar los botones por debajo del shadow
    private static final By SHADOW_HOST_1 = By.cssSelector("input-atom#username");
    private static final By SHADOW_HOST_2 = By.cssSelector("input-atom#current-password");
    public static WebElement getCorreoField() {
        return ShadowRootTarget.getShadowRoot(SHADOW_HOST_1).findElement(By.id("username-input"));
    }

    public static WebElement getContrasenaField() {
        return ShadowRootTarget.getShadowRoot(SHADOW_HOST_2).findElement(By.id("password-input"));
    }
    public static final Target BTN_INGRESAR = Target.the("Boton Ingresar").located(By.id("login-submit"));

    /*normalmente es este codigo
    /*public static final Target LABEL_CORREO = Target.the("Label Correo").located(By.id("username"));
    public static final Target LABEL_CONTRASENA = Target.the("Label Contrasena").located(By.id("password-input"));
    */
}
