package co.siigo.qastaging.userInterfaces;

import co.siigo.qastaging.utils.ShadowRootTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class HomeUI {

    public static final By SHADOW_HOME = By.cssSelector("#layout-navbar > header-root > generalheader > siigo-header-molecule");
    public static final By SHADOW_BANNER = By.cssSelector("ul.nav-wrap-right > li > siigo-button-atom");

    public static final By BTN_CREAR = By.cssSelector("button");
    public static final By BTN_CLIENTES  = By.cssSelector("a[data-value='Clientes']");

    public static WebElement getBTNCrear_Home() {
        SearchContext firstShadow = ShadowRootTarget.getShadowRoot(SHADOW_HOME);
        WebElement secondShadow = firstShadow.findElement(SHADOW_BANNER);
        SearchContext secondShadow_a = secondShadow.getShadowRoot();
        return secondShadow_a.findElement(BTN_CREAR);
    }
    public static WebElement getTxtBanner(){
        return ShadowRootTarget.getShadowRoot(SHADOW_HOME).findElement(By.cssSelector("div.company-header-title"));
    }

    public static WebElement getBTNCliente_Home() {
        return ShadowRootTarget.getShadowRoot(SHADOW_HOME).findElement(By.cssSelector("a[data-value='Clientes']"));
    }


}
