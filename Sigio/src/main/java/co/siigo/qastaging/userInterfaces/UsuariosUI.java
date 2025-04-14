package co.siigo.qastaging.userInterfaces;

import co.siigo.qastaging.utils.ShadowRootTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UsuariosUI {

    public static final By SHADOW_CONTENIDO_IDENTIFICACION = By.cssSelector("div > div > div:nth-child(1) > div.column.is-5 > div:nth-child(3) > siigo-identification-input-web");
    public static final By SHADOW_CONTENIDO_NOMBRE = By.cssSelector("div > div > div:nth-child(1) > div.column.is-7 > div:nth-child(1) > siigo-textfield-web");
    public static final By SHADOW_CONTENIDO_APELLIDO = By.cssSelector("div > div > div:nth-child(1) > div.column.is-7 > div:nth-child(2) > siigo-textfield-web");
    public static final By SHADOW_CONTENIDO_CiUDAD = By.cssSelector("div > div > div:nth-child(1) > div.column.is-7 > div:nth-child(5) > siigo-autocomplete-web");
    public static Target  BTN_CANCELAR = Target.the("BOTON PARA CANCELAR").located(By.xpath("//*[@id=\"sticky\"]/div[2]/button[1]"));
    public static Target  BTN_GUARDAR = Target.the("BOTON PARA GUARDAR").located(By.xpath("//*[@id=\"sticky\"]/div[2]/button[2]"));
    public static Target TXT_LISTA_RESULTADOS = Target.the("TEXTO DE BUSQUEDA DE TERCEROS").located(By.xpath("//*[@id=\"main\"]/div/app-report-base/div/div[1]/div/div/h2"));
    public static Target TXT_PERFIL_TERCEROS = Target.the("TEXTO DE PERFIL DE TERCEROS").located(By.xpath("//*[@id=\"main\"]/div/app-third-party-view/div/div[1]/div[1]/h2"));

    public static Target TXT_CREAR_UN_TERCERO = Target.the("TEXTO DE CREAR UN TERCERO").located(By.xpath("//*[@id=\"sticky\"]/div[1]/h2"));

    public static WebElement getTxtIdentificacion(){
        return ShadowRootTarget.getShadowRoot(SHADOW_CONTENIDO_IDENTIFICACION).findElement(By.cssSelector("input.mdc-text-field__input"));
    }
    public static WebElement getTxtNombre(){
        return ShadowRootTarget.getShadowRoot(SHADOW_CONTENIDO_NOMBRE).findElement(By.cssSelector("input.mdc-text-field__input"));
    }
    public static WebElement getTxtApellido(){
        return ShadowRootTarget.getShadowRoot(SHADOW_CONTENIDO_APELLIDO).findElement(By.cssSelector("input.mdc-text-field__input"));
    }
    public static WebElement getClickCiudad(){
        return ShadowRootTarget.getShadowRoot(SHADOW_CONTENIDO_CiUDAD).findElement(By.cssSelector("label#labelAutocompleteSelectItemcity"));
    }

    public static WebElement getSearchCiudad(){
        return ShadowRootTarget.getShadowRoot(SHADOW_CONTENIDO_CiUDAD).findElement(By.cssSelector("input.mdc-text-field__input"));
    }

    public static WebElement getOpcionCiudad(){
        return ShadowRootTarget.getShadowRoot(SHADOW_CONTENIDO_CiUDAD).findElement(By.cssSelector("table#tableAutocompletecity > tbody > tr > td"));
    }





}
