package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioPage {

    public static final Target BTN_FORM = Target.the("Lista general de Form").
            located(By.xpath("//*[@id='menu']/li[6]/a/span[1]"));

    public static final Target BTN_FORM_VALIDATION = Target.the("Lista Form Validation").
            located(By.xpath("//*[@id='menu']/li[6]/ul/li[2]/a"));

    public static final Target INPUT_REQUERIED = Target.the("Campo de texto requeried").
            located(By.xpath("//*[@id='req']"));

    public static final Target SELECT_LIST = Target.the("Lista despegable").
            located(By.xpath("//*[@id='sport']"));


}
